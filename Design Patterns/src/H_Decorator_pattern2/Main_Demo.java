package H_Decorator_pattern2;

public class Main_Demo {

    public static void main(String[] args) {

        Shape circle = new RedCircle(new Circle());
        Shape circle2 = new Circle();

        circle.Draw();
        circle2.Draw();

    }
}
