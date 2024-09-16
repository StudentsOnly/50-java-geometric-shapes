package src.main.validators;

import src.main.castomExceptions.NegativeLengthException;

public abstract class LengthValidator {

    public static void validateLength(double length) throws NegativeLengthException {
        if (length <= 0) throw new NegativeLengthException("Length can't be negative or 0");
    }

    public static void validateLength(int length) throws NegativeLengthException {
        validateLength((double) length);
    }

    public static void validateLength(float length) throws NegativeLengthException {
        validateLength((double) length);
    }

}
