package Member;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberContact {
    public static void main(String args[]) {

        Member p1 = new Member("유관이", 25, "01024781378", "tlsfldks@naver.com");
        Member p2 = new Member("이가원", 25, "01064395943", "dlrkdnjs1211@gmail.com");
        Member p3 = new Member("이진석", 26, "01029790767", "jins920409@gmail.com");
        Member p4 = new Member("김태준", 27, "01062567334", "kim19911211@gmail.com");
        Member p5 = new Member("임준성", 20, "01099728210", "wnstjd9972@gmail.com");
        Member p6 = new Member("김세원", 27, "01047346373", "sewon0613@naver.com");
        Member p7 = new Member("이기봉", 26, " 01030095732 ", "lkb573@gmail.com");
        Member p8 = new Member("진하영", 24, "01030333247", "vnfflvdl1@gmail.com");
        Member p9 = new Member("류승아", 25, "01093776928", "loveyou_06@naver.com");



        List<Member> list = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);

        Scanner in = new Scanner(System.in);

        System.out.printf("찾고 싶은 성을 입력하세요 : ");
        String selectName = in.nextLine();
        System.out.printf("찾고 싶은 나이 값을 입력하세요 : ");
        int searchAge = in.nextInt();

        MemberService memberSearch = new MemberService();

        double average = memberSearch.averageOfMemberAge(list, searchAge);
        int selectNameNumber = memberSearch.selectOfMemberName(list, selectName);
        double emailAverage = memberSearch.calcAverageIdChar(list);

        System.out.printf("성이 %s인 사람은 %s 명 입니다. \n", selectName, selectNameNumber);
        System.out.printf("나이의 평균은 %.1f입니다. \n", average);
        System.out.printf("이메일의 평균 값은 %.1f 입니다.", emailAverage);


    }
}
