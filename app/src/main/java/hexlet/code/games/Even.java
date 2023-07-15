package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

//import java.lang.Math;

public class Even {

    private static Scanner scan = new Scanner(System.in);

    private static String nameUser;

    public static void starting() {
        nameUser = Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        game();
        Engine.congratulating(nameUser);
    }
    static void game() {
        var i = 0;
        final var numberOfGameRounds = 3;
        while (i < numberOfGameRounds) {
            final int question = Engine.getRandomInt(0, 1000);
            String answer = Engine.question(String.valueOf(question));
            if ((answer.equals("yes") && (question % 2 == 0)) || (answer.equals("no") && (question % 2 != 0))) {
                System.out.println("Correct!");
                i++;
            } else {
                if (question % 2 == 0) {
                    Engine.mistake(answer, "yes", nameUser);
                } else {
                    Engine.mistake(answer, "no", nameUser);
                }
            }
        }
    }
}
