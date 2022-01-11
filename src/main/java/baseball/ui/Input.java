package baseball.ui;

import nextstep.utils.Console;

public class Input {

    public static String inputYourNumber() {
        String input = "";
        Output.printRequestNumberInput();
        input = Console.readLine();
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
