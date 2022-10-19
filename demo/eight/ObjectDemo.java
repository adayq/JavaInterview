package eight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aday
 * @date 2022/9/22 15:12
 * description :
 */
public class ObjectDemo {

    public static void main(String[] args) {
        A a = new A();
        List<A> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.setName("测试：" + i);
            list.add(a);
        }
        for (A a1 : list) {
            System.out.println(a1);
        }

    }

}

class A {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}