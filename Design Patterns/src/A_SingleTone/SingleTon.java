package A_SingleTone;

/**
 *
 * @author Simplx
 */
public final class SingleTon {

    private static SingleTon instance = null;
    private static int counter = 0;

    private SingleTon() {
        counter++;
        System.out.println(counter);
    }

    public static SingleTon getInstance() {

        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
