package G_Adapter_Pattern;

public class Car implements Vehicle {

    @Override
    public void accelarate() {
        System.out.println("Car start to move");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car stoped");
    }

    @Override
    public void soundHourn() {
        System.out.println("Beep Beep");
    }

}
