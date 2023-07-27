/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.UserAccount;

import ecosystem.Employee.Employee;
import ecosystem.Role.Role;
import ecosystem.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employeeName;
    private Role ecosystemRole;
    private final WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getEcosystemRole() {
        return ecosystemRole;
    }

    public void setEmployeeName(Employee employeeName) {
        this.employeeName = employeeName;
    }

    public void setEcosystemRole(Role ecosystemRole) {
        this.ecosystemRole = ecosystemRole;
    }

    public Employee getEmployeeName() {
        return employeeName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return username;
    }

}
