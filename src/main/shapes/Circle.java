package src.main.shapes;

import src.main.castomExceptions.NegativeLengthException;
import src.main.validators.LengthValidator;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws NegativeLengthException {
        LengthValidator.validateLength(radius);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}