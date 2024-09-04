public class Rectangle implements GeometricShape{
    private double length;
    private double width;
    static private String type = "Rectangle";




    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}