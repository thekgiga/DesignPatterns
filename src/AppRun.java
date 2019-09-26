import model.Person;
import patterns.creational.builder.PersonBuilder;
import patterns.creational.factory.RandomShapeFactory;
import patterns.creational.factory.ShapeFactory;
import patterns.creational.factory.model.Shape;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class AppRun {
    public static void main(String[] args) {
//        runBuildPattern();
        runFactoryPattern();
    }

    private static void runBuildPattern() {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                .withName("NAME_EXAMPLE")
                .withLastName("LAST_EXAMPLE")
                .inStreet("STREET_EXAMPLE")
                .works()
                .atEmployer("BOSCH")
                .onPosition("SOFTWARE DEVELOPER")
                .withIncome(123456)
                .build();

        System.out.println(person);
    }

    private static void runFactoryPattern() {

        ShapeFactory randomShapeFactory = new RandomShapeFactory();

        while (true) {
            randomShapeFactory.getShape().draw();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
