package userInterfaceLaag;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.*;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class RegLuchthavenFrame extends javax.swing.JFrame {
	private JPanel jPanel;
	private JLabel landLabel;
	private JLabel naamLabel;
	private JTextField naamTextField;
	private JTextField codeTextField;
	private JRadioButton jaRadioButton;
	private JButton okButton;
	private JButton cancelButton;
	private JTextField codeTextfield2;
	private JLabel codeLabel2;
	private JComboBox landComboBox;
	private JRadioButton neeRadioButton;
	private JLabel werkplaatsLabel;
	private JLabel codeLabel;
	private Set<String> landNamen;
	private RegLuchthavenContr rlc;
	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	* Auto-generated main method to display this JFrame
	*/
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RegLuchthavenFrame inst = new RegLuchthavenFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}*/
	
	public RegLuchthavenFrame(RegLuchthavenContr r, Set<String> l) {
		super();
		this.rlc = r;
		this.landNamen = l;
		initGUI();
		postInitGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setLocation(new java.awt.Point(25, 25));
			getContentPane().setLayout(null);
			this.setTitle("registreerLuchthaven");
			{
				jPanel = new JPanel();
				getContentPane().add(jPanel);
				jPanel.setBounds(21, 91, 406, 133);
				jPanel.setBorder(BorderFactory.createTitledBorder("Nieuwe Luchthaven"));
				jPanel.setLayout(null);
				{
					naamLabel = new JLabel();
					jPanel.add(naamLabel);
					naamLabel.setText("Naam");
					naamLabel.setBounds(14, 28, 28, 14);
				}
				{
					naamTextField = new JTextField();
					jPanel.add(naamTextField);
					naamTextField.setText("Amsterdam");
					naamTextField.setBounds(112, 28, 126, 21);
					naamTextField.setHorizontalAlignment(SwingConstants.CENTER);
				}
				{
					codeLabel = new JLabel();
					jPanel.add(codeLabel);
					codeLabel.setText("Code");
					codeLabel.setBounds(14, 70, 28, 14);
				}
				{
					werkplaatsLabel = new JLabel();
					jPanel.add(werkplaatsLabel);
					werkplaatsLabel.setText("Werkplaats");
					werkplaatsLabel.setBounds(14, 98, 56, 14);
				}
				{
					codeTextField = new JTextField();
					jPanel.add(codeTextField);
					codeTextField.setText("Code");
					codeTextField.setBounds(112, 70, 126, 21);
					codeTextField.setHorizontalAlignment(SwingConstants.CENTER);
				}
				{
					jaRadioButton = new JRadioButton();
					jPanel.add(jaRadioButton);
					jaRadioButton.setText("Ja");
					jaRadioButton.setBounds(112, 98, 63, 21);
					jaRadioButton.setSelected(true);
				}
				{
					neeRadioButton = new JRadioButton();
					jPanel.add(neeRadioButton);
					neeRadioButton.setText("Nee");
					neeRadioButton.setBounds(175, 98, 63, 21);
				}
				jPanel.setLayout(null);
			}
			{
				landLabel = new JLabel();
				getContentPane().add(landLabel);
				landLabel.setText("Land");
				landLabel.setBounds(35, 42, 28, 14);
			}
			{
				ComboBoxModel landComboBoxModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				landComboBoxModel.setSelectedItem("");
				landComboBox = new JComboBox();
				getContentPane().add(landComboBox);
				landComboBox.setBounds(133, 42, 126, 21);
				landComboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						landComboBoxActionPerformed(evt);
					}
				});
			}
			{
				codeLabel2 = new JLabel();
				getContentPane().add(codeLabel2);
				codeLabel2.setText("Code");
				codeLabel2.setBounds(301, 42, 28, 14);
			}
			{
				codeTextfield2 = new JTextField();
				getContentPane().add(codeTextfield2);
				codeTextfield2.setText("031");
				codeTextfield2.setBounds(343, 42, 56, 21);
				codeTextfield2.setHorizontalAlignment(SwingConstants.CENTER);
				codeTextfield2.setEditable(false);
			}
			{
				cancelButton = new JButton();
				getContentPane().add(cancelButton);
				cancelButton.setText("Cancel");
				cancelButton.setBounds(371, 238, 70, 21);
			}
			{
				okButton = new JButton();
				getContentPane().add(okButton);
				okButton.setText("Ok");
				okButton.setBounds(287, 238, 77, 21);
			}
			pack();
			setSize(470, 310);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void postInitGUI() {
		String s = "Nederland";
		landComboBox.addItem(s);
		s = "Belgie";
		landComboBox.addItem(s);
		s = "Luxemburg";
		landComboBox.addItem(s);
	}
	
	private void landComboBoxActionPerformed(ActionEvent evt) {
		System.out.println("landComboBox.actionPerformed, event="+evt);
		String s = (String) landComboBox.getSelectedItem();
		if (s.equals("Nederland"))
			codeTextfield2.setText("031");
		if (s.equals("Belgie"))
			codeTextfield2.setText("032");
		if (s.equals("Luxemburg"))
			codeTextfield2.setText("033");
	}
}
