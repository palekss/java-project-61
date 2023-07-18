package hexlet.code;

public class Util {
    public static Integer getRandomInt(int min, int max) {
        int randomNumber = min + (int) (Math.random() * ((max - min) + 1));
        return randomNumber;
    }
}
