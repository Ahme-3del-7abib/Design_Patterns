package E_Dependancy_injection;

// The problem is Coupling, Hard Testing, Hard editing
public class A_Coffee {
    
    B_Farm farm;
    B_River river;

    public A_Coffee() {
        farm = new B_Farm();
        river = new B_River();
    }
    
    public void getCoffeeCup(){
        System.out.println(farm.getBeans()+ " + " + river.getWater());
    }
    
}
