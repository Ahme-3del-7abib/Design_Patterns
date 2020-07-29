package A_SingleTon_MultibleThread;

/**
 *
 * @author Simplx
 */
public class SingleTon {

    private static SingleTon instance = null;
    private static int counter = 0;

    private SingleTon() {
        counter++;
        System.out.println(counter);
    }

    public static synchronized SingleTon getInstance() {

        if (instance == null) {
            instance = new SingleTon();
        }

        return instance;
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
