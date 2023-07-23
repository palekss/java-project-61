package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;


public class Even {
    private static String gameCondition = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void starting() {
        String[][] gameDatas = new String[Engine.NUMBER_ROUND][2];
        for (int i = 0; i < Engine.NUMBER_ROUND; i++) {
            final int question = Util.getRandomInt(0, 1000);
            gameDatas[i][0] = String.valueOf(question);
            gameDatas[i][1] = getRightAnswer(question);
        }
        Engine.game(gameCondition, gameDatas);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static String getRightAnswer(int number) {
        String rightAnswer;
        if (isEven(number)) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
        return rightAnswer;
    }
}
