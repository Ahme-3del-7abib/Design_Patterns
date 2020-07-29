package A_Eager_Loading_Singleton;

public class SingleTon {

    private final static SingleTon instance = new SingleTon();
    private static int counter = 0;

    private SingleTon() {
        counter++;
        System.out.println(counter);
    }

    public static SingleTon getInstance() {

        return instance;
    }

    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
