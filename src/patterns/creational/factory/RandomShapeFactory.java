package patterns.creational.factory;

import patterns.creational.factory.model.Circle;
import patterns.creational.factory.model.Shape;
import patterns.creational.factory.model.Square;
import patterns.creational.factory.model.Triangle;

import java.util.Random;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class RandomShapeFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        switch (getRandomNumber()) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
        return null;
    }

    private int getRandomNumber() {
        return new Random().ints(1, 0, 3).toArray()[0];
    }
}
