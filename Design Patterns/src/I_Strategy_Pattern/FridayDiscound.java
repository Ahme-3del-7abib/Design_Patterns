package I_Strategy_Pattern;

public class FridayDiscound implements StrategyInterface {

    @Override
    public double getFinalBill(double currentBill) {
        return currentBill * (50 / 100);
    }

}
