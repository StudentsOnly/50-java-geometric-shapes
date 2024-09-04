import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCalculator {

    public static void main(String[] args) {

        List<Geometry> geometries = new ArrayList<>(Arrays.asList(
                new Triangle(2, 3),
                new Rectangle(2, 2),
                new Circle(3)
        ));

        geometries.forEach(g -> System.out.println(
                g.getClass().getSimpleName() + " Area: " + g.calculateArea()));
    }

}
