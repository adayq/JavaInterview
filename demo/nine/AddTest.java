package nine;

public class AddTest {

    public static void main(String[] args) {

        int i=1;
        i=(i++)+(i++)+(i++)+(i++);
        System.out.println(i);

        int j=1;
        j=(++j)+(++j)+(++j)+(++j);
        System.out.println(j);
    }
}
