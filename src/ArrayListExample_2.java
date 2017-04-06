import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExample_2 {
    public static void main(String args[]){

        String review =
                "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게 먹고온 구로 초밥뷔페를 " +
                        "추천해드리려고하는데요!! 구로 초밥뷔페집의 이름은 스시메이진 이라는 곳이에요^^♥";

        List<String> items = Arrays.asList(review.split(" ")); // String에 들어있는 값을 list로 push

        double AverageFromList = getAverageFromList(items); // 평균 구하는 법
        System.out.printf("글자 수의 평균은 %.1f \n", AverageFromList);

        List<String> selectItem = getListLessThanFive(items); // 5개 이하의 글자 리스트

        for(String s : selectItem){
            System.out.printf("5자 이하 업체 출력 : %s \n",s);
        }

    }

    public static double getAverageFromList(List<String> wordList) {

        int marketSpellingNumber;
        int sumOfMarketSpellingNumber = 0;
        int allCharItems = wordList.size();

        for (String e : wordList) {
            marketSpellingNumber = e.length(); // 각 업체의 글자 수 추출
            sumOfMarketSpellingNumber = sumOfMarketSpellingNumber + marketSpellingNumber; // 글자수 ++
        }
        double avgOfStrArr = sumOfMarketSpellingNumber / (double)allCharItems;
        return avgOfStrArr;

    }
    public static List<String> getListLessThanFive(List<String> wordList){
        int marketSpellingNumber;
        List<String> selectItem_1 = new ArrayList<>();

        for (String e : wordList) {
            marketSpellingNumber = e.length();

            if (marketSpellingNumber <= 5) selectItem_1.add(e);
        }
        return selectItem_1;
    }

}
