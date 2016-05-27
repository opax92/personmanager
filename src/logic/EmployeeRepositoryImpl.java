package logic;

import logic.employee.Employee;
import logic.person.PersonDetails;
import repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by seb on 26.05.16.
 */
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee findEmployeeByPersonDetails(PersonDetails personDetails) {
        for (Employee employee : employees) {
            if (employee.getPersonDetails().equals(personDetails)) {
                return employee;
            }
        }

        return null;
    }

    @Override
    public List<Employee> findEmployeesBySalary(Double salary) {
        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getSalary().equals(salary)) {
                result.add(employee);
            }
        }

        if (result.isEmpty()) {
            return Collections.emptyList();
        }

        return result;
    }

    @Override
    public List<Employee> findEmployeesByCompany(String company) {
        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getCompany().equals(company)) {
                result.add(employee);
            }
        }


        if (result.isEmpty()) {
            return Collections.emptyList();
        }

        return result;
    }
}
