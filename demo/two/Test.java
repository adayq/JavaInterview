package two;


/**
 * @author Lenovo
 */
public class Test {

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getClass().getClassLoader());
        son.setAge(1);
        son.setName("儿子");
        son.setSex("男");
        System.out.println(son.toString());
    }
}
