package majorleagesalaries;

import java.util.*;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class SalarieService {


    public double calSalariesAvg (List<Salarie> MemberList) { // us가 아닌 국가 수 세는거
        double sum = 0.0;

        for (Salarie List : MemberList){
            sum = sum + List.getSalary();
        }
        return sum / MemberList.size();
    }

    public double calYearSalariesAvg (List<Salarie> MemberList) { // us가 아닌 국가 수 세는거
        double sum = 0.0;

        for (Salarie List : MemberList){
            sum = sum + List.getSalary();
        }
        return sum / MemberList.size();
    }

    public void sortSalaries (List<Salarie> MemberList) { // 너를 소트 할꺼야

        int a = MemberList.size();

        List<Salarie> mingab = new ArrayList<>();

        Collections.sort(MemberList, new Comparator<Salarie>() {
            public int compare(Salarie obj1, Salarie obj2)
            {
                // TODO Auto-generated method stub
                return (obj1.getSalary() < obj2.getSalary()) ? -1: (obj1.getSalary() > obj2.getSalary()) ? 1:0 ;
            }
        });


        String [] max = {MemberList.get(0).getYearID(),MemberList.get(0).getYearID(),
                MemberList.get(0).getYearID(),MemberList.get(0).getYearID(),MemberList.get(0).getYearID()};
        String [] min = {MemberList.get(a-1).getYearID(),MemberList.get(a-1).getYearID(),
                MemberList.get(a-1).getYearID(),MemberList.get(a-1).getYearID(),MemberList.get(a-1).getYearID()};
    }

    public void sortYearSalaries (List<Salarie> MemberList) { // 너를 소트 할꺼야

        List<Salarie> yearAvg = new ArrayList<>();

        int a = MemberList.size();
        double sum = 0.0;

        Collections.sort(MemberList, new Comparator<Salarie>() {
            public int compare(Salarie obj1, Salarie obj2)
            {
                // TODO Auto-generated method stub
                return obj1.getYearID().compareTo(obj2.getYearID());
            }
        });

//        String [] max = {MemberList.get(0).getYearID(),MemberList.get(0).getYearID(),
//                MemberList.get(0).getYearID(),MemberList.get(0).getYearID(),MemberList.get(0).getYearID()};

    }

}
