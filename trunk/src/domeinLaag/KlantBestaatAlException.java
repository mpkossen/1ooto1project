
package domeinLaag;

// Imports
import javax.swing.*;

public class KlantBestaatAlException extends Exception
{
	public KlantBestaatAlException (String s)
	{
		super(s);
		JOptionPane.showMessageDialog(null, s);
	}
	
	public KlantBestaatAlException ()
	{
		super();
		JOptionPane.showMessageDialog(null, "KlantException");
	}
}
