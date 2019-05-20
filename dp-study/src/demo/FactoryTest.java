package demo;

public class FactoryTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getCircleIntance();
        circle.draw();
        Shape rectangle = ShapeFactory.getRectangleIntance();
        rectangle.draw();
    }
}
