package hexlet.code;

import java.util.Scanner;
public class Cli {
    static void greeting() {
        System.out.print("May I have your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name + "!");
        scan.close();
    }
}
