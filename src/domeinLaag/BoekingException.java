
package domeinLaag;

// Imports
import javax.swing.*;

/**
 * Deze Exception wordt gegooid als er iets mis gaat bij het aanmaken of bewerken van een Boeking.
 */
public class BoekingException extends Exception
{
	// Constructors
	/**
	 * Deze methode maakt een MessageDialog met daarin een melding.
	 * @param s is de melding die weergegeven moet worden.
	 */
	public BoekingException (String s)
	{
		JOptionPane.showMessageDialog(null, "BoekingException: " + s);
		System.out.println("BoekingException: " + s);
	}

	/**
	 * Deze methode mmaakt een MessageDialog met "BoekingException".
	 */
	public BoekingException ()
	{
		JOptionPane.showMessageDialog(null, "BoekingException");
		System.out.println("BoekingException");
	}
}
