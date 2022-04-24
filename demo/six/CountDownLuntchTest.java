package six;

import java.util.concurrent.CountDownLatch;

public class CountDownLuntchTest {

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        CountDownLatch downLatch = new CountDownLatch(2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 逻辑执行五秒
                System.out.println("开始a任务。。。");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("a任务结束。。。");
                downLatch.countDown();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 逻辑执行八秒
                System.out.println("开始b任务。。。");
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("b任务结束。。。");
                downLatch.countDown();
            }
        }).start();
        try {
            downLatch.await();
            System.out.println("任务执行完毕。耗时：" + (System.currentTimeMillis() - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
