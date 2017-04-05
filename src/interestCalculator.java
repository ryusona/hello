import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class interestCalculator {
    public static void main (String args[]) {

        Scanner in = new Scanner(System.in);

        //int myMoney ;//원금
        // if 원래 있던 값들을 받아서 가져올 경우에는? (텍스트-> int)
        // if 여려명의 사용자의 값을 받아야 할 경우에는?
        // if

        int myMoney; //원금 principal
        int periodOfDeposit; // 거치 기간
        double intersetOfBank; //  은행이율
        double cnffurrmador ; // 이자
        int total; // 총액

        System.out.print("원금을 입력 하세요 : ");
        myMoney = in.nextInt();

        System.out.print("기간을 입력 하세요 : ");
        periodOfDeposit = in.nextInt();

        System.out.print("이율을 입력 하세요 : ");
        intersetOfBank = in.nextDouble();

        if (periodOfDeposit >= 36) {
            intersetOfBank = intersetOfBank - (intersetOfBank * 0.3);
            System.out.printf("감면 후 이율 : %f" , intersetOfBank);
        }

        cnffurrmador = myMoney * (intersetOfBank/100) * (periodOfDeposit/12);
        total = myMoney + (int)cnffurrmador;

        System.out.println(periodOfDeposit + "개월 후 당신은 " + total + "원을 받을 수 있습니다.");
        System.out.printf( "%d 개월 후 당신은 %d 원을 받을 수 있습니다.", periodOfDeposit, total);


    }
}
