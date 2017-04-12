package exceptiontest;

import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class ExceptionTest {
    public static void main(String args[]) {

        int aa;

        while (true){
            System.out.print("숫자를 입력해 주세요");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            try {
                aa = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e){ // if문으로 빠지는거 말고 컴파일에러로 발생할 수 있는 부분을 예외처리
                System.out.print("잘못된 입력입니다. \n다시 ");
            }
        }
        System.out.printf("입력된 숫자는 : %d 입니다.", aa);

    }
}
