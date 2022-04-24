package six;

import java.util.ArrayList;
import java.util.List;

public class LongStringTest {


    public static void main(String[] args) {

        List<Long> longs = new ArrayList<>();
        longs.add(1L);
        longs.add(222L);
        longs.add(2222L);
        String temp = longs.toString();
        System.out.println(temp);

    }
}
