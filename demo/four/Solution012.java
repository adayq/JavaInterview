package four;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 */

public class Solution012 {
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
        for (char temp : s){
            System.out.print(temp);
        }
    }

    public static void reverseString(char[] s) {
        for(int a = 0 ; a<s.length/2;a++){
            char temp = s[a];
            s[a] = s[s.length-a-1];
            s[s.length-a-1] = temp;
        }
    }
}
