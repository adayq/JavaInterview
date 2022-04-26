package six;

import java.util.concurrent.CompletableFuture;

/**
 * @author Lenovo
 */
public class CompletableDemo {

    private static Object object = new Object();

    public static void main(String[] args) throws Exception {
        String talk1 = "小王";
        String talk2 = "小李";

        long start = System.currentTimeMillis();
        CompletableFuture.supplyAsync(CompletableDemo::input)
                .thenAccept(
                        result -> {
                            System.out.println(result);
                            synchronized (object) {
                                object.notifyAll();
                            }
                        }
                )
                .exceptionally(throwable -> {
                    throwable.printStackTrace();
                    return null;
                });
        synchronized (object) {
            object.wait();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (object) {
                        /**
                         * 线程进入等待队列
                         */
                        object.wait();
                    }
                    Thread.sleep(1000);
                    System.out.println("是谁在说话：" + talk1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    synchronized (object) {
                        object.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("是谁在说话：" + talk2);
            }
        }).start();

        Thread.sleep(4000);
        System.out.println("程序执行完成,耗时：" + (System.currentTimeMillis() - start));
    }

    public static String input() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String result = "这个人说了五秒钟";
        return result;
    }


}
