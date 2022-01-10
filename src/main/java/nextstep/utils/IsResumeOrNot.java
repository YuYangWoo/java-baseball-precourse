package nextstep.utils;

import baseball.ui.Output;

public class IsResumeOrNot {
    private static final int VALID_OPINION_INPUT_SIZE = 1;
    private static final int RESUME_REPLY = 1;
    private static final int STOP_REPLY = 2;

    private final int opinion;

    public IsResumeOrNot(String userReply) {
        isValidLength(userReply);

        this.opinion = Integer.parseInt(userReply);
        isValidOpinionRange(opinion);
    }

    private void isValidLength(String userReply) {
        if (userReply.length() != VALID_OPINION_INPUT_SIZE) {
            throw new IllegalArgumentException(Output.RESUME_INPUT_SIZE_EXCEPTION_MESSAGE);
        }
    }

    private void isValidOpinionRange(int opinion) {
        if ((opinion != RESUME_REPLY) && (opinion != STOP_REPLY)) {
            throw new IllegalArgumentException(Output.RESUME_INPUT_FORMAT_EXCEPTION_MESSAGE);
        }
    }

    public boolean isResume() {
        return (opinion == RESUME_REPLY);
    }
}
