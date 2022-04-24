package six;

import java.util.concurrent.CountDownLatch;

public class Test {

    private static int x = 0, y = 0, a = 0, b = 0;

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < Long.MAX_VALUE; i++) {
            x = 0;
            y = 0;
            a = 0;
            b = 0;
            CountDownLatch countDownLatch = new CountDownLatch(2);

            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    x = b;
                    countDownLatch.countDown();
                }
            });

            Thread two = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    y = b;
                    countDownLatch.countDown();
                }
            });

            one.start();
            two.start();
            countDownLatch.await();
            if (x == 0 && y == 0) {
                System.err.println("第 " + i + "次执行，数据执行错误：" + "x 为 " + x + "  y 为 " + y);
                break;
            }
        }
    }
}
