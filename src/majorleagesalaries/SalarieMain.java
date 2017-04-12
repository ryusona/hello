package majorleagesalaries;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class SalarieMain {

    public static void main(String[] args) throws Exception { // 예외를 처리하지 않겠다

//        * map
//                * reduce // 최대값과 최소값 구할 때 사용

        FileReader fr = new FileReader("src\\Salaries.csv");

        BufferedReader br = new BufferedReader(fr); // 파일을 좀 더 쉽게 조작 할 수 있음

        Scanner in =  new Scanner(System.in);

        List<Salarie> salarieList = new ArrayList(); //  Park라는 아이

        String line = ""; // 초기값

        br.readLine(); // 첫번 째 줄 예외처리

        while ((line = br.readLine()) !=null) { //? 만약 line이 null이 아니라면

            String[] splitted = line.split(","); // ,로 값을 나눠주고 각각의 값을 배열에 넣어준다.
               salarieList.add( new Salarie( splitted[0], splitted[1], splitted[2],
                                            splitted[3], Long.parseLong(splitted[4]))); // parkList(p11,p11,p11,p11,p11...) while문이 돌 때마다 p11이 하나 씩 추가됨

            }


        SalarieService salarieService = new SalarieService(); // parksevice라는 객체를 생성

        salarieService.sortSalaries(salarieList); // 0! 330000000까지 차례대로 입력


        double printSalarieAvg = salarieService.calSalariesAvg(salarieList);
        double printYearSalarieAvg = salarieService.calYearSalariesAvg(salarieList);

        salarieService.sortYearSalaries(salarieList);

        System.out.printf("평균 연봉 값은 : %.1f \n",printSalarieAvg);
        System.out.printf("연도별 평균 연봉 값은 : %.1f \n", printYearSalarieAvg);




    }


}

