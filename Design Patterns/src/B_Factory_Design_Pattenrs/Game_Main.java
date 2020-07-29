package B_Factory_Design_Pattenrs;

import java.util.Random;

public class Game_Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Enemy enemy = EnemyFactory.createEnemy(getRandom(1, 2));
            enemy.showData();
        }
    }

    public static int getRandom(int min, int max) {

        return random.nextInt((max - min) + 1) + min;
    }
}
