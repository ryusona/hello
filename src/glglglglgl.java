import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class glglglglgl {
    public static void main (String args[]) {

        Scanner in = new Scanner(System.in);

        //int myMoney ;//원금
        // if 원래 있던 값들을 받아서 가져올 경우에는? (텍스트-> int)
        // if 여려명의 사용자의 값을 받아야 할 경우에는?
        // if

        int principal; //원금 principal
        int month; // 거치 기간
        double rate; //  은행이율
        double cnffurrmador ; // 이자
        int total; // 총액

        System.out.print("원금을 입력 하세요 : ");
        principal = in.nextInt();

        System.out.print("기간을 입력 하세요 : ");
        month = in.nextInt();

        System.out.print("이율을 입력 하세요 : ");
        rate = in.nextDouble();

        if (month >= 36) {
            rate = rate - (rate * 0.3);
            System.out.printf("감면 후 이율 : %f" , rate);
        }

        double interest =  calcInterest(principal, month, rate);
        cnffurrmador = principal * (rate/100) * (month/12);
        total = principal + (int)cnffurrmador;

        System.out.println(month + "개월 후 당신은 " + total + "원을 받을 수 있습니다.");
        System.out.printf( "%d 개월 후 당신은 %d 원을 받을 수 있습니다.", month, total);

    }


    public static double calcInterest (int principal, int month, double rate) {
        double interest = principal * (rate/100) * (month/12);
        return  interest;
    }

//    public class Bank {
//
//        public double PriceCalculation() {
//            return
//        }
//    }
}
