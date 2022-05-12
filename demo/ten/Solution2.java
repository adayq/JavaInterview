package ten;

/**
 * @author Lenovo
 */
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(threePeople(2));
    }

    /**
     * 3、4、5、6、7
     * 求第三次 只三个人的做核酸的一天
     */
    public static Integer threePeople(int day) {
        int a = 1;
        while (true) {
            int num = 0;
            a++;
            if (a % 3 == 0) {
                num++;
            }
            if (a % 4 == 0) {
                num++;
            }
            if (a % 5 == 0) {
                num++;
            }
            if (a % 6 == 0) {
                num++;
            }
            if (a % 7 == 0) {
                num++;
            }
            if (num == 3) {
                day--;
            }
            if (day <= 0) {
                return a;
            }
        }
    }
}
