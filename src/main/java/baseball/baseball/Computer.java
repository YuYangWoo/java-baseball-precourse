package baseball.baseball;

import nextstep.utils.Randoms;

public class Computer {

    public static String getComputerNumber() {
        StringBuilder randomNumber = new StringBuilder();
        while(randomNumber.length() < 3) {
            int num = Randoms.pickNumberInRange(1,9);
            if(!randomNumber.toString().contains(String.valueOf(num))) {
                randomNumber.append(num);
            }
        }
        return randomNumber.toString();
    }

}
