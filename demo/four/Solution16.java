package four;

public class Solution16 {

    public static void main(String[] args) {
        String s = "lsdlhsp";
        int[] dp = new int[3];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'l') {
                dp[0]++;
            } else if (ch == 's') {
                dp[1] += dp[0];
            } else if (ch == 'p') {
                dp[2] += dp[1];
            }
        }
        System.out.println(dp[2]);
    }
}

//execabort
