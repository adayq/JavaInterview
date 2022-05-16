package eleven;

/**
 * @author Lenovo
 */
public class   VolatileExample {

    /**
     * main 方法作为一个主线程
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // 开启线程
        myThread.start();

        // 主线程执行
        for (; ; ) {
            if (myThread.isFlag()) {
                System.out.println("主线程访问到 flag 变量");
            }
        }
    }

}

