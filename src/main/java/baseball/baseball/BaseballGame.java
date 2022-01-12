package baseball.baseball;

import baseball.Core.BaseBallPlaying;
import baseball.ui.Input;
import baseball.ui.Output;
import nextstep.utils.IsValidInput;

public class BaseballGame {
    String computerNumber = "";
    String userNumber = "";

    public void playBaseBall() {
        computerNumber = Computer.getComputerNumber();
        do {
            try {
                IsValidInput isValidInput = new IsValidInput(Input.inputYourNumber());
                userNumber = isValidInput.isChecked();
                BaseBallPlaying baseBallPlaying = new BaseBallPlaying();
                String result = baseBallPlaying.getGameScore(userNumber, computerNumber);
                Output.printBaseballGaemResult(result);
            } catch (IllegalArgumentException e) {
                Output.printExceptionMessage(e.getMessage());
            }
        } while(!checkEqual());
        Output.printCorrectAnswer();
    }

    public boolean checkEqual() {
       return userNumber.equals(computerNumber);
    }

}
