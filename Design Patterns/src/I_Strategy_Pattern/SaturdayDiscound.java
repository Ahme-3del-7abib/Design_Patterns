package I_Strategy_Pattern;

public class SaturdayDiscound implements StrategyInterface {

    @Override
    public double getFinalBill(double currentBill) {
        return currentBill * (20 / 100);
    }
}
