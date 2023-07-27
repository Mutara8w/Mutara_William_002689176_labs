/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem;

import ecosystem.Organization.SystemAdministration.SystemAdminOrganization;
import ecosystem.Role.SystemAdministrationRole.SystemAdministrationRole;
import ecosystem.UserAccount.UserAccount;
import ecosystem.Employee.Employee;
import ecosystem.Employee.Employee.EmployeePosition;

/**
 *
 * @author neeraj
 */
public class ConfigureEcoSystem {

    public static EcoSystem configure() {

        EcoSystem ecosystem = EcoSystem.getInstance();

        SystemAdminOrganization thisAdminOrganization = new SystemAdminOrganization();
        ecosystem.getOrganizationDirectory().getOrganizationList().add(thisAdminOrganization);

        Employee systemAdmin = new Employee();

        systemAdmin.setEmployeeName("Administrator");
        systemAdmin.setEmploymentPosition(EmployeePosition.SYSTEM_ADMIN);

        if (systemAdmin.getEmploymentPosition() == EmployeePosition.SYSTEM_ADMIN && "Administrator".equals(systemAdmin.getEmployeeName())) {
            UserAccount admin = new UserAccount();
            admin.setUsername("admin");
            admin.setPassword("admin");
            admin.setEcosystemRole(new SystemAdministrationRole());
            admin.setEmployeeName(systemAdmin);

            thisAdminOrganization.getEmployeeDirectory().getEmployeeList().add(systemAdmin);
            thisAdminOrganization.getUserAccountDirectory().getUserAccountList().add(admin);
        }

        return ecosystem;
    }

}
