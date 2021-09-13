package three;

/**
 * @author Lenovo
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(forTest());
    }
    static int forTest(){
        int i = 0;
        for(;;){
            i++;
            //递归的退出边界
            if (i == 100){
                break;
            }
        }
        return i;
    }
}
