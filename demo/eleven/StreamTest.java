package eleven;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        // 找出最长的单词
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        Optional<String> longest = stream.reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        //Optional<String> longest = stream.max((s1, s2) -> s1.length()-s2.length());
        System.out.println(longest.get());
        // 求单词长度之和
        Stream<String> stream1 = Stream.of("I", "love", "you", "too");
        Integer lengthSum = stream1.reduce(0, (sum, str) -> sum + str.length(), (a, b) -> a + b);
        System.out.println(lengthSum);
    }
}
