package src.main.shapes;

import src.main.castomExceptions.NegativeLengthException;
import src.main.validators.LengthValidator;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) throws NegativeLengthException {
        LengthValidator.validateLength(base);
        LengthValidator.validateLength(height);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return height * base / 2;
    }
}
