package baseball.Core;

public class BaseBallPlaying {

    public String getGameScore(String userNumber, String computerNumber) {
        int strike = countStrike(userNumber, computerNumber);
        int ball = countBall(userNumber, computerNumber);
        Result result = new Result(strike, ball);
        return result.getResult();
    }

    public int countStrike(String input, String randomNumber) {
        int strikeCount = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == randomNumber.charAt(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int countBall(String input, String randomNumber) {
        int ballCount = 0;
        for(int i = 0 ; i < input.length(); i++) {
            for(int j = 0; j < randomNumber.length(); j++) {
                if(i != j && input.charAt(i) == randomNumber.charAt(j)) {
                    ballCount++;
                }
            }
        }
        return ballCount;
    }

}
