/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Role;

import ecosystem.UserAccount.UserAccount;
import ecosystem.EcoSystem;
import ecosystem.Organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    public enum RoleType {
        SYSTEM_ADMIN_ROLE("System administration role"),
        CDC_ROLE("Centers for disease control and prevention Role"),
        PHD_ROLE("State Public Health Department Role");

        private final String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem ecosystem);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }

}
