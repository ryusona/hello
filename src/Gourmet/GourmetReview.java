package Gourmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetReview {
    public static void main(String[ ] args) {

        // 맛집 객체를 5개 생성
        Gourmet spoon = new Gourmet();
        spoon.setTitle("숟가락반상 마실");
        spoon.setMainMenu("한정식, 떡갈비, 갈비찜");
        spoon.setScore(111);

        Gourmet sushi = new Gourmet();
        sushi.setTitle("스시메이진");
        sushi.setMainMenu("스시, 스시뷔페");
        sushi.setScore(70);

        Gourmet chan = new Gourmet();
        chan.setTitle("맛찬들");
        chan.setMainMenu("삼겹살, 한우, 목살");
        chan.setScore(49);

        Gourmet choi = new Gourmet();
        choi.setTitle("최우영스시");
        choi.setMainMenu("초밥, 회전초밥");
        choi.setScore(49);

        Gourmet ranch = new Gourmet("철판목장","스테이크, 철판, 함박스테이크", 46);

        Gourmet yongho = new Gourmet("용호낙지", "낙지, 곱창, 낙곱새",46);

        // 맛집 객체를 리스트로 담음
        List<Gourmet> list = Arrays.asList(spoon, sushi, chan, choi, ranch);

        GourmetService gourmetReviewAverage = new GourmetService();

        double average = gourmetReviewAverage.calcAverageScore(list);

        System.out.printf("맛집 점수 평균은 %.1f입니다.", average);


    }
}
