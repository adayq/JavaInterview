package one;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
        String oldString = "adfaadfa3156464.1316adsfa卧.槽dfa4adf1af32as1df32a1sd56fa1sd32f1a321fdsf2a31";
        String[] test = oldString.split("[^0-9|.]");
        List<BigDecimal> list = new ArrayList<>();
        for (String s :test){
            if (s!=null && !s.isEmpty() && !".".equals(s)){
                BigDecimal temp = new BigDecimal(s);
                list.add(temp);
            }
        }
        System.out.println(list);


        String regin="\\d+(?:\\.\\d+)?";
        Matcher m=Pattern.compile(regin, Pattern.MULTILINE).matcher(oldString);
        List<String> result=new ArrayList<>();
        while (m.find()){
            result.add(m.group());
        }
        System.out.println(result);

        String regin1="[^0-9|.]";
        Matcher m1=Pattern.compile(regin1, Pattern.MULTILINE).matcher(oldString);
        List<String> result1=new ArrayList<>();
        while (m1.find()){
            result.add(m1.group());
        }
        System.out.println(result1);

    }
}
