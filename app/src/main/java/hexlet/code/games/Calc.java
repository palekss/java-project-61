package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
//    private static Scanner scan = new Scanner(System.in);
//    private static String nameUser;
    public static String gameCondition = "What is the result of the expression?";
    public static String question = "";

//    public static int calc = 0;

    public static void starting1() {
        final int firstNumber = Util.getRandomInt(0, 30);
        final int secondNumber = Util.getRandomInt(0, 30);
        char symbol = Engine.getChar();
        var calcResultDependOnSymbol = 0;
//        for (var i = 0; i < Engine.numberRound; i++) {
            if (symbol == '+') {
                calcResultDependOnSymbol = firstNumber + secondNumber;
            } else if (symbol == '-') {
                calcResultDependOnSymbol = firstNumber - secondNumber;
            } else if (symbol == '*') {
                calcResultDependOnSymbol = firstNumber * secondNumber;
            }
            question = firstNumber + " " + symbol + " " + secondNumber;
//            System.out.println(gameCondition);
//            System.out.println(question);
//            System.out.println(calcResultDependOnSymbol);
//            System.out.println(checking(Engine.answer, calcResultDependOnSymbol));
            Engine.greeting1(gameCondition, question, String.valueOf(calcResultDependOnSymbol), isRight(Engine.answer, calcResultDependOnSymbol));
//            i++;
//        }
    }
    public static boolean isRight(String answer, int result) {
        boolean a;
        a = !answer.equals(String.valueOf(result));
        return a;
    }



//    public static void starting() {
//        nameUser = Engine.greeting();
//        System.out.println("What is the result of the expression?");
//        game();
//        Engine.congratulating(nameUser);
//    }
//    static void game() {
//        var i = 0;
////        final var numberOfGameRounds = 3;
//        while (i < Engine.numberRound) {
//            final int firstNumber = Util.getRandomInt(0, 30);
//            final int secondNumber = Util.getRandomInt(0, 30);
//            char symbol = Engine.getChar();
//            var calcResultDependOnSymbol = 0;
//            if (symbol == '+') {
//                calcResultDependOnSymbol = firstNumber + secondNumber;
//            } else if (symbol == '-') {
//                calcResultDependOnSymbol = firstNumber - secondNumber;
//            } else if (symbol == '*') {
//                calcResultDependOnSymbol = firstNumber * secondNumber;
//            }
//            String answer = Engine.question(firstNumber + " " + symbol + " " + secondNumber);
//            if (answer.equals(String.valueOf(calcResultDependOnSymbol))) {
//                System.out.println("Correct!");
//                i++;
//            } else {
//                Engine.mistake(answer, String.valueOf(calcResultDependOnSymbol), nameUser);
//            }
//        }
//    }
}
