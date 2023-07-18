package hexlet.code;

import hexlet.code.games.Calc;

import java.util.Scanner;

public class Engine {
    public static Scanner scan = new Scanner(System.in);
    private static String nameUser;
    public static String answer = "";
    public static final int numberRound = 3;


    public static void greeting1(String gameCondition, String question, String rightAnswer, boolean a) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        nameUser = scan.next();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println(gameCondition);
        for (var i = 0; i < numberRound; i++) {
            System.out.print("Question: " + question + "\nYour answer: ");
            answer = scan.next();
            if (a) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'."
                        + "\nLet's try again, " + nameUser + "!");
                System.exit(0);
            }
        }
    }






    public static String greeting() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        nameUser = scan.next();
        System.out.println("Hello, " + nameUser + "!");
        return nameUser;
    }

    public static void congratulating(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    public static void mistake(String answer1, String rightAnswer, String name) {
        System.out.println("'" + answer1 + "'" + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'."
                + "\nLet's try again, " + name + "!");
        System.exit(0);
    }

    public static String question(String question) {
        System.out.print("Question: " + question + "\nYour answer: ");
        String answer1 = scan.next();
        return answer1;
    }

//    public static Integer getRandomInt(int min, int max) {
//        int randomNumber = min + (int) (Math.random() * ((max - min) + 1));
//        return randomNumber;
//    }

    public static char getChar() {
        char[] chars = new char[] {'+', '-', '*'};
        var randomSymbol = chars[Util.getRandomInt(0, chars.length - 1)];
        return randomSymbol;
    }

    public static String getProgressionString(int stringLength, int firstNumber,
                                              int progressionDifference, int positionUnknownNumber) {
        String[] numbers = new String[stringLength];
        for (var a = 0; a < numbers.length; a++) {
            numbers[a] = String.valueOf(firstNumber + progressionDifference * a);
        }
        numbers[positionUnknownNumber] = "..";
        String resultString = "";
        for (var b = 0; b < numbers.length; b++) {
            resultString = resultString + numbers[b] + " ";
        }
        return resultString;
    }
}
