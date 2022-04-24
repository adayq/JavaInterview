package seven;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(100);

        System.out.println(atomicInteger.addAndGet(2));    //102
        System.out.println(atomicInteger);                      //102

        System.out.println(atomicInteger.getAndAdd(2));    //102
        System.out.println(atomicInteger);                      //104

        System.out.println(atomicInteger.incrementAndGet());    //105
        System.out.println(atomicInteger);                      //105

        System.out.println(atomicInteger.getAndIncrement());    //105
        System.out.println(atomicInteger);                      //106

        System.out.println(atomicInteger.decrementAndGet());    //105
        System.out.println(atomicInteger);                      //105

        System.out.println(atomicInteger.getAndDecrement());    //105
        System.out.println(atomicInteger);                      //104


/*        new Thread(() -> {
            int count = 1;
            for (int i = 0; i < 1000; i++) {
                ++count;
                System.out.println(count);
            }
            System.out.println(count);
        }).start();*/

        AtomicInteger au = new AtomicInteger(0);
        for (int i = 1; i < 1000; i++) {
            new Thread(() -> {
                au.getAndAdd(1);
            }).start();
        }
        try {
            Thread.sleep(1000);
            System.out.println("auto 数据 ：" + au);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
