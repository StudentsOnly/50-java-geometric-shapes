public class Circle implements GeometricShape{
    private double radius;
    static private String type = "Circle";


    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}