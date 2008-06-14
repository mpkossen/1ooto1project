
package domeinLaag;

// Imports
import javax.swing.*;

public class BoekingException extends Exception
{
	// Constructors
	public BoekingException (String s)
	{
		JOptionPane.showMessageDialog(null, "BoekingException: " + s);
		System.out.println("BoekingException: " + s);
	}

	public BoekingException ()
	{
		JOptionPane.showMessageDialog(null, "BoekingException");
		System.out.println("BoekingException");
	}
}
