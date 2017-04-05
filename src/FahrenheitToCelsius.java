/**
 * Created by danawacomputer on 2017-04-04.
 */
public class FahrenheitToCelsius {
    public static void main(String args[]){

        double Fahrenheit = 35.2; // shit+f6 변수명 한번에 변경
        double FahrenheitToCelsius = (Fahrenheit - 32) / 1.8;

        System.out.println("기존 섭씨 값 : " + Fahrenheit);
        System.out.println("화씨 변경 값 : " + FahrenheitToCelsius);

    }
}
