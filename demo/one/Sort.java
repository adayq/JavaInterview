package one;

/**
 * @author Lenovo
 */
public class Sort {

    public static Integer[] a = new Integer[]{1, 10, 3, 6, 2, 7, 5, 4};

    /**
     * 快速排序
     * @return
     */
    private static Integer[] sort1() {
        return a;
    }

    private static Integer[] sort2() {
        return a;
    }

    private static Integer[] sort3() {
        return a;
    }

    public static void main(String[] args) {
        Integer[] temp = sort1();
        print(temp);
    }

    private static void print(Integer[] temp) {
        System.out.print("开始排序：");
        for (Integer c : temp) {
            System.out.print(c);
            System.out.print("__");
        }
    }
}
