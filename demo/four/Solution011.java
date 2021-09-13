package four;

public class Solution011 {
    public static void main(String[] args) {
        int a = 22;
        int b = 33;
        System.out.println(a ^ b);
        System.out.println(a ^ b);
        System.out.println(a ^ b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
