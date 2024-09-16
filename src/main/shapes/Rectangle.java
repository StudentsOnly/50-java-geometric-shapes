package src.main.shapes;

import src.main.castomExceptions.NegativeLengthException;
import src.main.validators.LengthValidator;

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) throws NegativeLengthException {
        LengthValidator.validateLength(length);
        LengthValidator.validateLength(width);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
