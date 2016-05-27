package repository;

import logic.employee.Employee;
import logic.person.PersonDetails;

import java.util.List;

/**
 * Created by seb on 26.05.16.
 */
public interface EmployeeRepository {

    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
    Employee findEmployeeByPersonDetails(PersonDetails personDetails);
    List<Employee> findEmployeesBySalary(Double salary);
    List<Employee> findEmployeesByCompany(String company);

}
