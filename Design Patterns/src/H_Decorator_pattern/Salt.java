package H_Decorator_pattern;

public class Salt extends SandwitchDecorator {

    public Salt(Sandwitch sandwitch) {
        super(sandwitch);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Salt";
    }

}
