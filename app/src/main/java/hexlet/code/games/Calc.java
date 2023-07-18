package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static String gameCondition = "What is the result of the expression?";

    public static void starting() {
        Engine.greeting(gameCondition);
        for (var i = 0; i < Engine.numberRound; i++) {
            int firstNumber = Util.getRandomInt(0, 30);
            int secondNumber = Util.getRandomInt(0, 30);
            char symbol = getChar();
            var calcResultDependOnSymbol = 0;
            if (symbol == '+') {
                calcResultDependOnSymbol = firstNumber + secondNumber;
            } else if (symbol == '-') {
                calcResultDependOnSymbol = firstNumber - secondNumber;
            } else if (symbol == '*') {
                calcResultDependOnSymbol = firstNumber * secondNumber;
            }
            String question = firstNumber + " " + symbol + " " + secondNumber;
            Engine.game(question, String.valueOf(calcResultDependOnSymbol));
        }
    }

    public static char getChar() {
        char[] chars = new char[] {'+', '-', '*'};
        var randomSymbol = chars[Util.getRandomInt(0, chars.length - 1)];
        return randomSymbol;
    }
}
