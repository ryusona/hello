import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class StringArrayExample {
    public static void main(String args[]) {

        String[] marketName = {
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비"
                , "돌배기집", "구로곱창", "두끼 구로디지털단지점", "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점"
                , "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치"
        };

//        List<String> goumet = new ArrayList<>();
//        goumet.add("숟가락반상 마실");
//        goumet.add("스시메이진");
//        ...

        List<String> goumet = Arrays.asList(
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비"
                , "돌배기집", "구로곱창", "두끼 구로디지털단지점", "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점"
                , "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치"

        );

        List<String> goumetUnderThreeChar = new ArrayList<>();

        for (String e : goumet) {
            if (e.length() <= 3){
                goumetUnderThreeChar.add(e);
            }
        }

        for(String e : goumetUnderThreeChar) {
            System.out.println(e);
        }


//        int marketNumber = marketName.length; // 총 업체 수
//        String selectMarketName [] = new String[marketNumber]; // 반드시 배열 초기값 줘야함!
//
//        int marketSpellingNumber; // 간판 글자 수(띄어쓰기 포함)
//        int sumOfMarketSpellingNumber = 0; // 전체 업체의 간판 글자 수를 더한 값
//        int selectMarketNumber = 0;
//
//        for (String e : marketName) {
//            marketSpellingNumber = e.length(); // 각 업체의 글자 수 추출
//            sumOfMarketSpellingNumber = sumOfMarketSpellingNumber + marketSpellingNumber; // 글자수 ++
//            // sumOfMarketSpellingNumber += ArrLength; 다른방법으로 표현하기
//
//            if (marketSpellingNumber <= 3) { // 3글자 이하 업체 추출
//                selectMarketName[selectMarketNumber] = e; // 해당되는 업체는 newStrArr라는 배열로 삽입
//                selectMarketNumber++;
//            }
//
//        }
//
//        int avgOfStrArr = sumOfMarketSpellingNumber / marketNumber; // 총 글자 수 평균
//
//        for (String e : selectMarketName){
//            if(e == null ) break;
//            System.out.println(e);
//        }
//        System.out.println(avgOfStrArr);
//
//    }
    }
}
