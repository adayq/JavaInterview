package five;

public class DoubleTest {


        public static void main(String[] args) {
            float a = 3.0f;
            float c = 2.96f;
            double e = 3.0000000000000000000000000000000;
            float d = a - c; //0.040000000000000036    0.03999996
            float d2 = 0.04f - 0.039f;
            System.out.println(d); // 输出 0.3999999999999999
            System.out.println(d2); // 输出 1.1102230246251565E-16
            System.out.println(d2 > 0); // 输出true
        }


}
