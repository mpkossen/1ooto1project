/*
 * OvBkPerVlFrame.java
 *
 * Zie  http://www.idevelopment.info/data/Programming/java/date/CalendarExample.java
 * 
 * Created on 11 juni 2008, 15:30
 */
package userInterfaceLaag;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.TreeMap;
import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;

/** 
 *
 * @author  Bami
 */
public class OvBkPerVlFrame extends javax.swing.JFrame
{
    private OvBkPerVlContr ovBkPerVlContr;
    private TreeMap<String, Luchthaven> luchthavens;
    private TreeMap<String, Vlucht> vluchten;

    /** Creates new form OvBkPerVlFrame */
    public OvBkPerVlFrame(TreeMap<String, Luchthaven> lhvns, OvBkPerVlContr obpvctl)
    {
        this.luchthavens = lhvns;
        this.ovBkPerVlContr = obpvctl;
        this.vluchten = new TreeMap<String, Vlucht>();
		
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

        VluchtPanel = new javax.swing.JPanel();
        vertrekPuntLabel = new javax.swing.JLabel();
        bestemmingLabel = new javax.swing.JLabel();
        vertrekLabel = new javax.swing.JLabel();
        DefaultListCellRenderer lRenderer = new DefaultListCellRenderer();
        lRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        vertrekPuntComboBox = new javax.swing.JComboBox();
        bestemmingPuntComboBox = new javax.swing.JComboBox();
        vertrekComboBox = new javax.swing.JComboBox();
        tijdTextField = new javax.swing.JTextField();
        vluchtInfoPanel = new javax.swing.JPanel();
        infoScrollPane = new javax.swing.JScrollPane();
        infoTable = new javax.swing.JTable();
        cancelButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VluchtPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Vlucht", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0)));
        VluchtPanel.setToolTipText("");
        VluchtPanel.setName(""); // NOI18N

        vertrekPuntLabel.setText("Vetrekpunt");

        bestemmingLabel.setText("Bestemming");

        vertrekLabel.setText("Vertrek");

        vertrekPuntComboBox.setRenderer(lRenderer);
        vertrekPuntComboBox.setModel(new javax.swing.DefaultComboBoxModel(luchthavens.keySet().toArray()));
        vertrekPuntComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertrekPuntComboBoxActionPerformed(evt);
            }
        });

        bestemmingPuntComboBox.setRenderer(lRenderer);
        bestemmingPuntComboBox.setModel(new javax.swing.DefaultComboBoxModel(luchthavens.keySet().toArray()));
        bestemmingPuntComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestemmingPuntComboBoxActionPerformed(evt);
            }
        });

        vertrekComboBox.setRenderer(lRenderer);
        vertrekComboBox.setModel(new javax.swing.DefaultComboBoxModel(vluchten.keySet().toArray()));
        vertrekComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertrekComboBoxActionPerformed(evt);
            }
        });

        tijdTextField.setEditable(false);
        tijdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout VluchtPanelLayout = new javax.swing.GroupLayout(VluchtPanel);
        VluchtPanel.setLayout(VluchtPanelLayout);
        VluchtPanelLayout.setHorizontalGroup(
            VluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VluchtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vertrekPuntLabel)
                    .addComponent(bestemmingLabel)
                    .addComponent(vertrekLabel))
                .addGap(84, 84, 84)
                .addGroup(VluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vertrekComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vertrekPuntComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bestemmingPuntComboBox, 0, 193, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(tijdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        VluchtPanelLayout.setVerticalGroup(
            VluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VluchtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vertrekPuntLabel)
                    .addComponent(vertrekPuntComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bestemmingLabel)
                    .addComponent(bestemmingPuntComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vertrekLabel)
                    .addComponent(vertrekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tijdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        vluchtInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        infoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KLANT", "WOONPLAATS", "STOELEN", "ROKEN"
            }
        ));
        infoScrollPane.setViewportView(infoTable);

        javax.swing.GroupLayout vluchtInfoPanelLayout = new javax.swing.GroupLayout(vluchtInfoPanel);
        vluchtInfoPanel.setLayout(vluchtInfoPanelLayout);
        vluchtInfoPanelLayout.setHorizontalGroup(
            vluchtInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vluchtInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        vluchtInfoPanelLayout.setVerticalGroup(
            vluchtInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vluchtInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        OKButton.setText("OK");
        OKButton.setMaximumSize(new java.awt.Dimension(65, 23));
        OKButton.setMinimumSize(new java.awt.Dimension(65, 23));
        OKButton.setPreferredSize(new java.awt.Dimension(65, 23));
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vluchtInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VluchtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VluchtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vluchtInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        VluchtPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
	ovBkPerVlContr.ok();
}//GEN-LAST:event_OKButtonActionPerformed

private void bestemmingPuntComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestemmingPuntComboBoxActionPerformed
    JComboBox jcb = (JComboBox)evt.getSource();
	String s = (String)jcb.getSelectedItem();
	this.vluchten = ovBkPerVlContr.bestemming(s);
	vertrekComboBox.setModel(new javax.swing.DefaultComboBoxModel(vluchten.keySet().toArray()));
	
	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
	String vertrektijd = formatter.format(vluchten.firstEntry().getValue().geefVertrekTijd().getTime());
	tijdTextField.setText(vertrektijd);
	
	Object[][] data = ovBkPerVlContr.vlucht(vluchten.firstEntry().getValue());
	String[] labels = new String [] {"KLANT", "WOONPLAATS", "STOELEN", "ROKEN"};
	infoTable.setModel(new javax.swing.table.DefaultTableModel(data, labels));		
}//GEN-LAST:event_bestemmingPuntComboBoxActionPerformed

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
	ovBkPerVlContr.cancel();
}//GEN-LAST:event_cancelButtonActionPerformed

private void vertrekPuntComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertrekPuntComboBoxActionPerformed
    JComboBox jcb = (JComboBox)evt.getSource();
	String s = (String)jcb.getSelectedItem();
	this.vluchten = ovBkPerVlContr.vertrek(s);
	vertrekComboBox.setModel(new javax.swing.DefaultComboBoxModel(vluchten.keySet().toArray()));

	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
	String vertrektijd = formatter.format(vluchten.firstEntry().getValue().geefVertrekTijd().getTime());
	tijdTextField.setText(vertrektijd);
	
	Object[][] data = ovBkPerVlContr.vlucht(vluchten.firstEntry().getValue());
	String[] labels = new String [] {"KLANT", "WOONPLAATS", "STOELEN", "ROKEN"};
	infoTable.setModel(new javax.swing.table.DefaultTableModel(data, labels));	
}//GEN-LAST:event_vertrekPuntComboBoxActionPerformed

private void vertrekComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertrekComboBoxActionPerformed
    JComboBox jcb = (JComboBox)evt.getSource();
	String s = (String)jcb.getSelectedItem();
	Object[][] data = ovBkPerVlContr.vlucht(vluchten.get(s));
	String[] labels = new String [] {"KLANT", "WOONPLAATS", "STOELEN", "ROKEN"};
	infoTable.setModel(new javax.swing.table.DefaultTableModel(data, labels));
}//GEN-LAST:event_vertrekComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JPanel VluchtPanel;
    private javax.swing.JLabel bestemmingLabel;
    private javax.swing.JComboBox bestemmingPuntComboBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane infoScrollPane;
    private javax.swing.JTable infoTable;
    private javax.swing.JTextField tijdTextField;
    private javax.swing.JComboBox vertrekComboBox;
    private javax.swing.JLabel vertrekLabel;
    private javax.swing.JComboBox vertrekPuntComboBox;
    private javax.swing.JLabel vertrekPuntLabel;
    private javax.swing.JPanel vluchtInfoPanel;
    // End of variables declaration//GEN-END:variables

}