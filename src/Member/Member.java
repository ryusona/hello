package Member;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Member {

    private String name;
    private int age;
    private String hpNumber;
    private String email;

    public Member(String name, int age, String hpNumber, String email) {
        this.name = name;
        this.age = age;
        this.hpNumber = hpNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHpNumber() {
        return hpNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHpNumber(String hpNumber) {
        this.hpNumber = hpNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
