/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

import business.AccountDirectory;
import java.awt.CardLayout;

/**
 *
 * @author mydel
 */
public class MainJFrame extends javax.swing.JFrame {

    private AccountDirectory accountDirectory;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.accountDirectory = new AccountDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        topJPanel = new javax.swing.JPanel();
        btnAccountManager = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topJPanel.setBackground(new java.awt.Color(255, 153, 51));

        btnAccountManager.setBackground(new java.awt.Color(255, 102, 102));
        btnAccountManager.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAccountManager.setText("Account Manager");
        btnAccountManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topJPanelLayout.createSequentialGroup()
                .addContainerGap(408, Short.MAX_VALUE)
                .addComponent(btnAccountManager)
                .addGap(34, 34, 34))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnAccountManager)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(topJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 153, 51));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountManagerActionPerformed
        // TODO add your handling code here:
        AccountManageWorkAreaJPanel panel = new AccountManageWorkAreaJPanel(userProcessContainer, accountDirectory);
        userProcessContainer.add("AccountManageWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAccountManagerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountManager;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
