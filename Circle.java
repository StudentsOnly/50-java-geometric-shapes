public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        shapeName = "Circle";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
