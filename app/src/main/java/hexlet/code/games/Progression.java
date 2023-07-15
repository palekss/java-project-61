package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;


public class Progression {
    private static Scanner scan = new Scanner(System.in);
    private static String nameUser;

    public static void starting() {
        nameUser = Engine.greeting();
        System.out.println("What number is missing in the progression?");
        game();
        Engine.congratulating(nameUser);
    }

    public static void game() {
        var i = 0;
        final var numberOfGameRounds = 3;
        while (i < numberOfGameRounds) {
            final int stringLength = 10;
            final int firstNumber = Engine.getRandomInt(1, 25);
            final int progressionDifference = Engine.getRandomInt(1, 10);
            int positionUnknownNumber = Engine.getRandomInt(1, stringLength) - 1;
            String unknownNumber = String.valueOf(firstNumber + progressionDifference * positionUnknownNumber);
            String answer = Engine.question(Engine.getProgressionString(stringLength, firstNumber,
                                                                        progressionDifference, positionUnknownNumber));
            if (answer.equals(unknownNumber)) {
                System.out.println("Correct!");
                i++;
            } else {
                Engine.mistake(answer, unknownNumber, nameUser);
            }
        }
    }
}
