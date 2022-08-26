package eight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ceshi");

        HashMap map = new HashMap();
        map.put("ceshi","ceshi");

        System.out.println(list.toString());
        System.out.println(map.toString());
    }
}
