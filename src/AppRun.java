import model.Person;
import patterns.creational.builder.PersonBuilder;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class AppRun {
    public static void main(String[] args) {

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
}
