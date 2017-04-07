/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ArrayExample {
    public static void main (String args[]) {

        int [] gugudanArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        double result = calcAverage(gugudanArr);

        System.out.printf("숫자 값의 평균은 %.1f 입니다.", result);

    }

    public static double calcAverage(int [] gugudanArr) {

        int numberArr = gugudanArr.length;
        int hapArr = 0;
        double avg;

        for (int e : gugudanArr)    hapArr = hapArr + e;

        avg = hapArr / numberArr ;

        return  avg;

    }
}

//        int[] iArr = new int[10];
//        int inputiArr = 0;
//
//        for(int i=0; i<=9; i++) {
//            iArr[i] = inputiArr = inputiArr + 2;
//        }
//        for(int i=0; i<=9; i++) {
//            System.out.printf("%d번째 수 : %d \n",(i+1),iArr[i]);
//        }

//        int [] iArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//
//        for(int e : iArr){ // 배열 속에 들어 있는 끝 값까지 돔
//            if ( e % 5 == 0) System.out.println("Bingo");
//            else System.out.println(e);
//        }


//        int [] gugudanArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
//
//        int numberArr = gugudanArr.length;
//        int avg = 0;
//
//        for (int e : gugudanArr){
//
//            String converted = String.valueOf(e);
//
//            // converted.contains("3") -> 컨덱스 안에 3이 있는가? 6과 9도 또는 처리
//            // converted.indexOf("3") > 0    -> 3이 위치한 자리를 리턴
//            if(converted.contains("3") || converted.contains("6")
//                    || converted.contains("9") )  System.out.println("짝");
//            else System.out.println(converted);
//
//        }



