package H_Decorator_pattern;

public abstract class SandwitchDecorator implements Sandwitch {

    private Sandwitch sandwitch;

    public SandwitchDecorator(Sandwitch sandwitch) {
        this.sandwitch = sandwitch;
    }

    @Override
    public double getCost() {
        return sandwitch.getCost();
    }

    @Override
    public String getDescription() {
        return sandwitch.getDescription();
    }

}
