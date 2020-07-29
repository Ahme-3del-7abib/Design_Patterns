package B_Factory_With_Singleton;

public class Program_Main {

    public static void main(String[] args) {

        Factory factory = Factory.getInstance();

        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = factory.getShape("SQUARE");
        square.draw();

    }
}
