public class Main {
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();

        sc.addShape(new Rectangle(5, 2));
        sc.addShape(new Triangle(5, 2));
        sc.addShape(new Circle(5));

        sc.calculateAndDisplayAreas();
        System.out.println();
        sc.displayAreas();
    }

}
