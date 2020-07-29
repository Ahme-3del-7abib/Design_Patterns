package A_SingleTone;

/**
 *
 * @author Simplx
 */
public class SingleTonMain {

    public static void main(String[] args) {
        
        
        SingleTon ton = SingleTon.getInstance();
        ton.printMessage("Hello :)");
        
        System.out.println("=====");
        
        SingleTon ton2 = SingleTon.getInstance();
        ton.printMessage("Hello :)");
        
    }
}
