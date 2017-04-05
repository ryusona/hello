import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class productPriceCalculation {
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);

        int typeOfTobocco; // 담배종류
        int age; // 나이
        int quantity; // 수량
        double cigaretCost; // 담배 가격
        double total; // 총 가격

        System.out.print("담배종류를 입력하세요 (1: 디스/ 2: 말보로)");
        typeOfTobocco = in.nextInt();

        System.out.print("나이를 입력하세요 : ");
        age = in.nextInt();

        System.out.print("수량을 입력하세요 : ");
        quantity = in.nextInt();

        if (typeOfTobocco == 1) cigaretCost = 4500;
        else if (typeOfTobocco == 2) cigaretCost = 5200;
        else cigaretCost = 0;

        if (age >= 45)  cigaretCost = cigaretCost + (cigaretCost * 0.3);
        else if (age < 19) cigaretCost = cigaretCost - (cigaretCost * 0.2);

        total = cigaretCost * quantity ;

        System.out.printf("지불하실 금액은 %.0f원 입니다.", total);
    }
}
