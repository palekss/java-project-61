package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    private static Scanner scan = new Scanner(System.in);
    private static String nameUser;

    public static void starting() {
        nameUser = Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        game();
        Engine.congratulating(nameUser);
    }

    public static void game() {
        var i = 0;
        final var numberOfGameRounds = 3;
        while (i < numberOfGameRounds) {
            final int question = Engine.getRandomInt(1, 1000);
            String rightAnswer = "yes";
            if (question < 2) {
                rightAnswer = "no";
            }
            for (int a = 2; a <= question / 2; a++) {
                if (question % a == 0) {
                    rightAnswer = "no";
                }
            }
            String answer = Engine.question(String.valueOf(question));
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                Engine.mistake(answer, rightAnswer, nameUser);
            }
        }
    }
}
