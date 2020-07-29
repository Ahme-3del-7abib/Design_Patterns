package B_Factory_Design_Pattenrs;

public class EnemyFactory {

    public static final int TURTEL = 1;
    public static final int BIRD = 2;

    
    public static Enemy createEnemy(int sub_ID) {

        switch (sub_ID) {

            case 1:
                return new Turtel();

            case 2:
                return new Birdes();

            default:
                return null;

        }
    }

}
