import java.util.ArrayList;

public class ShapeCalculator {

    private ArrayList<GeometricShape> shapes;

    public ShapeCalculator(ArrayList<GeometricShape> shapes){
        this.shapes = shapes;
    }

    public double calculateArea(GeometricShape shape){
        return shape.calculateArea();
    }

    public void displayInfo(){
        System.out.println("All shapes:");
        for(GeometricShape shape: shapes){
            System.out.println("\t'" + shape.getType() + "', area = " + String.format("%.2f", calculateArea(shape)));
        }
    }
}
