/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem;

import ecosystem.Employee.Employee;
import ecosystem.Employee.Employee.EmployeePosition;
import ecosystem.Organization.SystemAdminOrganization;
import ecosystem.Role.SystemAdministrationRole;
import ecosystem.UserAccount.UserAccount;

/**
 *
 * @author neeraj
 */
public class ConfigureEcoSystem {

    public static EcoSystem configure() {
        EcoSystem ecosystem = EcoSystem.getInstance();

        SystemAdminOrganization adminOrganization = new SystemAdminOrganization();
        ecosystem.getOrganizationDirectory().addOrganization(adminOrganization);

        Employee systemAdmin = new Employee();
        systemAdmin.setEmployeeName("Administrator");
        systemAdmin.setEmploymentPosition(EmployeePosition.SYSTEM_ADMIN);

        UserAccount admin = new UserAccount();
        admin.setUsername("admin");
        admin.setPassword("admin");
        admin.setEcosystemRole(new SystemAdministrationRole());
        admin.setEmployeeName(systemAdmin);

        adminOrganization.getEmployeeDirectory().addEmployee(systemAdmin);
        adminOrganization.getUserAccountDirectory().addUserAccount(admin);

        return ecosystem;
    }

}
