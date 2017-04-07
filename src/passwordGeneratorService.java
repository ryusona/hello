/**
 * Created by danawacomputer on 2017-04-07.
 */
public class passwordGeneratorService {

    public String makePassword(String targetStr, String prefix, String postfix) {

        int targetStrLength;

        targetStrLength = targetStr.length();

        int squareLengthOfChar =
                targetStrLength * targetStrLength;

        targetStr =
                targetStr.substring(0, 1).toUpperCase() + targetStr.substring(1);

        if (targetStrLength >= 8)   postfix = "";

        return prefix + targetStr + squareLengthOfChar + postfix;

    }
}
