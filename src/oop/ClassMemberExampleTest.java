package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ClassMemberExampleTest {

    public static void main(String args[]) {
        ClassMemberExample cme = new ClassMemberExample();

        int a = ClassMemberExample.getStaticTest(); // 언제 스태틱 메소드를 사용하는가?
                                                    // fure funciton 일 경우 사용
                                                    // 단순 연산작업으로 사용할 때
        int i = ClassMemberExample.CLASS_MEMBER;

        System.out.println(Math.exp(2.0)); //

        int sum = 0;
        int r = (int)(Math.random() * 10);
        for(int ii =0 ; ii<=100000; ii++){
            sum += r;
        }

        System.out.println(sum/100000); //
    }
}
