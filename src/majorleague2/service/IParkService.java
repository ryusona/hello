package majorleague2.service;

import majorleague2.model.Park;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public interface IParkService {

    int choiceOfState(List<Park> MemberList, String selectContry);
    List<Park> getParkIncludeAlias (List<Park> MemberList);
    double avgOfParkName (List<Park> MemberList);

}
