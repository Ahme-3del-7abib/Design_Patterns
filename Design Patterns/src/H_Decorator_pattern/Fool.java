package H_Decorator_pattern;

public class Fool extends SandwitchDecorator {

    public Fool(Sandwitch sandwitch) {
        super(sandwitch);
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Fool";
    }

}
