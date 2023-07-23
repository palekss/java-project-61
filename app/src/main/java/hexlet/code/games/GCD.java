package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static String gameCondition = "Find the greatest common divisor of given numbers.";

    public static void starting() {
        String[][] gameDatas = new String[Engine.NUMBER_ROUND][2];
        for (var i = 0; i < Engine.NUMBER_ROUND; i++) {
            final int firstNumber = Util.getRandomInt(1, 100);
            final int secondNumber = Util.getRandomInt(1, 100);
            String question = firstNumber + " " + secondNumber;
            gameDatas[i][0] = question;
            gameDatas[i][1] = getRightAnswer(firstNumber, secondNumber);
        }
        Engine.game(gameCondition, gameDatas);
    }

    public static String getRightAnswer(int firstValue, int secondValue) {
        while (firstValue != 0 && secondValue != 0) {
            if (firstValue > secondValue) {
                firstValue = firstValue % secondValue;
            } else {
                secondValue = secondValue % firstValue;
            }
        }
        return String.valueOf(firstValue + secondValue);
    }
}
