package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ClassMemberExample {

    public static int CLASS_MEMBER = 5; // 상수를 만들 떄 사용함

    private int number;
    private String aString;

    public static int getStaticTest() { // 스태틱 메소드를 만들었음
        return 15;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }
}
