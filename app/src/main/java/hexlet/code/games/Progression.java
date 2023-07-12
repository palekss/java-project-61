package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;


public class Progression {
    static Scanner scan = new Scanner(System.in);
    static String nameUser;

    public static void starting() {
        nameUser = Engine.greeting();
        System.out.println("What number is missing in the progression?");
        game();
        Engine.congratulating(nameUser);
    }

    public static void game() {
        var i = 0;
        while (i < 3) {
            int stringLength = 10;
            int firstNumber = Engine.getRandomInt(1, 25);
            int progressionDifference = Engine.getRandomInt(1, 10);
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
