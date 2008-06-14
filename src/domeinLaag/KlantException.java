
package domeinLaag;

// Imports
import javax.swing.*;

public class KlantException extends Exception
{
	public KlantException (String s)
	{
		JOptionPane.showMessageDialog(null, "KlantException: " + s);
		System.out.println("KlantException: " + s);
	}
	
	public KlantException ()
	{
		JOptionPane.showMessageDialog(null, "KlantException");
		System.out.println("KlantException");
	}
}
