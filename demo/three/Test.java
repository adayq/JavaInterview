package three;

/**
 * 最长回文字串
 * @author Lenovo
 */
public class Test {

    public static void main(String[] args) {
        String temp = "dsfsdhadhfkdsdsfsdhadhdsfsdhadhfkddsfsdhadhfkdsahfksadhdsfsd" +
                "hadhfkdsahfksadhfksddsfsdhadhfkdsahfksadhfksdhfusdihfksjadfhksadjkdsa" +
                "hfdsjkhfksdhffhiawoeuruihweiyrtiuoncsdbfzmbfkhfioaewncfhskdsfsdhadhfkds" +
                "ahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuonc" +
                "sdbfzmbfkhfioaewncfhskhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihw" +
                "eiyrtiuoncsdbfzmbfkhfioaewncf啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊hskdsfsdhadhfkdsahfksadhfksdhfusdihfksjadfhk" +
                "sadjkdsahfdsjkhfksdasdfasfffffffffffdfasdfhffhiawoeuruihweiyrtiuoncsdbfzmbfkhfioaewncfhskdsfsdha" +
                "sadjkdsahfdsjkhfksdasdfasffffdfasdfhffhiafffffffwoeuruihweiyrtiuoncsdbfzmbfkhfioaewncfhskdsfsdha" +
                "dhfkdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrt" +
                "iuoncsdbfzmbfkhfioaewncfhskdsfsdhadhfkdsahfksadhfksdhfusdihfksjadsfsdhadhf" +
                "iuoncsdbfzmbfkhfioaewncfhskdsfsdhadhfkdsahfksadhfksdhfusdihfksjadsfsdhadhf" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfk水水水水水水水水水水水水水水水水水水水sjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "kdsahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuon" +
                "csdbfzmbfkhfioaewncfhskdsfsdhadhfkfasdfadsfaefqwewefasddcvaSawedsahfksadhfksdhfusdihfksjadfhksadjkdsahf" +
                "dsjkhfksdhffhiawoeuruihweiyrtiuoncsdbfzmbfkhfioaewncfhskdfhksadjkdsahfdsjkh" +
                "fksdhffhiawoeuruihweiyrtiuoncasdfasfdasdfasfdaasfsdbfzmbfkhfioaewncfhskfdsfsdhadhfkdsahfksadhfk" +
                "sdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuoncsdbfzmbfkhfioa" +
                "ewncfhskksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuoncsdbfzm" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "bfkhfioaewncfhsksahfksadhfksdhfusdihfksjadfhksadjkdsahfdsjkhfksdhffhiawoeurui" +
                "hweiyrtiuoncsdbfzmbfkhfioaewncfhskfkdsahfksadhfksdhfusdihfksjadfhksadjkdsahfd" +
                "sjkhfksdhffhiawoeuruihweiyrtiuoncsdbfzmbfkhfioaewncfhskahfksadhfksdhfusdihfksj" +
                "adfhksadjkdsahfdsjkhfksdhffhiawoeuruihweiyrtiuoncsdbfzmbfkhfioaewncfhsk";
        String tempA = "aaa";
        System.out.println(getStr(temp));
        System.out.println(longestPalindrome(temp));
        System.out.println(longestPalindrome1(temp));

    }

    static String getStr(String s){
        Long start = System.currentTimeMillis();
        char[] a = s.toCharArray();
        if (a.length<2){
            return "";
        }
        //最优子结构
        if (a.length == 2 && a[0] == a[1]){
            return s;
        }
        String result = "";
        for (int i = 0 ; i < a.length-2;i++){
            char m = a[i];
            char n = a[i+1];
            char o = a[i+2];
            String temp = "";
            if (m == n){
                for (int b = 0 ; b < i; b++){
                    if (i+1+b>=a.length){
                        break;
                    }
                    if (a[i-b] == a[i+1+b]){
                        temp = a[i-b] + temp + a[i+1+b];
                    }else {
                        break;
                    }
                }
            }
            if (m == o){
                temp = n+"";
                for (int b = 0 ; b < i+1; b++){
                    if (i+2+b>=a.length){
                        break;
                    }
                    if (a[i-b] == a[i+2+b]){
                        temp = a[i-b] + temp + a[i+2+b];
                    }else {
                        break;
                    }
                }
            }
            if(temp.length()>result.length()){
                result = temp;
            }
        }
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
        return result;
    }


    public static String longestPalindrome(String s) {
        Long start = System.currentTimeMillis();
        if (s.isEmpty()) {
            return s;
        }
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int left = 0;
        int right = 0;
        for (int i = n - 2; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) &&( j-i<3||dp[i+1][j-1]);//小于3是因为aba一定是回文
                if(dp[i][j]&&right-left<j-i){
                    left=i;
                    right=j;
                }
            }
        }
        String result = s.substring(left,right+1);
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
        return result;
    }

    public static String longestPalindrome1(String s) {
        Long start = System.currentTimeMillis();
        int len = s.length();
        if (len == 0) {
            return "";
        }
        if (len == 1) {
            return s;
        }
        int begin = 0;
        int end = 0;
        boolean[][] resultTable = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            resultTable[i][i] = true;
            if ((i < len - 1)){
                if (s.charAt(i) == s.charAt(i + 1)) {
                    resultTable[i][i + 1] = true;
                    begin = i;
                    end = i + 1;
                }
            }
        }

        for (int i = 3; i <= len ; i++) {
            for (int j = 0; j < len - i + 1; j++) {
                int tempEnd = i + j - 1;
                resultTable[j][tempEnd] = resultTable[j + 1][tempEnd - 1] && s.charAt(j) == s.charAt(tempEnd);
                if (resultTable[j][tempEnd] == true) {
                    begin = j;
                    end = i + j;
                }
            }
        }


        String result = s.substring(begin, end);
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime-start);
        return result;
    }


}
