import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class ScannerTest {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        // String str[] = new String[10];   10개의 공간을 가지는 배열을 선언
        int allClient = 2;
        int targetStrLength = 0;

        for(int i = 0; i < allClient; i++) {

            System.out.print("비밀번호를 입력하세요 : ");
            String targetStr = in.nextLine(); // 사용자가 엔터 전까지 출력

            String passwordGenerated ;
            String prefix = "$$";
            String postfix = "##";


            targetStrLength = targetStr.length();

            int squareLengthOfChar =
                    targetStrLength * targetStrLength;

            targetStr =
                    targetStr.substring(0,1).toUpperCase() + targetStr.substring(1);

            if(targetStrLength >= 8) {
                postfix = "";
            }
            passwordGenerated = prefix + targetStr + squareLengthOfChar + postfix;


            System.out.println("암호화 된 비밀번호 " + passwordGenerated);
        }

        System.out.print("총 " + allClient + "명의 비밀번호를 입력했습니다." );


        /**
        String inputtedFirstChar = targetStr.substring(0,1); // 첫 번 째 단어
        String inputtedUpper = inputtedFirstChar.toUpperCase(); // 대문자로 변경
        // str.substring(0,1).toUpperCase() 첫 단어를 바로 대문자로

        String inputtedslice = targetStr.substring(1);
        String inpuutedChange = inputtedUpper + inputtedslice;

        int inputtedLength = targetStr.length(); // 글자 수 뽑아내기

        String result = "$$" + inpuutedChange + (inputtedLength * inputtedLength) + "#" ;



         * System.out.println("암호화 된 비밀번호 " + result);

         System.out.print("당신의 비밀번호를 입력하세요 : ");
         String inputtedUserpw = in.nextLine();
         String testStr = "seoul";
         String inputStr = inputtedUserpw;

         if((testStr.equals(inputStr)) == true ) System.out.println("일치 합니다.");
         else System.out.println("일치 하지않습니다.");
         *
         *
         *
         */




    }
}
