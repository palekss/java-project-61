package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    public static String gameCondition = "Find the greatest common divisor of given numbers.";

    public static void starting() {
        Engine.greeting(gameCondition);
        for (var i = 0; i < Engine.numberRound; i++) {
            final int firstNumber = Util.getRandomInt(1, 100);
            final int secondNumber = Util.getRandomInt(1, 100);
            int firstValue = firstNumber;
            int secondValue = secondNumber;
            int result = 0;
            while (firstValue != 0 && secondValue != 0) {
                if (firstValue > secondValue) {
                    firstValue = firstValue % secondValue;
                } else {
                    secondValue = secondValue % firstValue;
                }
                result = firstValue + secondValue;
            }
            String question = firstNumber + " " + secondNumber;
            Engine.game(question, String.valueOf(result));
        }
        Engine.congratulating();
    }
}
