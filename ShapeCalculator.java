public class ShapeCalculator {

    // Overloaded methods
    public double calculateArea(double radius) { // Circle
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) { // Rectangle
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) { // Triangle
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        // compile-time polymorphism
        ShapeCalculator calculator = new ShapeCalculator();
        System.out.println("Area of Circle (compile-time PM): " + calculator.calculateArea(7.0));
        System.out.println("Area of Rectangle (compile-time PM): " + calculator.calculateArea(5.0, 3.0));
        System.out.println("Area of Triangle (compile-time PM): " + calculator.calculateArea(6.0, 4.0, true));

        // runtime polymorphism
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(7.0);
        shapes[1] = new Rectangle(5.0, 3.0);
        shapes[2] = new Triangle(6.0, 4.0);

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.shapeName +" (runtime PM): " + shape.calculateArea());
        }
    }
}
