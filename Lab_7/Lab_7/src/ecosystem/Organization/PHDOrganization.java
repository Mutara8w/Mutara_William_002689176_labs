/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Organization;

import ecosystem.Organization.Organization;
import ecosystem.Role.PHDRole;
import ecosystem.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PHDOrganization extends Organization{

    public PHDOrganization() {
        super(Organization.Type.PHD.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PHDRole());
        return roles;
    }
     
   
    
    
}
