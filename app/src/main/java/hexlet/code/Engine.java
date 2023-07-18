package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static Scanner scan = new Scanner(System.in);
    private static String nameUser;
    public static final int numberRound = 3;

    public static void greeting(String gameCondition) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        nameUser = scan.next();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println(gameCondition);
    }

    public static void game(String question, String rightAnswer) {
        System.out.print("Question: " + question + "\nYour answer: ");
        String answer = scan.next();
        if (answer.equals(String.valueOf(rightAnswer))) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'."
                        + "\nLet's try again, " + nameUser + "!");
            System.exit(0);
        }
    }
}
