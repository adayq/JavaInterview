package five;

/**
 * @author Lenovo
 */
public class Solution002 {

    static int a = 100;

    public static void main(String[] args) {
        a = ~a;
        int b = 128;
        b = b >> 1;
        System.out.println(a);
        System.out.println(b);
    }
}
