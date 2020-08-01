package E_Dependancy_injection;

public class C_Solution_Coffee {

    B_Farm farm;
    B_River river;

    public C_Solution_Coffee(B_Farm Farm, B_River river) {
        this.farm = Farm;
        this.river = river;
    }

    public void getCoffeeCup() {
        System.out.println(farm.getBeans() + " + " + river.getWater());
    }
}
