package A_SingleTon_MultibleThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Simplx
 */
public class SingleTonMain {

    public static void main(String[] args) {
        
        List<Callable<Void>> taskList = new ArrayList<Callable<Void>>();

        Callable<Void> callable1 = getCallable_1();
        Callable<Void> callable2 = getCallable_2();

        taskList.add(callable1);
        taskList.add(callable2);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        try {
            executor.invokeAll(taskList);

        } catch (Exception e) {
        }

    }

    public static Callable<Void> getCallable_1() {

        Callable<Void> callable1 = new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                threadOne();
                return null;
            }
        };

        return callable1;
    }

    public static Callable<Void> getCallable_2() {

        Callable<Void> callable2 = new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                threadTwo();
                return null;
            }
        };

        return callable2;
    }

    public static void threadOne() {
        SingleTon ton = SingleTon.getInstance();
        ton.printMessage("Hello");
    }

    public static void threadTwo() {
        SingleTon ton2 = SingleTon.getInstance();
        ton2.printMessage("Hello World");
    }

}
