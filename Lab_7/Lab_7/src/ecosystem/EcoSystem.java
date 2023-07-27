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
public final class EcoSystem {

    private static EcoSystem ecosytem; // singleton pattern
    private OrganizationDirectory organizationDirectory; // organization directory

    public static EcoSystem getInstance() { // singleton pattern
        if (ecosytem == null) { // if no instance of ecosystem exists
            ecosytem = new EcoSystem(); // create a new instance
        }

        return ecosytem; // return the instance
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
