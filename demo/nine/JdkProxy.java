package nine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Lenovo
 */
public class JdkProxy implements InvocationHandler {

    Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    /**
     * 核心
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk dynamic before ...");
        Object object = method.invoke(target,args);
        System.out.println("jdk dynamic after ...");
        return object;
    }

}
