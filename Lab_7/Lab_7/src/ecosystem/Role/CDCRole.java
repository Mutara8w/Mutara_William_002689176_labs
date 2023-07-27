/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Role;

import ecosystem.EcoSystem;
import ecosystem.Organization.CDCOrganization;
import ecosystem.Organization.Organization;
import ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.CDCRole.DoctorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class CDCRole extends Role {

    public CDCRole() {
        this.type = RoleType.CDC_ROLE;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem ecosystem) {
        this.type = RoleType.CDC_ROLE;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (CDCOrganization) organization, ecosystem);
    }

}
