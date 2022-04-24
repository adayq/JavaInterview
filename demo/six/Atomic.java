package six;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Lenovo
 */
public class Atomic {
    static int num = 1;

    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(1);
        Object o1 = new Object();
        boolean b = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    synchronized (o1) {
                        try {
                            ++num;
                            System.out.println(Thread.currentThread().getName() + " ：" + num);
                            o1.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "a线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    synchronized (o1) {
                        num++;
                        System.out.println(Thread.currentThread().getName() + " ：" + num);
                        o1.notify();
                    }
                    try {
                        //让出 cpu 执行权限
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }, "b线程").start();
    }



}
