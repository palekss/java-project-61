package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    private static Scanner scan = new Scanner(System.in);
    private static String nameUser;

    public static void starting() {
        nameUser = Engine.greeting();
        System.out.println("What is the result of the expression?");
        game();
        Engine.congratulating(nameUser);
    }
    static void game() {
        var i = 0;
        final var numberOfGameRounds = 3;
        while (i < numberOfGameRounds) {
            final int firstNumber = Engine.getRandomInt(0, 30);
            final int secondNumber = Engine.getRandomInt(0, 30);
            char symbol = Engine.getChar();
            var calcResultDependOnSymbol = 0;
            if (symbol == '+') {
                calcResultDependOnSymbol = firstNumber + secondNumber;
            } else if (symbol == '-') {
                calcResultDependOnSymbol = firstNumber - secondNumber;
            } else if (symbol == '*') {
                calcResultDependOnSymbol = firstNumber * secondNumber;
            }
            String answer = Engine.question(firstNumber + " " + symbol + " " + secondNumber);
            if (answer.equals(String.valueOf(calcResultDependOnSymbol))) {
                System.out.println("Correct!");
                i++;
            } else {
                Engine.mistake(answer, String.valueOf(calcResultDependOnSymbol), nameUser);
            }
        }
    }
}
