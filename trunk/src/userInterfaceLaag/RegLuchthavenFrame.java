/*
 * RegLuchthavenFrame.java
 *
 * Created on 11 juni 2008, 16:05
 */

package userInterfaceLaag;

/**
 *
 * @author  Bami
 */
public class RegLuchthavenFrame extends javax.swing.JFrame {

    /** Creates new form RegLuchthavenFrame */
    public RegLuchthavenFrame(RegLuchthavenContr rlhctr, String ln) {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() {

jaNeeButtonGroup = new javax.swing.ButtonGroup();
landLabel = new javax.swing.JLabel();
landComboBox = new javax.swing.JComboBox();
codeLabel = new javax.swing.JLabel();
codeTextField = new javax.swing.JTextField();
nieuweLuchthavenPanel = new javax.swing.JPanel();
naamLabel = new javax.swing.JLabel();
naamTextField = new javax.swing.JTextField();
landCodeLabel = new javax.swing.JLabel();
landCodeTextField = new javax.swing.JTextField();
werkPlaatsLabel = new javax.swing.JLabel();
jaButton = new javax.swing.JRadioButton();
neeButton = new javax.swing.JRadioButton();
okButton = new javax.swing.JButton();
cancelButton = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

landLabel.setText("Land");

landComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

codeLabel.setText("Code");

codeTextField.setText("jTextField1");
codeTextField.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
codeTextFieldActionPerformed(evt);
}
});

nieuweLuchthavenPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

naamLabel.setText("Naam");

naamTextField.setText("jTextField2");
naamTextField.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
naamTextFieldActionPerformed(evt);
}
});

landCodeLabel.setText("Code");

landCodeTextField.setText("jTextField2");
landCodeTextField.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
landCodeTextFieldActionPerformed(evt);
}
});

werkPlaatsLabel.setText("Werkplaats");

jaNeeButtonGroup.add(jaButton);
jaButton.setText("Ja");
jaButton.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jaButtonActionPerformed(evt);
}
});

jaNeeButtonGroup.add(neeButton);
neeButton.setText("Nee");
neeButton.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
neeButtonActionPerformed(evt);
}
});

javax.swing.GroupLayout nieuweLuchthavenPanelLayout = new javax.swing.GroupLayout(nieuweLuchthavenPanel);
nieuweLuchthavenPanel.setLayout(nieuweLuchthavenPanelLayout);
nieuweLuchthavenPanelLayout.setHorizontalGroup(
nieuweLuchthavenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(nieuweLuchthavenPanelLayout.createSequentialGroup()
.addGap(38, 38, 38)
.addGroup(nieuweLuchthavenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(naamLabel)
.addComponent(landCodeLabel)
.addComponent(werkPlaatsLabel))
.addGap(92, 92, 92)
.addGroup(nieuweLuchthavenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(nieuweLuchthavenPanelLayout.createSequentialGroup()
.addGap(12, 12, 12)
.addComponent(jaButton)
.addGap(37, 37, 37)
.addComponent(neeButton))
.addComponent(landCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(naamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
.addContainerGap(157, Short.MAX_VALUE))
);
nieuweLuchthavenPanelLayout.setVerticalGroup(
nieuweLuchthavenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(nieuweLuchthavenPanelLayout.createSequentialGroup()
.addGap(20, 20, 20)
.addGroup(nieuweLuchthavenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(naamLabel)
.addComponent(naamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(nieuweLuchthavenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(landCodeLabel)
.addComponent(landCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(nieuweLuchthavenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(werkPlaatsLabel)
.addComponent(jaButton)
.addComponent(neeButton))
.addContainerGap(25, Short.MAX_VALUE))
);

okButton.setText("Cancel");

cancelButton.setText("OK");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(nieuweLuchthavenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addGap(50, 50, 50)
.addComponent(landLabel)
.addGap(124, 124, 124)
.addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(codeLabel)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
.addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addContainerGap(378, Short.MAX_VALUE)
.addComponent(cancelButton)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(okButton)))
.addContainerGap())
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(landLabel)
.addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(codeLabel))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(nieuweLuchthavenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(okButton)
.addComponent(cancelButton))
.addContainerGap())
);

pack();
}// </editor-fold>//GEN-END:initComponents

private void naamTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naamTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_naamTextFieldActionPerformed

private void landCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_landCodeTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_landCodeTextFieldActionPerformed

private void jaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jaButtonActionPerformed

private void neeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neeButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_neeButtonActionPerformed

private void codeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_codeTextFieldActionPerformed


// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton cancelButton;
private javax.swing.JLabel codeLabel;
private javax.swing.JTextField codeTextField;
private javax.swing.JRadioButton jaButton;
private javax.swing.ButtonGroup jaNeeButtonGroup;
private javax.swing.JLabel landCodeLabel;
private javax.swing.JTextField landCodeTextField;
private javax.swing.JComboBox landComboBox;
private javax.swing.JLabel landLabel;
private javax.swing.JLabel naamLabel;
private javax.swing.JTextField naamTextField;
private javax.swing.JRadioButton neeButton;
private javax.swing.JPanel nieuweLuchthavenPanel;
private javax.swing.JButton okButton;
private javax.swing.JLabel werkPlaatsLabel;
// End of variables declaration//GEN-END:variables

}
