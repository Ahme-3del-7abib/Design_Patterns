package H_Decorator_pattern;

public class Main_Program {

    public static void main(String[] args) {

        Sandwitch sandwitch = new Fool(new Salt(new BasicSandwitch()));

        System.out.printf("Description : %s\n", sandwitch.getDescription());
        System.out.printf("Cost : %.2f\n", sandwitch.getCost());
        
    }
}
