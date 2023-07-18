package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit"
                + "\nYour choice: ");
        Scanner scan = new Scanner(System.in);
        String numberGame = scan.next();
        if (numberGame.equals("0")) {
            System.exit(0);
        } else if (numberGame.equals("1")) {
            Cli.greeting();
//        } else if (numberGame.equals("2")) {
//            Even.starting();
        } else if (numberGame.equals("3")) {
            Calc.starting1();
//        } else if (numberGame.equals("4")) {
//            GCD.starting();
//        } else if (numberGame.equals("5")) {
//            Progression.starting();
//        } else if (numberGame.equals("6")) {
//            Prime.starting();
        } else {
            System.out.println("This game doesn't exist!");
            System.exit(0);
        }
    }
}
