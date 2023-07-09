package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n0 - Exit"
                + "\nYour choice: ");
        Scanner scan = new Scanner(System.in);
        String numberGame = scan.next();
        if (numberGame.equals("0")) {
            System.exit(0);
        } else if (numberGame.equals("1")) {
            Engine.greeting();
        } else if (numberGame.equals("2")) {
            Even.starting();
        } else if (numberGame.equals("3")) {
            Calc.starting();
        } else {
            System.out.println("This game doesn't exist!");
            System.exit(0);
        }
    }
}
