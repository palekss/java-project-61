package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
public class GCD {
    static Scanner scan = new Scanner(System.in);
    static String nameUser;

    public static void starting() {
        nameUser = Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        game();
        Engine.congratulating(nameUser);
    }

    public static void game() {
        var i = 0;
        while (i < 3) {
            int firstNumber = Engine.getRandomInt(1, 100);
            int secondNumber = Engine.getRandomInt(1, 100);
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
            String answer = Engine.question(firstNumber + " " + secondNumber);
            if (answer.equals(String.valueOf(result))) {
                System.out.println("Correct!");
                i++;
            } else {
                Engine.mistake(answer, String.valueOf(result), nameUser);
            }
        }
    }
}
