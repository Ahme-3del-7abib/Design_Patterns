package E_Dependancy_injection;

public class Main_Program {

    public static void main(String[] args) {
        
        // no Boilerplate code but Coupling , hard testing , hard editing :(
        A_Coffee coffee = new A_Coffee();
        coffee.getCoffeeCup();
        
        // Inversion of control but Boilerplate code :(
        B_Farm farm =new B_Farm();
        B_River river = new B_River();
        
        C_Solution_Coffee coffee1 = new C_Solution_Coffee(farm, river);
        coffee1.getCoffeeCup();
        
        // Dagger in android solve all these problems without Boilerpalte code :)
       
    }
}