package logic.employee;

import logic.person.Person;
import logic.person.PersonDetails;

/**
 * Created by seb on 26.05.16.
 */
public class Employee extends Person implements Position, Working {

    private Double salary;
    private String company;

    public Employee(PersonDetails personDetails, double salary, String company) {
        super(personDetails);
        this.salary = salary;
        this.company = company;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String introduceYourself() {
        return getPosition() + " " + " Imię: " + getPersonDetails().getName() + " wiek " + getPersonDetails().getAge() +
                " Zarobki: " + getSalary() + " firma: " + getCompany();
    }

    @Override
    public String getPosition() {
        return "Zwykly pracownik";
    }

    @Override
    public String toString() {
        return getPersonDetails().getName();
    }

    @Override
    public void work() {
        System.out.println("Jestem zwyklym pracownikiem " + getPersonDetails().getName() + " i sobie pracuje!");
    }
}