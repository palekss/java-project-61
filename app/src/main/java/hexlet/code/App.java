package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
        Scanner scan = new Scanner(System.in);
        String numberGame = scan.next();
        if (numberGame.equals("0")) {
            System.exit(0);
        } else if (numberGame.equals("1")) {
            System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
            String name = scan.next();
            System.out.println("Hello, " + name + "!");
        } else if (numberGame.equals("2")) {
            Even.greeting();
        } else {
            System.out.println("This game doesn't exist!");
            System.exit(0);
        }
    }
}
