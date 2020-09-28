package H_Decorator_pattern2;

public class ShapeDecorator implements Shape {

    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void Draw() {
        shape.Draw();
    }

}
