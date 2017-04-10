package Gourmet;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetService {

    public double calcAdddScore (List<Gourmet> gourmetList) {

        int sum = 0;

        for (Gourmet List : gourmetList) sum += List.getScore();

        return sum;

    }
    public double calcAverageScore (List<Gourmet> gourmetList) { // 퓨어function -> 입력값이 같으면 출력도 같은것을 의미

        int sum = 0;

        for (Gourmet List : gourmetList){
            sum += List.getScore();
        }

        double average = (double)sum / gourmetList.size();

        return average;

    }
}
