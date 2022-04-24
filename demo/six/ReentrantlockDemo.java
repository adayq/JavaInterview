package six;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Lenovo
 */
public class ReentrantlockDemo {

    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 1 ; i <100 ; i ++ ){
                    reentrantLock.lock();
                    System.out.println("数数:" + i);
                    reentrantLock.unlock();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = -1 ; i > -100 ; i -- ){
                    reentrantLock.lock();
                    System.out.println("数数:" + i);
                    reentrantLock.unlock();
                }
            }
        }).start();
    }
}
