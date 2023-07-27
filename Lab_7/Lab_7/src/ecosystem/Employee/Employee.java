/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Employee;

/**
 *
 *
 * @author raunak
 */
public class Employee {

    private final int EMPLOYEE_ID;
    private static int count = 1;
    private String employeeName;
    private EmployeePosition employmentPosition;

    public enum EmployeePosition {
        SYSTEM_ADMIN, REGISTERED_DOCTOR, REGISTERED_NURSE, INVENTORY_MANAGER;
    }

    public Employee() {
        EMPLOYEE_ID = count;
        count++;
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public EmployeePosition getEmploymentPosition() {
        return employmentPosition;
    }

    public void setEmploymentPosition(EmployeePosition employmentPosition) {
        this.employmentPosition = employmentPosition;
    }

    @Override
    public String toString() {
        return employeeName;
    }

}
