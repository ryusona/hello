/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringManipulation {

    public static void main(String args[]) {

        String original = "soongon";

        String firstChar = original.substring(0,1);
        String charExceptFirst = original.substring(1,7); // substring(1) -> 1부터 끝까지 출력

        String result = charExceptFirst + firstChar;

        System.out.println(result); // 1차 변환 값
        System.out.println(result + "ay");// 2차 변환 값



        String original_2 = "soongon";

        String firstChar_2 = original.substring(0,1);



    }
}
