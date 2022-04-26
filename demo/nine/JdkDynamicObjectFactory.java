package nine;

import java.lang.reflect.Proxy;

/**
 * @author Lenovo
 */
public class JdkDynamicObjectFactory {

    public static <T> T getProxyObject(Class clazz){
        JdkProxy proxy = null;
        try {
            proxy = new JdkProxy(clazz.getDeclaredConstructor().newInstance());
            //jdk dynamic proxy 只能针对实现了接口的类进行代理， newProxyInstance 函数需要的参数就可以看出
            T proxied = (T) Proxy.newProxyInstance(JdkDynamicObjectFactory.class.getClassLoader(),
                    clazz.getInterfaces(),proxy
                    );
            return proxied;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        InterfaceDemo interfaceImpl = JdkDynamicObjectFactory.getProxyObject(InterfaceImpl.class);
        interfaceImpl.getName();
    }

}
