package baseball.ui;

public class Output {

    private static final String REQUIRE_NUMBER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String REQUIRE_RESTART_INPUT_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String CORRECT_ANSWER_AND_EXIT_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝.";
    public static final String BASEBALLS_SIZE_EXCEPTION_MESSAGE = "3자리 숫자를 입력해야 합니다.";
    public static final String INPUT_DUPLICATED_NUMBER_MESSAGE = "중복된 수는 입력하면 안됩니다.";
    public static final String INPUT_NUMBER_FORMAT_EXCEPTION_MESSAGE = "각 자리의 수는 1부터 9까지의 숫자만 가능합니다.";
    public static final String INPUT_SIZE_EXCEPTION_MESSAGE = "입력한 문자의 길이가 3을 넘을 수 없습니다.";
    public static final String RESUME_INPUT_SIZE_EXCEPTION_MESSAGE = "입력한 문자의 길이가 1을 넘을 수 없습니다.";
    public static final String RESUME_INPUT_FORMAT_EXCEPTION_MESSAGE = "입력은 1 또는 2만 가능합니다.";
    public static final String RESULT_NOTHING_MESSAGE = "낫싱";
    public static final String RESULT_STRIKE_MESSAGE = "스트라이크 ";
    public static final String RESULT_BALL_MESSAGE = "볼";
    public static final String RESULT_ERROR_MESSAGE = "[ERROR] ";

    public static void printRequestNumberInput() {
        System.out.print(REQUIRE_NUMBER_INPUT_MESSAGE);
    }

    public static void printRequestResumeInput() {
        System.out.println(REQUIRE_RESTART_INPUT_MESSAGE);
    }

    public static void printCorrectAnswer() {
        System.out.println(CORRECT_ANSWER_AND_EXIT_MESSAGE);
    }

    public static void printBaseballGaemResult(String result) {
        System.out.println(result);
    }

    public static void printExceptionMessage(String exceptionMessage) {
        System.out.println(RESULT_ERROR_MESSAGE + exceptionMessage);
    }

}
