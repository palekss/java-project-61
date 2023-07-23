package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static String gameCondition = "What number is missing in the progression?";
    static final int STRING_LENGTH = 10;

    public static void starting() {
        String[][] gameDatas = new String[Engine.NUMBER_ROUND][2];
        for (var i = 0; i < Engine.NUMBER_ROUND; i++) {
            final int firstNumber = Util.getRandomInt(1, 25);
            final int progressionDifference = Util.getRandomInt(1, 10);
            final int positionUnknownNumber = Util.getRandomInt(1, STRING_LENGTH) - 1;
            gameDatas[i][0] = getProgressionWithoutNumber(firstNumber, progressionDifference, positionUnknownNumber);
            gameDatas[i][1] = getRightAnswer(firstNumber, progressionDifference, positionUnknownNumber);
        }
        Engine.game(gameCondition, gameDatas);
    }

    public static String[] getArrayForProgression(int firstValue, int progressionDiff) {
        String[] numbers = new String[STRING_LENGTH];
        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = String.valueOf(firstValue + progressionDiff * i);
        }
        return numbers;
    }

    public static String getProgressionWithoutNumber(int firstValue, int progressionDiff, int positionUnknownValue) {
        String[] numbers = getArrayForProgression(firstValue, progressionDiff);
        numbers[positionUnknownValue] = "..";
        String question = "";
        for (var i = 0; i < numbers.length; i++) {
            question = question + numbers[i] + " ";
        }
        return question;
    }


    public static String getRightAnswer(int firstValue, int progressionDiff, int positionUnknownValue) {
        String rightAnswer = String.valueOf(firstValue + progressionDiff * positionUnknownValue);
        return rightAnswer;
    }
}
