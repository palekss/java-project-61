package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    public static String gameCondition = "What number is missing in the progression?";

    public static void starting() {
        Engine.greeting(gameCondition);
        for (var i = 0; i < Engine.numberRound; i++) {
            final int stringLength = 10;
            final int firstNumber = Util.getRandomInt(1, 25);
            final int progressionDifference = Util.getRandomInt(1, 10);
            int positionUnknownNumber = Util.getRandomInt(1, stringLength) - 1;
            String unknownNumber = String.valueOf(firstNumber + progressionDifference * positionUnknownNumber);

            String[] numbers = new String[stringLength];
            for (var a = 0; a < numbers.length; a++) {
                numbers[a] = String.valueOf(firstNumber + progressionDifference * a);
            }
            numbers[positionUnknownNumber] = "..";
            String resultString = "";
            for (var b = 0; b < numbers.length; b++) {
                resultString = resultString + numbers[b] + " ";
            }

            Engine.game(resultString, unknownNumber);
        }
        Engine.congratulating();
    }
}
