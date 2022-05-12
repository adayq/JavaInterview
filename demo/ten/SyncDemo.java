package ten;

public class SyncDemo {

    public static void main(String[] args) {
        SyncDemo syncDemo = new SyncDemo();
    }

    public SyncDemo(){
        synchronized (this){
            System.out.println("1");
            System.out.println("同步代码块");
            System.out.println("0");
        }

    }
}
