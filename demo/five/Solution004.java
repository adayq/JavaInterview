package five;

/**
 * @author Lenovo
 */
public class Solution004 {

    public static void main(String[] args) {
        //0000 0000 0000 0000 0000 0000 0000 1010
        int a = 10;
        //0000 0000 0000 0000 0000 0000 0000 1111
        int b = 15;
        //1111 1111 1111 1111 1111 1111 1111 0101 反码
        //1111 1111 1111 1111 1111 1111 1111 0110 补码
        //取反
        //
        System.out.println(~a);
        System.out.println(a^b);
        System.out.println(b|a);
        System.out.println(a&b);
        System.out.println(10+(-10));

    }

}
