package three;

import java.util.ArrayList;
import java.util.List;

public class LongTest {
    public static void main(String[] args) {
        Long[] a = new Long[1];
        a[0] = 1L;
        System.out.println(a.toString()+"");
        List<Long> longs = new ArrayList<>();
        longs.add(1L);
        System.out.println(longs.toString());
    }
}
