package baseball.baseball;

import nextstep.utils.IsDuplicated;
import nextstep.utils.Randoms;

public class Computer {

    public String getComputerNumber() {
        StringBuilder randomNumber = new StringBuilder();
        IsDuplicated isDuplicated = new IsDuplicated();
        while(randomNumber.length() < 3) {
            int num = Randoms.pickNumberInRange(1,9);
            if(!randomNumber.toString().contains(String.valueOf(num))) {
                randomNumber.append(String.valueOf(num));
            }
        }
//        for(int i = 0 ; i < 3; i++) {
//            randomNumber += String.valueOf(Randoms.pickNumberInRange(1,9)); // 102
//        }
//        do {
//            randomNumber = "";
//            for(int i = 0 ; i < 3; i++) {
//                randomNumber += String.valueOf(Randoms.pickNumberInRange(1,9));
//            }
//        } while(isDuplicated.isCheck(randomNumber));
        return randomNumber.toString();
    }

}
