package patterns.creational.builder;

import model.Person;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder withName(String name) {
        person.setName(name);
        return this;
    }

    public PersonAddressBuilder withLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    public PersonAddressBuilder inStreet(String street) {
        person.setStreet(street);
        return this;
    }
}
