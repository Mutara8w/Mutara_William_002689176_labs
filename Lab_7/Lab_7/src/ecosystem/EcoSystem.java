/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem;

import ecosystem.Organization.OrganizationDirectory;

/**
 *
 * @author Administrator
 */
public class EcoSystem {

    private static EcoSystem ecosytem;
    private OrganizationDirectory organizationDirectory;

    public static EcoSystem getInstance() {
        if (ecosytem == null) {
            ecosytem = new EcoSystem();
        }
        return ecosytem;
    }

    private EcoSystem() {
        organizationDirectory = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

}
