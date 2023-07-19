package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static String gameCondition = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void starting() {
        Engine.greeting(gameCondition);
        for (int i = 0; i < Engine.numberRound; i++) {
            final int question = Util.getRandomInt(0, 1000);
            String rightAnswer = "yes";
            if (question % 2 != 0) {
                rightAnswer = "no";
            }
            Engine.game(String.valueOf(question), rightAnswer);
        }
        Engine.congratulating();
    }
}
