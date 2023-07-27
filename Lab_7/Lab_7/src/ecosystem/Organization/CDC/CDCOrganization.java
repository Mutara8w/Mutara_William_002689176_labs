/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Organization.CDC;

import ecosystem.Organization.Organization;
import ecosystem.Role.CDCRole.CDCRole;
import ecosystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CDCOrganization extends Organization {

    public CDCOrganization() {
        super(Organization.Type.CDC.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCRole());
        return roles;
    }

}
