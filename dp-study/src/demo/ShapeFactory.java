package demo;

public class ShapeFactory {
    public static Shape getCircleIntance(){
        return new Circle();
    }
    public static Shape getRectangleIntance(){
        return new Rectangle();
    }
}
