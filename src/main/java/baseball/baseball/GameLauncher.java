package baseball.baseball;

import nextstep.utils.IsResumeOrNot;
import baseball.ui.Input;
import baseball.ui.Output;

public class GameLauncher {

    public void start() {
       do {
           BaseballGame baseballGame = new BaseballGame();
           baseballGame.playBaseBall();
       } while(isResume());
    }

    private boolean isResume() {
        try {
            IsResumeOrNot opinion = new IsResumeOrNot(Input.resumeYourNumber());
            return opinion.isResume();
        } catch (IllegalArgumentException e) {
            Output.printExceptionMessage(e.getMessage());
            return isResume();
        }
    }

}
