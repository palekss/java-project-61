package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {

    private static String gameCondition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void starting() {
        String[][] gameDatas = new String[Engine.NUMBER_ROUND][2];
        for (var i = 0; i < Engine.NUMBER_ROUND; i++) {
            final int question = Util.getRandomInt(1, 1000);
            gameDatas[i][0] = String.valueOf(question);
            gameDatas[i][1] = getRightAnswer(question);
        }
        Engine.game(gameCondition, gameDatas);
    }

    public static boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static String getRightAnswer(int number) {
        String rightAnswer;
        if (isPrime(number)) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
        return rightAnswer;
    }
}
