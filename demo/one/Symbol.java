package one;

public class Symbol {

    public static void main(String[] args) {
        String temp = "中国人";
        char[] src = temp.toCharArray();
        char[] result = new char[temp.length()];
        for (int a = 0 ; a <temp.length() ; a ++){
            result[a] = (char)(src[a] & 0xff);
        }

        System.out.println(result);

    }
}
