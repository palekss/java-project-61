package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {

    private static String gameCondition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void starting() {
        Engine.greeting(gameCondition);
        for (var i = 0; i < Engine.NUMBER_ROUND; i++) {
            final int question = Util.getRandomInt(1, 1000);
            String rightAnswer = "yes";
            if (question < 2) {
                rightAnswer = "no";
            }
            for (int a = 2; a <= question / 2; a++) {
                if (question % a == 0) {
                    rightAnswer = "no";
                }
            }
            Engine.game(String.valueOf(question), rightAnswer);
        }
        Engine.congratulating();
    }
}
