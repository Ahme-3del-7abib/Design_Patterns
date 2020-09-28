package I_Strategy_Pattern;

public class ShoppingCard {

    private String customerName;
    private double billAmount;

    public  StrategyInterface interface1;

    // composition
    public ShoppingCard(StrategyInterface interface1) {
        this.interface1 = interface1;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getFinalBill() {
        return interface1.getFinalBill(this.billAmount);
    }
}
