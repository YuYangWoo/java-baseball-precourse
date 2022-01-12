package baseball.ui;

import nextstep.utils.Console;

public class Input {

    public static String inputYourNumber() {
        String input = "";
        Output.printRequestNumberInput();
        try {
            input = Console.readLine();
        } catch (IllegalArgumentException e) {
            Output.printExceptionMessage(e.getMessage());
        }
        return input;
    }

    public static String resumeYourNumber() {
        String input = "";
        Output.printRequestResumeInput();
        try {
            input = Console.readLine();
        } catch (IllegalArgumentException e) {
            Output.printExceptionMessage(e.getMessage());
        }
        return input;
    }

}
