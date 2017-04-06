import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExample {
    public static void main(String args[]){

        String review =
                "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게 먹고온 구로 초밥뷔페를 " +
                "추천해드리려고하는데요!! 구로 초밥뷔페집의 이름은 스시메이진 이라는 곳이에요^^♥";

        // 요 아래 두줄은 스트링을 list로 넣는 다른 예시
//        String[] splitted = review.split(" ");
//        List<String> wordList = Arrays.asList(splitted);

        List<String> items = Arrays.asList(review.split(" ")); // String에 들어있는 값을 list로 push
        List<String> selectItem = new ArrayList<>();

        int marketSpellingNumber; // 각 글자 수
        int sumOfMarketSpellingNumber = 0; // 전체 글자 수 더한 값

        for (String e : items) {
            marketSpellingNumber = e.length(); // 각 업체의 글자 수 추출
            sumOfMarketSpellingNumber = sumOfMarketSpellingNumber + marketSpellingNumber; // 글자수 ++

            if (marketSpellingNumber <= 5) { // 5글자 이하 업체 추출
                 selectItem.add(e);
            }else System.out.printf("5개 이상이라능 : %s \n", e);
        }


        double avgOfStrArr = sumOfMarketSpellingNumber / (double)items.size(); // 총 글자 수 평균
        System.out.printf("글자 수의 평균은 %.1f \n", avgOfStrArr);

        for(String s : selectItem){
            System.out.printf("5자 이하 업체 출력 : %s \n",s);
        }

    }
}
