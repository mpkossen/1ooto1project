
package domeinLaag;

// Imports
import javax.swing.*;

public class KlantBestaatAlException extends Exception
{
	public KlantBestaatAlException (String s)
	{
		JOptionPane.showMessageDialog(null, "KlantBestaatAlException: " + s);
		System.out.println("KlantBestaatAlException: " + s);
	}
	
	public KlantBestaatAlException ()
	{
		JOptionPane.showMessageDialog(null, "KlantBestaatAlException");
		System.out.println("KlantBestaatAlException");
	}
}
