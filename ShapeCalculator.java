import java.util.ArrayList;

public class ShapeCalculator {
    private ArrayList<Shape> shapes;

    public ShapeCalculator() {
        this.shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }

    /*
    Run-time polymorphism
     */
    public void calculateAndDisplayAreas() {
        System.out.println("Run-time polymorphism");
        for (var shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getName() + ", Area: " + shape.calculateArea());
        }
    }

    /*
    Compile-time polymorphism
     */
    private double calculateArea(Circle circle) {
        return Math.pow(circle.getRadius(), 2) * Math.PI;
    }

    private double calculateArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    private double calculateArea(Triangle triangle) {
        return triangle.getBase() * triangle.getHeight() / 2;
    }

    public void displayAreas() {
        System.out.println("Compile-time polymorphism");
        for (var shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Shape: " + shape.getClass().getName() + ", Area: " + calculateArea((Circle) shape));
            } else if (shape instanceof Rectangle) {
                System.out.println("Shape: " + shape.getClass().getName() + ", Area: " + calculateArea((Rectangle) shape));
            } else if (shape instanceof Triangle) {
                System.out.println("Shape: " + shape.getClass().getName() + ", Area: " + calculateArea((Triangle) shape));
            }
        }
    }

}