package baseball.ui;

import baseball.Launcher;
import baseball.baseball.BaseballGame;
import nextstep.utils.Console;

public class Input {

    public String inputYourNumber() {
        String input = "";
        Output.printRequestNumberInput();
        try {
            input = Console.readLine();
        } catch (Exception e) {
            Output.printExceptionMessage(e.getMessage());
        }
        checkNumber(input);
        return input;
    }

    public String checkNumber(String input) {
        if (input.length() == 3 &&
            Character.isDigit(input.charAt(0)) &&
            Character.isDigit(input.charAt(1)) &&
            Character.isDigit(input.charAt(2))) {
            return input;
        } else {
            System.out.println("[Error]" + input);
            BaseballGame baseballGame = new BaseballGame();
            baseballGame.playBaseBall();
        }
        return input;
    }

}
