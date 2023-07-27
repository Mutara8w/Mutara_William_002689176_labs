/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Role.CDCRole;

import ecosystem.EcoSystem;
import ecosystem.Organization.CDC.CDCOrganization;
import ecosystem.Organization.Organization;
import ecosystem.Role.Role;
import ecosystem.UserAccount.UserAccount;
import ui.CDCRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CDCRole extends Role {

    public CDCRole() {
        this.type = RoleType.CDC_ROLE;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = RoleType.CDC_ROLE;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (CDCOrganization) organization, business);
    }

}
