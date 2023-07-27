/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employeeList.add(employee);
        return employee;
    }
}
