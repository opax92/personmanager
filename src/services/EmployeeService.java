package services;

import logic.employee.Employee;
import logic.person.PersonDetails;
import logic.EmployeeRepositoryImpl;
import repository.EmployeeRepository;

import java.util.List;

/**
 * Created by seb on 26.05.16.
 */
public class EmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    public void addEmployee(Employee employee){
        employeeRepository.addEmployee(employee);
    }

    public Employee getEmployee(PersonDetails personDetails){
        return employeeRepository.findEmployeeByPersonDetails(personDetails);
    }

    public List<Employee> getEmployee(String comapny){
        return employeeRepository.findEmployeesByCompany(comapny);
    }

    public List<Employee> getEmployee(Double salary){
        return employeeRepository.findEmployeesBySalary(salary);
    }
}
