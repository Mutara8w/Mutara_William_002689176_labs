/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Role.PHDRole;

import ecosystem.EcoSystem;
import ecosystem.Organization.Organization;
import ecosystem.Role.Role;
import ecosystem.UserAccount.UserAccount;
import ui.PHDRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class PHDRole extends Role {

    public PHDRole() {
        this.type = RoleType.PHD_ROLE;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        this.type = RoleType.PHD_ROLE;
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

}
