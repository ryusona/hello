package halloffame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */

public class HallOfFameMain {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src\\HallOfFame.csv"));

        List<HallOfFame> halls = new ArrayList<>(); // 내가 읽어온 데이터를 받을 리스트 선언
        List<PlayerAverage> newList = new ArrayList<>(); // 이름별 평균값을 저장할 리스트를 선언

        String line = "";

        boolean inductedgab = false; // Y/N 값 true/false 변경해 줄 변수
        int setBallots = 0; // slict 3,4,5 의 공백을 처리해줄 변수
        int setNeeded = 0;
        int setVotes = 0;

        br.readLine(); // 첫째줄 날리기

        while ((line = br.readLine()) !=null) { // 만약 line이 null이 아니라면

            String[] splitted = line.split(","); // ,로 값을 나눠주고 각각의 값을 배열에 넣어준다.

//            HallOfFame fame = new HallOfFame(); // 할로우 팜이라는 객체를 생성했어.
//            fame.setPlayerID(splitted[0]);  // fame안에 있는 playerid변수에 splitted0의 값을 넣었어
//            fame.setYearid(splitted[1]);
//            fame.setVotedBy(splitted[2]);

            // 객체.set##으로 넣을수도 있고 = 객체.add
            if(splitted[6].equals("Y")) inductedgab = true;

            if(!splitted[3].equals("")) setBallots = Integer.parseInt(splitted[3]);
                                                        // fame.setBallots(splitted[3])요거하고 같음
            if(!splitted[4].equals("")) setNeeded = Integer.parseInt(splitted[4]);
            if(!splitted[5].equals("")) setVotes = Integer.parseInt(splitted[5]);


            halls.add( new HallOfFame( splitted[0], splitted[1], splitted[2]
                                 , setBallots, setNeeded, setVotes
                                         ,inductedgab ,splitted[7]));

        }

        PlayerAverage pa = new PlayerAverage();  // 매핑작업이라고 함 HallofFame이란 객체를 PlayerAverage 객체로 변환
                                                //  reduce작업이라고 한다...?

        for (HallOfFame e : halls) {

            pa = new PlayerAverage();
            pa.setPlayerId(e.getPlayerID());
            pa.setAverage(
                    (e.getBallots() + e.getNeeded() + e.getVotes()) / 3);
            newList.add(pa);

        }

        System.out.println(newList);

    }
}
