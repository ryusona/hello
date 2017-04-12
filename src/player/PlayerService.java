package player;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerService {

    public static Player getHighestSalaryPlayer(List<Player> list) {

        Player highestSalaryPlayer = new Player();

        for (Player e : list) {
            if (e.getSalary() > highestSalaryPlayer.getSalary()){
                highestSalaryPlayer = e;
            }
        }
        return highestSalaryPlayer;
    }

    public static Player getLowestSalaryPlayer (List<Player> list) {

        Player lowestSalaryPlayer = new Player();
        int maxgab = 0;

        for (Player e : list) {
            if (e.getSalary() < maxgab){
                System.out.println(e.getSalary());
                System.out.println("545" + e.getSalary());
                lowestSalaryPlayer = e;
            }
        }
        return lowestSalaryPlayer;
    }

    public Player getAllPlayersAverageSalary (List<Player> list) {
        return null;
    }
}
