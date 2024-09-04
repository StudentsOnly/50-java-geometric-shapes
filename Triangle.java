public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        shapeName = "Triangle";

    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
