package patterns.creational.factory.model;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("DRAWING TRIANGLE");
    }
}
