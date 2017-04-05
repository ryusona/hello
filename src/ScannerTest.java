import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class ScannerTest {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.print("단어를 입력하세요 : ");
        String inputted = in.nextLine(); // 사용자가 엔터 전까지 출력

        String inputtedFirstChar = inputted.substring(0,1); // 첫 번 째 단어
        String inputtedUpper = inputtedFirstChar.toUpperCase(); // 대문자로 변경

        String inputtedslice = inputted.substring(1);
        String inpuutedChange = inputtedUpper + inputtedslice;

        int inputtedLength = inputted.length(); // 글자 수 뽑아내기

        String result = "$$" + inpuutedChange + (inputtedLength * inputtedLength) + "#" ;

        System.out.println("암호화 된 비밀번호 " + result);

        System.out.print("당신의 비밀번호를 입력하세요 : ");
        String inputtedUserpw = in.nextLine();
        String testStr = "seoul";
        String inputStr = inputtedUserpw;

        if((testStr.equals(inputStr)) == true ) System.out.println("일치 합니다.");
        else System.out.println("일치 하지않습니다.");



    }
}
