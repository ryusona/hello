package player;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_MULTIPLYPeer;
import majorleagesalaries.Salarie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerMain {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src\\Salaries.csv"));


        List<Player> players = new ArrayList<>();
        String line = "";
        br.readLine();
        while ((line = br.readLine()) !=null) { //? 만약 line이 null이 아니라면

            String[] splitted = line.split(","); // ,로 값을 나눠주고 각각의 값을 배열에 넣어준다.
            players.add( new Player( splitted[0], splitted[1], splitted[2],
                                        splitted[3], Long.parseLong(splitted[4])));

        }

        Player player = PlayerService.getHighestSalaryPlayer(players); // 함수를 statci으로 선언하면 바로 사용가능
        Player lowplayer = PlayerService.getLowestSalaryPlayer(players);

        System.out.println(player);
        System.out.println(lowplayer);
        //System.out.printf("%s 의 연봉은 %d  입니다.", player.getPlayerID(), player.getSalary());

    }
}
