/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskwebappwsclient;

import javax.swing.JOptionPane;
import org.me.people.PersonData;

/**
 *
 * @author Iwa Stojnowa
 */
public class CreateOrUpdateDialog extends javax.swing.JDialog {
    PersonData updatePersonData = null;

    /**
     * Creates new form CreateOrUpdateDialog
     */
    public CreateOrUpdateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void setUpdatePersonMode(PersonData updatePersonData) {
        if(updatePersonData != null) {
            this.updatePersonData = updatePersonData;
            nameTextField.setText(updatePersonData.getFULLNAME());
            String pin = updatePersonData.getPIN();
            if(pin != null && !pin.isEmpty()) {
                pinCheckBox.setSelected(true);
                pinTextField.setEnabled(true);
                pinTextField.setText(pin);
            }
            else {
                pinCheckBox.setSelected(false);
                pinTextField.setEnabled(false);
                pinTextField.setText("");
            }
            String email = updatePersonData.getEMAIL();
            if(email != null && !email.isEmpty()) {
                emailCheckBox.setSelected(true);
                emailTextField.setEnabled(true);
                emailTextField.setText(email);
            }
            else {
                emailCheckBox.setSelected(false);
                emailTextField.setEnabled(false);
                emailTextField.setText("");
            }
            okButton.setText("Update person");
        }
        else {
            okButton.setText("Create person");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        pinCheckBox = new javax.swing.JCheckBox();
        pinTextField = new javax.swing.JTextField();
        emailCheckBox = new javax.swing.JCheckBox();
        emailTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Full name:");

        pinCheckBox.setText("PIN");
        pinCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinCheckBoxActionPerformed(evt);
            }
        });

        pinTextField.setBackground(new java.awt.Color(240, 240, 240));
        pinTextField.setEnabled(false);

        emailCheckBox.setText("Email");
        emailCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailCheckBoxActionPerformed(evt);
            }
        });

        emailTextField.setBackground(new java.awt.Color(240, 240, 240));
        emailTextField.setEnabled(false);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailCheckBox)
                            .addComponent(pinCheckBox)
                            .addComponent(jLabel1)
                            .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(pinTextField)
                            .addComponent(nameTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pinCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try {
            PersonData personData = new PersonData();
            personData.setFULLNAME(getPersonFullName());
            personData.setPIN(getPersonPIN());
            personData.setEMAIL(getPersonEmail());
            String message;
            if(updatePersonData != null) {
                personData.setID(updatePersonData.getID());
                message = MainDialog.updatePerson(personData);
                if(message == null) {
                    JOptionPane.showMessageDialog(this, "Person record updated successfully");            
                }
            }
            else {
                message = MainDialog.createPerson(personData);
                if(message == null) {
                    JOptionPane.showMessageDialog(this, "Person record created successfully");
                }
            }
            if(message == null) {
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);    
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_okButtonActionPerformed

    private void pinCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinCheckBoxActionPerformed
        pinTextField.setEnabled(pinCheckBox.isSelected());
    }//GEN-LAST:event_pinCheckBoxActionPerformed

    private void emailCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailCheckBoxActionPerformed
       emailTextField.setEnabled(emailCheckBox.isSelected());
    }//GEN-LAST:event_emailCheckBoxActionPerformed

    
    public String getPersonFullName() {
        return nameTextField.getText();     
    }
    
    public String getPersonPIN() {
        String PIN;
        if(pinCheckBox.isSelected()) {
            PIN = pinTextField.getText();
        }
        else {
            PIN = null;
        }
        return PIN;  
    }
    
    public String getPersonEmail() {
        String email;
        if(emailCheckBox.isSelected()) {
            email = emailTextField.getText();
        }
        else {
            email = null;
        }
        return email;        
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox emailCheckBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JCheckBox pinCheckBox;
    private javax.swing.JTextField pinTextField;
    // End of variables declaration//GEN-END:variables
}
