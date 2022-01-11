package baseball.baseball;

import baseball.Core.BaseBallPlaying;
import baseball.ui.Input;
import baseball.ui.Output;
import nextstep.utils.IsValidInput;

public class BaseballGame {
    String computerNumber = "";
    String userNumber = "";

    public void playBaseBall() {
        Input input = new Input();
        BaseBallPlaying baseBallPlaying = new BaseBallPlaying();
        do {
            Computer computer = new Computer();
            computerNumber = computer.getComputerNumber();
            try {
                IsValidInput isValidInput = new IsValidInput(input.inputYourNumber());
                userNumber = isValidInput.isChecked();
                baseBallPlaying.getGameScore(userNumber, computerNumber);
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
