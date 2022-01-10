package baseball.ui;

import baseball.Launcher;
import baseball.baseball.BaseballGame;
import nextstep.utils.Console;

public class Input {

    public static String inputYourNumber() {
        String input = "";
        Output.printRequestNumberInput();
        try {
            input = Console.readLine();
        } catch (Exception e) {
            Output.printExceptionMessage(e.getMessage());
        }
        return input;
    }

    public static String resumeYourNumber() {
        String input = "";
        Output.printRequestResumeInput();
        try {
            input = Console.readLine();
        } catch (Exception e) {
            Output.printExceptionMessage(e.getMessage());
        }
        return input;
    }

}
