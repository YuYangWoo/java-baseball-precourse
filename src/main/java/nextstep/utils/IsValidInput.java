package nextstep.utils;

import baseball.ui.Output;

public class IsValidInput {

    public final static int VALID_OPINION_INPUT_SIZE = 3;
    public final static int FIRST = 0;
    public final static int MIDDLE = 1;
    public final static int LAST = 2;

    public final String YOUR_INPUT;

    public IsValidInput(String your_input) {
        this.YOUR_INPUT = your_input;
        isValidLength(YOUR_INPUT);
        isDigitNumber(YOUR_INPUT);
    }

    public void isValidLength(String your_input) {
        if(your_input.length() != VALID_OPINION_INPUT_SIZE) {
            throw new IllegalArgumentException(Output.BASEBALLS_SIZE_EXCEPTION_MESSAGE);
        }
    }

    public void isDigitNumber(String your_input) {
        if(!Character.isDigit(your_input.charAt(FIRST)) ||
            !Character.isDigit(your_input.charAt(MIDDLE)) ||
            !Character.isDigit(your_input.charAt(LAST))) {
            throw new IllegalArgumentException(Output.INPUT_NUMBER_FORMAT_EXCEPTION_MESSAGE);
        }
    }

    public boolean isChecked() {
        return true;
    }

}
