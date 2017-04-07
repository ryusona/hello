package Member;

import java.util.List;
import java.util.Arrays;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberService {

        public double AverageOfMemberAge(List<Member> MemberList, int serchAge) {
        int sum = 0;

        for (Member List : MemberList){
            if(List.getAge() == serchAge){
                //System.out.printf(List.getName());
            }
            sum += List.getAge();
        }

        double average = (double)sum / MemberList.size();

        return average;
    }

    public int SelectOfMemberName(List<Member> MemberList, String Name) {

        int sum = 0;
        for (Member List : MemberList){
            if( List.getName().substring(0,1).equals(Name)){

                System.out.printf(List.getName());
                sum ++;
                //return List.getName();
            }
            //System.out.println(List.getName().substring(0,1));
        }

        if(sum != 0){
            System.out.printf("ㄷㄹㄷ" );
            return sum;
        }else  return 0;


    }

    public double calcAverageIdChar(List<Member> MemberList) {

        double sum = 0.0;

        for (Member List : MemberList){
            String after = List.getEmail();
            String aa = after.substring(0,after.indexOf('@'));
            sum += aa.length();
            //String dd = Arrays.toString(after.split("@"));
        }

        double average = sum / MemberList.size();

        return average;
    }
}
