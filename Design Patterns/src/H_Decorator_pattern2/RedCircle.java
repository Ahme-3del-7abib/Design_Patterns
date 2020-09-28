package H_Decorator_pattern2;

// Add new feature on circle
public class RedCircle extends ShapeDecorator {

    public RedCircle(Shape shape) {
        super(shape);
    }

    @Override
    public void Draw() {

        setRed();
    }

    private void setRed() {
        System.out.println("Red Circle");
    }

}
