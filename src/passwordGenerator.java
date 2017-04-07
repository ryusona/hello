import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class passwordGenerator {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in); // String str[] = new String[10];   10개의 공간을 가지는 배열을 선언

        passwordGeneratorService passwordService = new passwordGeneratorService();

            System.out.print("비밀번호를 입력하세요 : ");
            String targetStr = in.nextLine(); // 사용자가 엔터 전까지 출력

            String prefix = "$$";
            String postfix = "##";

            String passwordGenerated = passwordService.makePassword(targetStr, prefix, postfix);

            System.out.println("암호화 된 비밀번호 " + passwordGenerated);

    }

}
