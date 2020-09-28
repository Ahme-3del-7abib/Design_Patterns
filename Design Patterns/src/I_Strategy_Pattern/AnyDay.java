package I_Strategy_Pattern;

public class AnyDay implements StrategyInterface {

    @Override
    public double getFinalBill(double currentBill) {
        return currentBill;
    }

}
