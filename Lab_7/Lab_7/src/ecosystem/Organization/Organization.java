/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Organization;

import ecosystem.Employee.EmployeeDirectory;
import ecosystem.Geography.Location;
import ecosystem.Role.Role;
import ecosystem.UserAccount.UserAccountDirectory;
import ecosystem.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private int organizationID;
    private static int counter;
    private String organizationName;
    private Location organizationLocation;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;

    public Location getOrganizationLocation() {
        return organizationLocation;
    }

    public void setOrganizationLocation(Location organizationLocation) {
        this.organizationLocation = organizationLocation;
    }

    public static void setCounter(int aCounter) {
        counter = aCounter;
    }

    public enum Type {
        SYSTEM_ADMINISTRATION("System administration") {

        }, CDC("Centers for disease control and prevention") {

        }, PHD("State Public health department") {

        };
        private final String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    public Organization(String organizationName) {
        this.organizationName = organizationName;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return organizationName;
    }

}
