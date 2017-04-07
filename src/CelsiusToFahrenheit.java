/**
 * Created by danawacomputer on 2017-04-04.
 */
public class CelsiusToFahrenheit {
    public static void main(String args[]){

        double Celsius = 19;

        Celcius2FahrenheitService service = new Celcius2FahrenheitService();

        double CelsiusToFahrenheit = service.toFarnheit(Celsius);

        String str = new String("hello");
        // String str = "hello"; => 똑같은 의미임

        System.out.println("기존 섭씨 값 : " + Celsius);
        System.out.println("화씨 변경 값 : " + CelsiusToFahrenheit);

    }


}
