package com.starscape.objects;

import java.util.Random;

public class Dice {
    private static final Random random = new Random();

    public static int roll2D6() {
        return rollD6() + rollD6();
    }

    private static int rollD6() {
        return random.nextInt(6) + 1;
    }

    public static int roll1D10() {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 11);
    }
}
