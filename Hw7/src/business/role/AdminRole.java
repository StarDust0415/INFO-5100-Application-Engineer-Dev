/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.state.State;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.organization_admin.AdminWorkAreaJPanel;
import userinterface.system_admin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Yizhe Liu
 */
public class AdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, State state) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
}
