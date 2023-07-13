package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Prime {
    static Scanner scan = new Scanner(System.in);
    static String nameUser;

    public static void starting() {
        nameUser = Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        game();
        Engine.congratulating(nameUser);
    }

    public static void game() {
        var i = 0;
        while (i < 3) {
            int question = Engine.getRandomInt(1, 1000);
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
