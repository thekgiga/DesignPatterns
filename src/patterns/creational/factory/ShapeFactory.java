package patterns.creational.factory;

import patterns.creational.factory.model.Shape;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public interface ShapeFactory {

    public Shape getShape();
}
