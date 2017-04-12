package majorleague;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-10.
 */

// 웹에서의 데이터 교환 JSON을 제일 많이 사용
public class FileReaderExample {

    public static void main(String[] args) throws Exception { // 예외를 처리하지 않겠다

        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr); // 파일을 좀 더 쉽게 조작 할 수 있음

        Scanner in =  new Scanner(System.in);

        List<Park> parkList = new ArrayList(); //  Park라는 아이

        System.out.printf("찾고싶은 국가를 입력하세요 : ");

        String inputSelectContry = in.nextLine().toUpperCase();

        String line = ""; // 초기값

        int noInputFistLine = 0; // 첫번 째 줄 예외처리 하기 위한 상수
        // br.readLine() // 첫번 째 줄 예외처리

        while ((line = br.readLine()) !=null) { //? 만약 line이 null이 아니라면

            if(noInputFistLine == 0) { // 만약 내가 첫 라인을 읽는거라면
                noInputFistLine = 1; // 상수값을 1로 바꿔줌 (두 번 째 라인부터 읽는 방법도 있는가..?
            }
            else { // 만약 두번 째 라인 부터라면
                String[] splitted = line.split(","); // ,로 값을 나눠주고 각각의 값을 배열에 넣어준다.
                // List <String> splitted = Arrays.asList(line.split(",")); 스트링을 리스트로 받는 법
                parkList.add( new Park(splitted[0], splitted[1], splitted[2],
                                        splitted[3], splitted[4], splitted[5])); // parkList(p11,p11,p11,p11,p11...) while문이 돌 때마다 p11이 하나 씩 추가됨

            }

        }

//        for(Park e : parkList){  // parklist에 들어있는 값 출력해 보기
//            System.out.println(e.getCity());
//        }

        SlarieService parkservice = new SlarieService(); // parksevice라는 객체를 생성

        int notUsParkNumber = parkservice.choiceOfState(parkList, inputSelectContry);
        List<Park> haveAliasParkNumber = parkservice.getParkIncludeAlias(parkList);
        double avgOfParkNameNumber = parkservice.avgOfParkName(parkList);

        System.out.printf("%S가 아닌 볼 파크 수는 %d개 입니다.\n", inputSelectContry, notUsParkNumber);
        System.out.printf("\n별명이 있는 볼 파크 List \n");
            for(Park e : haveAliasParkNumber) System.out.println(e.getParkAlias());
        System.out.printf("\n볼파크 이름의 글자 평균은 %.1f 입니다.\n", avgOfParkNameNumber);


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
