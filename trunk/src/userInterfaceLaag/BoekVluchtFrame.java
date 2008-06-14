/*
 * BoekVluchtFrame.java
 *
 * Created on June 12, 2008, 5:09 PM
 */

package userInterfaceLaag;

import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;
import java.util.TreeMap;
import java.text.SimpleDateFormat;
import javax.swing.*;

/**
 *
 * @author  Frank
 */
public class BoekVluchtFrame extends javax.swing.JFrame
{
	private BoekVluchtContr myController;
	private TreeMap<String, Luchthaven> luchthavens;
	private TreeMap<String, Vlucht> vluchten;
	
	/** Creates new form BoekVluchtFrame */
	public BoekVluchtFrame (BoekVluchtContr bvc)
	{
		this.myController = bvc;
		this.luchthavens = Luchthaven.geefAlle();
		this.vluchten = new TreeMap<String, Vlucht>();
		
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        vluchtPanel = new javax.swing.JPanel();
        vertrekpuntLabel = new javax.swing.JLabel();
        DefaultListCellRenderer lRenderer = new DefaultListCellRenderer();
        lRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        vertrekpuntComboBox = new javax.swing.JComboBox();
        bestemmingComboBox = new javax.swing.JComboBox();
        vluchtComboBox = new javax.swing.JComboBox();
        aankomstTextField = new javax.swing.JTextField();
        bestemmingLabel = new javax.swing.JLabel();
        vertrekLabel = new javax.swing.JLabel();
        aankomstLabel = new javax.swing.JLabel();
        vertrekTijdTextField = new javax.swing.JTextField();
        aankomstTijdTextField = new javax.swing.JTextField();
        naamTextField = new javax.swing.JTextField();
        straatTextField = new javax.swing.JTextField();
        stoelenTextField = new javax.swing.JTextField();
        huisNummerTextField = new javax.swing.JTextField();
        plaatsTextField = new javax.swing.JTextField();
        naamLabel = new javax.swing.JLabel();
        adresLabel = new javax.swing.JLabel();
        stoelenLabel = new javax.swing.JLabel();
        nietRokenButton = new javax.swing.JRadioButton();
        rokenButton = new javax.swing.JRadioButton();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vluchtPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Vlucht", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0)));

        vertrekpuntLabel.setText("Vertrekpunt");

        vertrekpuntComboBox.setRenderer(lRenderer);
        vertrekpuntComboBox.setModel(new javax.swing.DefaultComboBoxModel(luchthavens.keySet().toArray()));
        vertrekpuntComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertrekpuntComboBoxActionPerformed(evt);
            }
        });

        bestemmingComboBox.setRenderer(lRenderer);
        bestemmingComboBox.setModel(new javax.swing.DefaultComboBoxModel(luchthavens.keySet().toArray()));
        bestemmingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestemmingComboBoxActionPerformed(evt);
            }
        });

        vluchtComboBox.setRenderer(lRenderer);
        vluchtComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vluchtComboBoxActionPerformed(evt);
            }
        });

        aankomstTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bestemmingLabel.setText("Bestemming");

        vertrekLabel.setText("Vertrek");

        aankomstLabel.setText("Aankomst");

        vertrekTijdTextField.setEditable(false);
        vertrekTijdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vertrekTijdTextField.setText("tijd");

        aankomstTijdTextField.setEditable(false);
        aankomstTijdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aankomstTijdTextField.setText("tijd");

        javax.swing.GroupLayout vluchtPanelLayout = new javax.swing.GroupLayout(vluchtPanel);
        vluchtPanel.setLayout(vluchtPanelLayout);
        vluchtPanelLayout.setHorizontalGroup(
            vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vluchtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vertrekpuntLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestemmingLabel)
                    .addComponent(vertrekLabel)
                    .addComponent(aankomstLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(vluchtComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bestemmingComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vertrekpuntComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE))
                    .addComponent(aankomstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aankomstTijdTextField)
                    .addComponent(vertrekTijdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        vluchtPanelLayout.setVerticalGroup(
            vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vluchtPanelLayout.createSequentialGroup()
                .addGroup(vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vertrekpuntComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vertrekpuntLabel))
                .addGap(18, 18, 18)
                .addGroup(vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bestemmingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestemmingLabel))
                .addGap(18, 18, 18)
                .addGroup(vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vluchtComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vertrekLabel)
                    .addComponent(vertrekTijdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vluchtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aankomstTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aankomstLabel)
                    .addComponent(aankomstTijdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        naamTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        naamTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naamTextFieldActionPerformed(evt);
            }
        });
        naamTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                naamTextFieldFocusLost(evt);
            }
        });

        straatTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        straatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                straatTextFieldActionPerformed(evt);
            }
        });
        straatTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                straatTextFieldFocusLost(evt);
            }
        });

        stoelenTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stoelenTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoelenTextFieldActionPerformed(evt);
            }
        });
        stoelenTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stoelenTextFieldFocusLost(evt);
            }
        });

        huisNummerTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        huisNummerTextField.setText("1");
        huisNummerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huisNummerTextFieldActionPerformed(evt);
            }
        });
        huisNummerTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                huisNummerTextFieldFocusLost(evt);
            }
        });

        plaatsTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        plaatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plaatsTextFieldActionPerformed(evt);
            }
        });
        plaatsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                plaatsTextFieldFocusLost(evt);
            }
        });

        naamLabel.setText("Klant");

        adresLabel.setText("Adres");

        stoelenLabel.setText("Stoelen");

        buttonGroup1.add(nietRokenButton);
        nietRokenButton.setSelected(true);
        nietRokenButton.setText("Niet Roken");
        nietRokenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nietRokenButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(rokenButton);
        rokenButton.setText("Roken");
        rokenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rokenButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.setMaximumSize(new java.awt.Dimension(65, 23));
        okButton.setMinimumSize(new java.awt.Dimension(65, 23));
        okButton.setPreferredSize(new java.awt.Dimension(65, 23));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naamLabel)
                            .addComponent(adresLabel)
                            .addComponent(stoelenLabel))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(straatTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naamTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(stoelenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nietRokenButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(huisNummerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plaatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rokenButton)))
                    .addComponent(vluchtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vluchtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(naamLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(straatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huisNummerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plaatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stoelenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stoelenLabel)
                    .addComponent(nietRokenButton)
                    .addComponent(rokenButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
	private void vertrekpuntComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertrekpuntComboBoxActionPerformed
		Luchthaven vertrekpunt = luchthavens.get((String)vertrekpuntComboBox.getSelectedItem());
		Luchthaven bestemming = luchthavens.get((String)bestemmingComboBox.getSelectedItem());
		this.vluchten = myController.vertrekpuntEnBestemming(vertrekpunt, bestemming);
		
		vluchtComboBox.setModel(new javax.swing.DefaultComboBoxModel(vluchten.keySet().toArray()));
		aankomstTextField.setText(vluchten.firstEntry().getKey());
		
		SimpleDateFormat dagFormatter = new SimpleDateFormat("HH:mm");
		vertrekTijdTextField.setText(dagFormatter.format(vluchten.firstEntry().getValue().geefVertrekTijd().getTime()));
		aankomstTijdTextField.setText(dagFormatter.format(vluchten.firstEntry().getValue().getAankomstTijd().getTime()));
		
		bestemmingComboBox.requestFocusInWindow();
	}//GEN-LAST:event_vertrekpuntComboBoxActionPerformed

	private void bestemmingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestemmingComboBoxActionPerformed
		Luchthaven vertrekpunt = luchthavens.get((String)vertrekpuntComboBox.getSelectedItem());
		Luchthaven bestemming = luchthavens.get((String)bestemmingComboBox.getSelectedItem());
		this.vluchten = myController.vertrekpuntEnBestemming(vertrekpunt, bestemming);
		
		vluchtComboBox.setModel(new javax.swing.DefaultComboBoxModel(vluchten.keySet().toArray()));
		aankomstTextField.setText(vluchten.firstEntry().getKey());
		
		
		SimpleDateFormat dagFormatter = new SimpleDateFormat("HH:mm");
		vertrekTijdTextField.setText(dagFormatter.format(vluchten.firstEntry().getValue().geefVertrekTijd().getTime()));
		aankomstTijdTextField.setText(dagFormatter.format(vluchten.firstEntry().getValue().getAankomstTijd().getTime()));
		
		myController.vlucht(vluchten.firstEntry().getValue());
		vluchtComboBox.requestFocusInWindow();
	}//GEN-LAST:event_bestemmingComboBoxActionPerformed

	private void vluchtComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vluchtComboBoxActionPerformed
		Vlucht vlucht = vluchten.get((String)vluchtComboBox.getSelectedItem());
		myController.vlucht(vlucht);

		SimpleDateFormat dagFormatter = new SimpleDateFormat("dd-MM-yy");
		aankomstTextField.setText(dagFormatter.format(vlucht.getAankomstTijd().getTime()));
		
		SimpleDateFormat tijdFormatter = new SimpleDateFormat("HH:mm");
		vertrekTijdTextField.setText(tijdFormatter.format(vluchten.firstEntry().getValue().geefVertrekTijd().getTime()));
		aankomstTijdTextField.setText(tijdFormatter.format(vluchten.firstEntry().getValue().getAankomstTijd().getTime()));
		
		naamTextField.requestFocusInWindow();
}//GEN-LAST:event_vluchtComboBoxActionPerformed

	private void naamTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naamTextFieldActionPerformed
		straatTextField.requestFocusInWindow();
	}//GEN-LAST:event_naamTextFieldActionPerformed

	private void straatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_straatTextFieldActionPerformed
		huisNummerTextField.requestFocusInWindow();
		// myController.klant(naamTextField.getText(), straatTextField.getText(), Integer.parseInt(huisNummerTextField.getText()), plaatsTextField.getText());
	}//GEN-LAST:event_straatTextFieldActionPerformed

	private void huisNummerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huisNummerTextFieldActionPerformed
		plaatsTextField.requestFocusInWindow();
		// myController.klant(naamTextField.getText(), straatTextField.getText(), Integer.parseInt(huisNummerTextField.getText()), plaatsTextField.getText());
	}//GEN-LAST:event_huisNummerTextFieldActionPerformed

	private void plaatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plaatsTextFieldActionPerformed
		stoelenTextField.requestFocusInWindow();
		// myController.klant(naamTextField.getText(), straatTextField.getText(), Integer.parseInt(huisNummerTextField.getText()), plaatsTextField.getText());
	}//GEN-LAST:event_plaatsTextFieldActionPerformed

	private void nietRokenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nietRokenButtonActionPerformed
		okButton.requestFocusInWindow();
		// myController.plaats(Integer.parseInt(stoelenTextField.getText()), rokenButton.isSelected());
	}//GEN-LAST:event_nietRokenButtonActionPerformed

	private void rokenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rokenButtonActionPerformed
		okButton.requestFocusInWindow();
		// myController.plaats(Integer.parseInt(stoelenTextField.getText()), rokenButton.isSelected());
	}//GEN-LAST:event_rokenButtonActionPerformed

	private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
/*
		try
		{
			myController.plaats(stoelenTextField.getText(), rokenButton.isSelected());
		}
		catch (NumberFormatException nfe)
		{
			stoelenTextField.requestFocusInWindow();
		}
		try
		{
			myController.klant(naamTextField.getText(), straatTextField.getText(), huisNummerTextField.getText(), plaatsTextField.getText());
		}
		catch (NumberFormatException nfe)
		{
			huisNummerTextField.requestFocusInWindow();
		}		
*/		
		myController.ok();
	}//GEN-LAST:event_okButtonActionPerformed

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
		myController.cancel();
	}//GEN-LAST:event_cancelButtonActionPerformed

	private void stoelenTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoelenTextFieldActionPerformed
		nietRokenButton.requestFocusInWindow();
	}//GEN-LAST:event_stoelenTextFieldActionPerformed

	private void naamTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_naamTextFieldFocusLost
		try
		{
			myController.klant(naamTextField.getText(), straatTextField.getText(), huisNummerTextField.getText(), plaatsTextField.getText());
		}
		catch (NumberFormatException nfe)
		{
			huisNummerTextField.requestFocusInWindow();
		}
	}//GEN-LAST:event_naamTextFieldFocusLost

	private void straatTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_straatTextFieldFocusLost
		try
		{
			myController.klant(naamTextField.getText(), straatTextField.getText(), huisNummerTextField.getText(), plaatsTextField.getText());
		}
		catch (NumberFormatException nfe)
		{
			huisNummerTextField.requestFocusInWindow();
		}
	}//GEN-LAST:event_straatTextFieldFocusLost

	private void huisNummerTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_huisNummerTextFieldFocusLost
		try
		{
			myController.klant(naamTextField.getText(), straatTextField.getText(), huisNummerTextField.getText(), plaatsTextField.getText());
		}
		catch (NumberFormatException nfe)
		{
			huisNummerTextField.requestFocusInWindow();
		}
	}//GEN-LAST:event_huisNummerTextFieldFocusLost

	private void plaatsTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plaatsTextFieldFocusLost
		try
		{
			myController.klant(naamTextField.getText(), straatTextField.getText(), huisNummerTextField.getText(), plaatsTextField.getText());
		}
		catch (NumberFormatException nfe)
		{
			huisNummerTextField.requestFocusInWindow();
		}
	}//GEN-LAST:event_plaatsTextFieldFocusLost

	private void stoelenTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stoelenTextFieldFocusLost
		try
		{
			myController.plaats(stoelenTextField.getText(), rokenButton.isSelected());
		}
		catch (NumberFormatException nfe)
		{
			stoelenTextField.requestFocusInWindow();
		}
	}//GEN-LAST:event_stoelenTextFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aankomstLabel;
    private javax.swing.JTextField aankomstTextField;
    private javax.swing.JTextField aankomstTijdTextField;
    private javax.swing.JLabel adresLabel;
    private javax.swing.JComboBox bestemmingComboBox;
    private javax.swing.JLabel bestemmingLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField huisNummerTextField;
    private javax.swing.JLabel naamLabel;
    private javax.swing.JTextField naamTextField;
    private javax.swing.JRadioButton nietRokenButton;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField plaatsTextField;
    private javax.swing.JRadioButton rokenButton;
    private javax.swing.JLabel stoelenLabel;
    private javax.swing.JTextField stoelenTextField;
    private javax.swing.JTextField straatTextField;
    private javax.swing.JLabel vertrekLabel;
    private javax.swing.JTextField vertrekTijdTextField;
    private javax.swing.JComboBox vertrekpuntComboBox;
    private javax.swing.JLabel vertrekpuntLabel;
    private javax.swing.JComboBox vluchtComboBox;
    private javax.swing.JPanel vluchtPanel;
    // End of variables declaration//GEN-END:variables
}
