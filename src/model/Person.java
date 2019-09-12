package model;

/**
 * @author Gordan Gigovic (gordan.gigovic@bosch.com)
 */
public class Person {

    //address
    private String name, lastName, street;

    //employment
    private String position, employer;
    private int income;

    @Override
    public String toString() {
        return "model.Person{" +
                "\n name='" + name + '\'' +
                ",\n lastName='" + lastName + '\'' +
                ",\n street='" + street + '\'' +
                ",\n position='" + position + '\'' +
                ",\n employer='" + employer + '\'' +
                ",\n income=" + income + "\n"+
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
