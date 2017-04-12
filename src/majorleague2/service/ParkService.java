package majorleague2.service;

import majorleague2.model.Park;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService implements IParkService{

    public int choiceOfState(List<Park> MemberList, String selectContry) { // us가 아닌 국가 수 세는거
        int sum = 0;

        for (Park List : MemberList){
            // System.out.println(List.getCountry());

            if(List.getCountry().equals(selectContry)){
                //System.out.println(selectContry);
                sum += 0;
            }else sum += 1;
        }
        return sum;
    }


    public List<Park> getParkIncludeAlias (List<Park> MemberList) { // 별명이 있는 볼 파크 수
        int sum = 0;

        List<Park> parkList = new ArrayList();
        for (Park List : MemberList){
            if(List.getParkAlias().equals("")){
                sum += 0;
            }else {
                parkList.add(List);
                sum +=1;
            }
        }
        return parkList;
    }

    public double avgOfParkName (List<Park> MemberList) { // 볼 파크 이름의 글자 평균

        double sum = 0.0;

        for (Park List : MemberList){
            sum = sum + List.getParkName().length();
        }
        return sum / MemberList.size();
    }

}
