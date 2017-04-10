package majorleague;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService {

    public int choiceOfState(List<Park> MemberList) { // us가 아닌 국가 수 세는거
        int sum = 0;

        for (Park List : MemberList){
            if(List.getCountry().equals("US")){
                sum += 0;
            }else sum += 1;
        }
        return sum;
    }
    public int choiceOfAlias (List<Park> MemberList) { // 별명이 있는 볼 파크 수
        int sum = 0;

        for (Park List : MemberList){
            if(List.getParkAlias().equals("")){
                sum += 0;
            }else sum +=1;
        }
        return sum;
    }

    public double avgOfParkName (List<Park> MemberList) { // 볼 파크 이름의 글자 평균

        int sum = 0;

        for (Park List : MemberList){
            sum = sum + List.getParkName().length();
        }
        return sum / MemberList.size();
    }

}
