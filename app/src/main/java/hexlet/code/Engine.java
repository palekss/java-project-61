package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner scan = new Scanner(System.in);
    private static String nameUser;
    public static final int NUMBER_ROUND = 3;

    public static void game(String gameCondition, String[][] gameDatas) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        nameUser = scan.next();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println(gameCondition);
        for (int i = 0; i < NUMBER_ROUND; i++) {
            System.out.print("Question: " + gameDatas[i][0] + "\nYour answer: ");
            String answer = scan.next();
            if (answer.equals(gameDatas[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + gameDatas[i][1] + "'." + "\nLet's try again, " + nameUser + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Engine.nameUser + "!");
    }
}
