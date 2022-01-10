package baseball.baseball;

import nextstep.utils.IsDuplicated;
import nextstep.utils.Randoms;

public class Computer {

    public static String getComputerNumber() {
        String randomNumber;
        do {
            randomNumber = "";
            for(int i = 0 ; i < 3; i++) {
                randomNumber += String.valueOf(Randoms.pickNumberInRange(1,9));
            }
        } while(IsDuplicated.isCheck(randomNumber));
        return randomNumber;
    }

}
