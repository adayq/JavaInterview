package six;

/**
 * @author Lenovo
 */
public class FutureData implements Data {

    /**
     * 内部需要维护RealData
     */
    protected RealData realdata = null;

    protected boolean isReady = false;

    public synchronized void setRealData(RealData realdata) {
        if (isReady) {
            return;
        }
        this.realdata = realdata;
        isReady = true;
        //RealData已经被注入，通知getResult()
        notifyAll();
    }

    /**
     * 会等待RealData构造完成
     */
    @Override
    public synchronized String getResult() {
        while (!isReady) {
            try {
                //一直等待，直到RealData被注入   线程进入锁的等待队列
                wait();
            } catch (InterruptedException e) {
            }
        }
        //真正需要的数据从RealData获取
        return realdata.result;
    }
}