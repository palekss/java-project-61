package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static String gameCondition = "What is the result of the expression?";

    public static void starting() {
        String[][] gameDatas = new String[Engine.NUMBER_ROUND][2];
        for (var i = 0; i < Engine.NUMBER_ROUND; i++) {
            final int firstNumber = Util.getRandomInt(0, 30);
            final int secondNumber = Util.getRandomInt(0, 30);
            char symbol = getChar();
            String question = firstNumber + " " + symbol + " " + secondNumber;
            gameDatas[i][0] = question;
            gameDatas[i][1] = getRightAnswer(symbol, firstNumber, secondNumber);
        }
        Engine.game(gameCondition, gameDatas);
    }

    public static char getChar() {
        char[] chars = new char[] {'+', '-', '*'};
        var randomSymbol = chars[Util.getRandomInt(0, chars.length - 1)];
        return randomSymbol;
    }
    public static String getRightAnswer(char symbol, int firstNumber, int secondNumber) {
        var calcResultDependOnSymbol = 0;
        if (symbol == '+') {
            calcResultDependOnSymbol = firstNumber + secondNumber;
        } else if (symbol == '-') {
            calcResultDependOnSymbol = firstNumber - secondNumber;
        } else if (symbol == '*') {
            calcResultDependOnSymbol = firstNumber * secondNumber;
        }
        return String.valueOf(calcResultDependOnSymbol);
    }
}
