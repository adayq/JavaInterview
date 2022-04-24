package six;

public class StringTest {
    public static void main(String[] args) {
        String st = "123456";
        char[] ch =  st.toCharArray();
        String result = "";
        for (int a = 0 ; a < ch.length ;a++ ){
            result = result + ch[ch.length - a -1];
        }
        System.out.println(result);
        String ct = "@潘宜天";
        char c = ct.charAt(0);
        System.out.println(c);

    }
}
