package member;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberService {

    public double averageOfMemberAge(List<Member> MemberList, int searchAge) {
        int sum = 0;

        for (Member List : MemberList){
            if(List.getAge() == searchAge){
                //System.out.printf(List.getName());
            }
            sum += List.getAge();
        }

        double average = (double)sum / MemberList.size();

        return average;
    }

    public int selectOfMemberName(List<Member> MemberList, String Name) {

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
