public class Triangle implements GeometricShape{

    private double base;
    private double height;
    static private String type = "Triangle";


    public Triangle(double base, double height){
        this.base = base;
        this.height = height;

    }
    @Override
    public String getType() {
        return type;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}
