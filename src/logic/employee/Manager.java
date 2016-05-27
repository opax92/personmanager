package logic.employee;

import logic.person.PersonDetails;

import java.util.Arrays;
import java.util.List;

/**
 * Created by seb on 26.05.16.
 */
public class Manager extends Employee {

    private List<Employee> employeeList;

    public Manager(PersonDetails personDetails, Double salary, String company, List<Employee> employees) {
        super(personDetails, salary, company);
        this.employeeList = employees;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + " pracownicy:" + Arrays.toString(employeeList.toArray());
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public void work() {
        System.out.print("Jestem menadzerem " + getPersonDetails().getName() + " i sobie pracuje!");
    }

}
