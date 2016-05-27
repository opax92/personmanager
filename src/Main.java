import logic.employee.Employee;
import logic.employee.Manager;
import logic.person.PersonDetails;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static EmployeeService employeeService = new EmployeeService();

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee = new Employee(new PersonDetails("Pracownik", 25), 3000, "company1");
        Employee employee1 = new Employee(new PersonDetails("Pracownik2", 30), 3500, "company2");
        Employee employee2 = new Employee(new PersonDetails("Pracownik3", 35), 4000, "company3");
        Employee employee3 = new Employee(new PersonDetails("Pracownik4", 40), 4400, "company3");

        employeeList.add(employee);
        employeeList.add(employee1);

        employeeService.addEmployee(employee);
        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);
        employeeService.addEmployee(employee3);
        employeeService.addEmployee(new Manager(new PersonDetails("Manager", 35), 8000.0, "company3", employeeList));

        List<Employee> employeesFromCompany3 = employeeService.getEmployee("company3");

        for(Employee e : employeesFromCompany3){
            e.work();
        }

    }
}