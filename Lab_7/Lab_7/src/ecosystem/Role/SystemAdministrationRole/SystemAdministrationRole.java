/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Role.SystemAdministrationRole;

import ecosystem.Organization.Organization;
import ecosystem.UserAccount.UserAccount;
import ecosystem.EcoSystem;
import ecosystem.Role.Role;
import javax.swing.JPanel;
import ui.SystemAdministrationRole.AdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class SystemAdministrationRole extends Role {

    public SystemAdministrationRole() {
        this.type = RoleType.SYSTEM_ADMIN_ROLE;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {

        return new AdminWorkAreaJPanel(userProcessContainer, EcoSystem.getInstance());
    }

}
