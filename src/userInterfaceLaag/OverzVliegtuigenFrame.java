
package userInterfaceLaag;

// Imports
import domeinLaag.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class OverzVliegtuigenFrame extends javax.swing.JFrame
{
	// Relaties
	LuchtvaartMaatschappij luchtvaartMaatschappij;

	// Constructors
	public OverzVliegtuigenFrame (LuchtvaartMaatschappij lvm)
	{
		this.luchtvaartMaatschappij = lvm;
		initGUI();
	}

	// Overige Methodes
	/**
	 * Initializes the GUI.
	 * Auto-generated code - any changes you make will disappear.
	 */
	public void initGUI ()
	{
		try
		{
			preInitGUI();
			TextArea = new JTextArea();
			Ok = new JButton();
			this.getContentPane().setLayout(null);
			this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Overzicht vliegtuigen");
			this.setSize(new java.awt.Dimension(477, 337));
			this.setLocation(new java.awt.Point(470, 310));
			TextArea.setTabSize(10);
			TextArea.setEditable(false);
			TextArea.setEnabled(true);
			TextArea.setPreferredSize(new java.awt.Dimension(416, 230));
			TextArea.setDoubleBuffered(true);
			TextArea.setBounds(new java.awt.Rectangle(26, 20, 416, 230));
			TextArea.setFocusable(false);
			this.getContentPane().add(TextArea);
			Ok.setText("OK");
			Ok.setPreferredSize(new java.awt.Dimension(60, 20));
			Ok.setBounds(new java.awt.Rectangle(350, 270, 60, 20));
			this.getContentPane().add(Ok);
			Ok.addActionListener(new ActionListener()
			{
				public void actionPerformed (ActionEvent evt)
				{
					OkActionPerformed(evt);
				}
			});
			postInitGUI();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Add your pre-init code in here
	 */
	public void preInitGUI ()
	{
	}

	/**
	 * Add your post-init code in here
	 */
	public void postInitGUI ()
	{
		TextArea.setText("VLIEGTUIG	FABRIKANT	TYPE	CAPACITEIT \n");
		TextArea.append(" \n");

		TreeMap<String, Vliegtuig> vliegtuigen = luchtvaartMaatschappij.getVliegtuigen();
		Set<String> vSet = vliegtuigen.keySet();
		for (String vNaam : vSet)
		{

			Vliegtuig vliegtuig = vliegtuigen.get(vNaam);
			VliegtuigType vtt = vliegtuig.getVliegtuigType();
			String vttCode = vtt.getCode();
			Fabrikant fb = vtt.getFabrikant();
			String fbNaam = fb.getNaam();
			int[] cp = vliegtuig.getCapaciteit();
			String cap = "R " + cp[0] + " NR " + cp[1];
			TextArea.append(
				vNaam + "	" + fbNaam + "	" + vttCode + "	" + cap + "\n");
		}
		this.setVisible(true);
		
		Ok.requestFocusInWindow();	// Om ook meteen weer uit dat window te kunnen komen.
	}

	// ActionListeners
	/** Auto-generated event handler method */
	protected void OkActionPerformed (ActionEvent evt)
	{
		dispose();
	}
	
	private JButton Ok;
	private JTextArea TextArea;
}
