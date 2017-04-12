package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Parent {
    private int age;
    private String name;

    public void smoke() { // if final하면 런타임 시간을 감소시키기 위하여 오버라이딩을 하면 더 느림
        System.out.println("아버지가 담배를 핍니다. \n");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
