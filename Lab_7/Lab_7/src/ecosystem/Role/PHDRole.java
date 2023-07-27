/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Role;

import ecosystem.EcoSystem;
import ecosystem.Organization.Organization;
import ecosystem.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PHDRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class PHDRole extends Role {

    public PHDRole() {
        this.type = RoleType.PHD_ROLE;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem ecosystem) {
        this.type = RoleType.PHD_ROLE;
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, ecosystem);
    }

}
