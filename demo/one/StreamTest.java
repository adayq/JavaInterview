package one;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        System.out.println("empty:" + Stream.empty().collect(Collectors.toList()));
        System.out.println("ofInteger:" + Stream.of(new Integer[]{1, 2, 3}).max(Comparable::compareTo).get());
        System.out.print("ofString:");
        Stream.of("2", "3", "2", "1", "1").distinct().sorted().forEach(System.out::print);
        System.out.println();
        System.out.println(Stream.generate(() -> "" + Math.random()).limit(2).collect(Collectors.joining()));
        System.out.println(Stream.iterate(BigInteger.valueOf(0L), x -> x.add(BigInteger.valueOf(1L)))
                //注意，这里的skip和limit的顺序调换后的结果是不同的
                .skip(3).limit(10)
                .filter(x -> x.longValue() > 6 && x.longValue() < 14)
                .collect(Collectors.toList())
        );
        System.out.println(Arrays.stream(new String[]{"a", "b", "c"}).collect(Collectors.joining()));
        System.out.println(Arrays.stream(new Integer[]{1, 2, 4, 6, 7}, 1, 4).count());

        //map
        System.out.println(Stream.of(1, 2, 3, 4).map(x -> x * 2).collect(Collectors.toList()));
        IntStream intStream = Stream.of("1", "2", "3").mapToInt(Integer::parseInt);
        System.out.println(intStream.toArray()[2]);
        System.out.println(Stream.of(new String[]{"1", "2"}, new String[]{"2", "4"}, new String[]{"3"}).flatMap(x -> Stream.of(x)).collect(Collectors.toSet()));


        int f = 201;
        int b = 10;
        System.out.println(Math.ceil(f/b));

        List<String> result = new ArrayList<>();
        for (int i = 1 ;i <500; i ++){
            result.add("ceshi"+ i);
        }
        if (result.size()>0){
            //一次500条
            int applyIdSelectSize = 100;
            int limit = (result.size() + applyIdSelectSize - 1) / applyIdSelectSize;
            //分成limit次发请求到数据库，in（）操作时   可以把多条数据分割成多组请求
            Stream.iterate(0, n -> n + 1).limit(limit).forEach(a -> {
                //获取后面1000条中的前500条
                // 拿到这个参数的流的 （a * applyIdSelectSize）后面的数据  .limit（applyIdSelectSize）->后面数据的500条  .collect(Collectors.toList()->组成一个toList
                List<String> paperEntityList = result.stream().skip(a * applyIdSelectSize).limit(applyIdSelectSize).collect(Collectors.toList());
                System.out.println(paperEntityList.size());
            });
            System.out.println("数据解析入库成功！！");
        }


    }
}
