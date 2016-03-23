package util;

import java.util.Random;

public class Math {

    private static final String BadRange = "variable `max` bound must be greater than `min`";

    public static int RandomRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException(BadRange);
        }

        Random random = new Random();
        int randomNumber = random.nextInt((max - min)) + min;
        return randomNumber;
    }
}
