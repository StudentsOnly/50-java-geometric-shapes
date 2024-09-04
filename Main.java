import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<GeometricShape> shapes = new ArrayList<>();
        shapes.add(new Circle(12));
        shapes.add(new Circle((12.5)));
        shapes.add(new Rectangle(10, 12.5));
        shapes.add(new Rectangle(8.2, 20));
        shapes.add(new Triangle(13, 6.2));
        shapes.add(new Triangle(9.5, 7));

        ShapeCalculator calculator = new ShapeCalculator(shapes);
        calculator.displayInfo();
    }

}