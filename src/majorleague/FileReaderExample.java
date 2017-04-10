package majorleague;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class FileReaderExample {

    public static void main(String[] args) throws Exception { // 예외를 처리하지 않겠다

        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr); // 파일을 좀 더 쉽게 조작 할 수 있음

        List<Park> list = new ArrayList(); //  Park라는 아이

        String line = ""; // 초기값

        int ii = 0; // 첫번 째 줄 예외처리 하기 위한 상수

        while ((line = br.readLine()) !=null) { // 만약 line이 null이 아니라면

            if(ii == 0) { // 만약 내가 첫 라인을 읽는거라면
                ii = 1; // 상수값을 1로 바꿔줌 (두 번 째 라인부터 읽는 방법도 있는가..?
            }else { // 만약 두번 째 라인 부터라면
                String[] splitted = line.split(","); // ,로 값을 나눠주고 각각의 값을 배열에 넣어준다.

                Park p11 = new Park(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);
                list.add(p11); // list(p11,p11,p11,p11,p11...) while문이 돌 때마다 p11이 하나 씩 추가됨
            }

        }

        ParkService parkservice = new ParkService(); // parksevice라는 객체를 생성

        int notUsParkNumber = parkservice.choiceOfState(list);
        int haveAliasParkNumber = parkservice.choiceOfAlias(list);
        double avgOfParkNameNumber = parkservice.avgOfParkName(list);

        System.out.printf("US가 아닌 볼 파크 수는 %d개 입니다.\n", notUsParkNumber);
        System.out.printf("별명이 있는 볼 파크 수는 %d개 입니다.\n", haveAliasParkNumber);
        System.out.printf("볼파크 이름의 글자 평균은 %.1f 입니다.\n", avgOfParkNameNumber);


//        while (true){
//            String line = br.readLine(); // 요 아이가 한줄 씩 읽어줌
//            String [] splitted = line.split(",");
//            for(String e : splitted) System.out.println(e);
//
//            if(line == null) break;
//
//        }



    }
}
