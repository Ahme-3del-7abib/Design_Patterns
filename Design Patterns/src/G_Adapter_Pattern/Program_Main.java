package G_Adapter_Pattern;

public class Program_Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        playVehicle(car);

        System.out.println("\n");

        Vehicle bicycle = new MyAdapter(new Bicycle());
        playVehicle(bicycle);
    }

    private static void playVehicle(Vehicle vehicle) {
        vehicle.accelarate();
        vehicle.pushBreak();
        vehicle.soundHourn();
    }
}
