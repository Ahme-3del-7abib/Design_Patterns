package Test_Package;

public class Main_Program {

    public static void main(String[] args) {

        Fool f = new Fool();

        Salt s = new Salt();

        
        getSandwitch(f, s);
    }

    private static void getSandwitch(Fool f, Salt s) {

        double d = f.Cost() + s.Cost();
        System.out.println("Cost = " + d);

        System.out.println("Des = " + f.Description() + "" + s.Description() + "");
    }

}
