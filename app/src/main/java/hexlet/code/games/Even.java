package hexlet.code;

import java.util.Scanner;

//import java.lang.Math;

public class Even {

    static Scanner scan = new Scanner(System.in);

    static String nameUser;

    static void starting() {
//        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
//        nameUser = scan.next();
//        System.out.println("Hello, " + nameUser + "!\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
//        game();
//        System.out.println("Congratulations, " + nameUser + "!");
//        scan.close();
        nameUser = Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        game();
        Engine.congratulating(nameUser);
    }
    static void game() {
        var i = 0;
        while (i < 3) {
            int question = Engine.getRandomInt(0, 1000);
            String answer = Engine.question(String.valueOf(question));
//            System.out.print("Question: " + question + "\nYour answer: ");
//            String answer = scan.next();
            if ((answer.equals("yes") && (question % 2 == 0)) || (answer.equals("no") && (question % 2 != 0))) {
                System.out.println("Correct!");
                i++;
            } else {
                if (question % 2 == 0) {
//                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
//                            + "Let's try again, " + nameUser + "!");
//                    System.exit(0);
                    Engine.mistake(answer, "yes", nameUser);
                } else {
//                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
//                            + "Let's try again, " + nameUser + "!");
//                    System.exit(0);
                    Engine.mistake(answer, "no", nameUser);
                }
            }
        }
    }
}
