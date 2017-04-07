/**
 * Created by danawacomputer on 2017-04-04.
 */
public class Appleshop {
    public static void main(String args[]){

        int regularPriceForiPadPor = 999_000; // 원가
        double dcRate =  15.0 / 100; //할인 이율

        int resultPrice = getDiscountedPrice(regularPriceForiPadPor, dcRate); // resultPrice

        System.out.println(resultPrice + "원");

    }

    public static int getDiscountedPrice(int regularPriceForiPadPor,double dcRate){

        double getDiscountedPrice = regularPriceForiPadPor - (regularPriceForiPadPor * dcRate);

        return (int)getDiscountedPrice;
    };
}

//sasle to hi
