package Shape;

public class Result {
    public static void main(String[] args) {
        shape Shape;
        Shape = new Rectangle(10,15);
        Shape.area();

        Shape = new triangle(10,15);
        Shape.area();

        Shape = new Circle(10);
        Shape.area();
    }
}
