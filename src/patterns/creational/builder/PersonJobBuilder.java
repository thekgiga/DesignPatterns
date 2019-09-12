package patterns.creational.builder;

import model.Person;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder onPosition(String position) {
        person.setPosition(position);
        return this;
    }

    public PersonJobBuilder atEmployer(String employer) {
        person.setEmployer(employer);
        return this;
    }

    public PersonJobBuilder withIncome(int income) {
        person.setIncome(income);
        return this;
    }
}
