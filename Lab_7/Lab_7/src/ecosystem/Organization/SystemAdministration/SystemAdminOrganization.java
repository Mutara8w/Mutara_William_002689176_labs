/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Organization.SystemAdministration;

import ecosystem.Organization.Organization;
import ecosystem.Role.SystemAdministrationRole.SystemAdministrationRole;
import ecosystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SystemAdminOrganization extends Organization{

    public SystemAdminOrganization() {
        super(Type.SYSTEM_ADMINISTRATION.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdministrationRole());
        return roles;
    }
     
}
