
package domeinLaag;

// Imports
import javax.swing.*;

public class KlantException extends Exception
{
	public KlantException (String s)
	{
		super(s);
		JOptionPane.showMessageDialog(null, s);
	}
	
	public KlantException ()
	{
		super();
		JOptionPane.showMessageDialog(null, "KlantException");
	}
}
