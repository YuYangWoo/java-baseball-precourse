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
        isDuplicated(YOUR_INPUT);
    }

    private void isValidLength(String your_input) {
        if (your_input.length() != VALID_OPINION_INPUT_SIZE) {
            throw new IllegalArgumentException(Output.BASEBALLS_SIZE_EXCEPTION_MESSAGE);
        }
    }

    private void isDigitNumber(String your_input) {
        if (!Character.isDigit(your_input.charAt(FIRST)) ||
            !Character.isDigit(your_input.charAt(MIDDLE)) ||
            !Character.isDigit(your_input.charAt(LAST))) {
            throw new IllegalArgumentException(Output.INPUT_NUMBER_FORMAT_EXCEPTION_MESSAGE);
        }
    }

    private void isDuplicated(String num) {
        for (int i = FIRST; i < num.length() - MIDDLE; i++) {
            boolean zeroToOne = num.charAt(i) == num.charAt(i + MIDDLE);
            if (i == FIRST) {
                if (zeroToOne || num.charAt(i) == num.charAt(i + LAST)) {
                    throw new IllegalArgumentException(Output.INPUT_DUPLICATED_NUMBER_MESSAGE);
                }
            }
            if (i == MIDDLE) {
                if (zeroToOne) {
                    throw new IllegalArgumentException(Output.INPUT_DUPLICATED_NUMBER_MESSAGE);
                }
            }
        }
    }

    public String isChecked() {
        return YOUR_INPUT;
    }

}
