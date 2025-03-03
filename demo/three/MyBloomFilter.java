package three;

import java.util.BitSet;

/**
 * @author Lenovo
 */
public class MyBloomFilter {
    /**
     * 2 << 26表示32亿个比特位
     */
    private static final int DEFAULT_SIZE = 2 << 29;
    private static final int[] seeds = new int[]{3, 5, 7, 11, 13, 19, 23, 37};
    /**
     * 这么大存储在BitSet
     */
    private BitSet bits = new BitSet(DEFAULT_SIZE);
    private SimpleHash[] func = new SimpleHash[seeds.length];

    public static void main(String[] args) {
        //可疑网站
        String value = "www.baidu.com";
        MyBloomFilter filter = new MyBloomFilter();
        //加入之前判断一下
        System.out.println(filter.contains(value));
        filter.add(value);
        //加入之后判断一下
        System.out.println(filter.contains(value));
    }

    /**
     * 构造函数
     */
    public MyBloomFilter() {
        for (int i = 0; i < seeds.length; i++) {
            func[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
        }
    }

    /**
     * 添加网站
     *
     * @param value
     */
    public void add(String value) {
        for (SimpleHash f : func) {
            bits.set(f.hash(value), true);
        }
    }

    /**
     * 判断可疑网站是否存在
     */
    public boolean contains(String value) {
        if (value == null) {
            return false;
        }
        boolean ret = true;
        for (SimpleHash f : func) {
            //核心就是通过“与”的操作
            ret = ret && bits.get(f.hash(value));
        }
        return ret;
    }
}
