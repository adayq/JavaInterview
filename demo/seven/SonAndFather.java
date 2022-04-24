package seven;

public class SonAndFather {
    public static void main(String[] args) {
        Son a = new Son();
        a.setName("儿子");
        System.out.println(a.getName());
    }

}

class Father {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Son extends Father {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
