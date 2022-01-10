package baseball.Core;

import baseball.ui.Output;

public class Result {
    private int strikeCount;
    private int ballCount;
    private static final int COUNT_ZERO = 0;

    public Result(int strike, int ball) {
        this.strikeCount = strike;
        this.ballCount = ball;
    }

    public String getResult() {
        StringBuilder sb = new StringBuilder();
        if(strikeCount == COUNT_ZERO && ballCount == COUNT_ZERO) {
            sb.append(Output.RESULT_NOTHING_MESSAGE);
        }
        if(strikeCount != COUNT_ZERO) {
            sb.append(strikeCount).append(Output.RESULT_STRIKE_MESSAGE);
        }
        if(ballCount != COUNT_ZERO) {
            sb.append(ballCount).append(Output.RESULT_BALL_MESSAGE);
        }
        return sb.toString();
    }

}
