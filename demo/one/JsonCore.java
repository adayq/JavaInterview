package one;

import com.alibaba.fastjson.JSON;

/**
 * @author Lenovo
 */
public class JsonCore {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "张三";
        String jsonOutput= JSON.toJSONString(cat);
        System.out.println(cat);
    }
}
