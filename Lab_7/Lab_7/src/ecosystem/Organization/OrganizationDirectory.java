/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecosystem.Organization;

import ecosystem.Organization.PHD.PHDOrganization;
import ecosystem.Organization.CDC.CDCOrganization;
import ecosystem.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.CDC.getValue())) {
            organization = new CDCOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PHD.getValue())) {
            organization = new PHDOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

}
