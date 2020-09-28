package H_Decorator_pattern;

public class BasicSandwitch implements Sandwitch {

    @Override
    public double getCost() {
        return 10.5;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }

}
