package src.main;

import src.main.castomExceptions.NegativeLengthException;
import src.main.shapes.Circle;
import src.main.shapes.Rectangle;
import src.main.shapes.Shape;
import src.main.shapes.Triangle;

import java.io.InvalidObjectException;

public class Main {
    static ShapeCalculator shapeCalculator = new ShapeCalculator();

    public static void main(String[] args) {
        Rectangle rectangle1 = handleRectangleCreation(-1, 2);
        Rectangle rectangle2 = handleRectangleCreation(2.5, 5);

        Triangle triangle1 = handleTriangleCreation(0, 3);
        Triangle triangle2 = handleTriangleCreation(10, 5);

        Circle circle1 = handleCircleCreation(9);
        Circle circle2 = handleCircleCreation(-10);

        handleShapeAdding(rectangle1);
        handleShapeAdding(rectangle2);

        handleShapeAdding(triangle1);
        handleShapeAdding(triangle2);

        handleShapeAdding(circle1);
        handleShapeAdding(circle2);

        System.out.println();
        shapeCalculator.calculateAndDisplayAreasCompileTime();
        System.out.println();
        shapeCalculator.calculateAndDisplayAreasRunTime();
    }

    static void handleShapeAdding(Shape shape) {
        try {
            shapeCalculator.addShape(shape);
        } catch (InvalidObjectException e) {
            System.out.println("Shape can't be added.\n\t" + e);
        }
    }

    static Rectangle handleRectangleCreation(double length, double width) {
        try {
            return new Rectangle(length, width);
        } catch (NegativeLengthException e) {
            System.out.println("Rectangle can't be created.\n\tException: " + e);
        }
        return null;
    }

    static Circle handleCircleCreation(double radius) {
        try {
            return new Circle(radius);
        } catch (NegativeLengthException e) {
            System.out.println("Circle can't be created.\n\tException: " + e);
        }
        return null;
    }

    static Triangle handleTriangleCreation(double base, double height) {
        try {
            return new Triangle(base, height);
        } catch (NegativeLengthException e) {
            System.out.println("Triangle can't be created.\n\tException: " + e);
        }
        return null;
    }


}
