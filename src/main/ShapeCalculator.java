package src.main;

import src.main.shapes.Circle;
import src.main.shapes.Rectangle;
import src.main.shapes.Shape;
import src.main.shapes.Triangle;

import java.io.InvalidObjectException;
import java.util.ArrayList;

public class ShapeCalculator {
    private ArrayList<Shape> shapes;

    public ShapeCalculator() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape newShape) throws InvalidObjectException {
        if (newShape == null) throw new InvalidObjectException("Shape can't be null");
        shapes.add(newShape);
    }

    /*
    Run-time polymorphism
     */
    public void calculateAndDisplayAreasRunTime() {
        System.out.println("Run-time polymorphism");
        for (var shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName() + ", Area: " + shape.calculateArea());
        }
    }

    /*
    Compile-time polymorphism
     */
    private double calculateArea(Circle circle) {
        return Math.pow(circle.getRadius(), 2) * Math.PI;
    }

    private double calculateArea(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    private double calculateArea(Triangle triangle) {
        return triangle.getBase() * triangle.getHeight() / 2;
    }

    public void calculateAndDisplayAreasCompileTime() {
        System.out.println("Compile-time polymorphism");
        for (var shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Shape: " + shape.getClass().getSimpleName() + ", Area: " + calculateArea((Circle) shape));
            } else if (shape instanceof Rectangle) {
                System.out.println("Shape: " + shape.getClass().getSimpleName() + ", Area: " + calculateArea((Rectangle) shape));
            } else if (shape instanceof Triangle) {
                System.out.println("Shape: " + shape.getClass().getSimpleName() + ", Area: " + calculateArea((Triangle) shape));
            }
        }
    }

}