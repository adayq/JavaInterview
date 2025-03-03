package four;

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 * @author Lenovo
 */
public class Solution014 {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(9));
    }

    public static boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        return 1162261467%n==0;
    }
}
