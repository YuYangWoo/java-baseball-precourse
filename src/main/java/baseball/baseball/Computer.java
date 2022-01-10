package baseball.baseball;

import nextstep.utils.Randoms;

public class Computer {

    public String getComputerNumber() {
        String randomNumber = "";
        for(int i = 0 ; i < 3; i++) {
            randomNumber += String.valueOf(Randoms.pickNumberInRange(1,9));
        }
        return randomNumber;
    }
}
