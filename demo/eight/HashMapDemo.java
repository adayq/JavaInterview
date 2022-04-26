package eight;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        new Thread(()->{hashMap.put("测试1","测试");}).start();
        new Thread(()->{hashMap.put("测试2","测试");}).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(hashMap.keySet().toString());

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("线程安全","a");
        concurrentHashMap.get("线程安全");
    }
}
