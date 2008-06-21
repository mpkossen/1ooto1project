
package domeinLaag;

// Imports
import javax.swing.*;

/**
 * Deze Exception wordt gegooid als er iets mis gaat bij het aanmaken of
 * bewerken van een Klant.
 */
public class KlantException extends Exception
{
	/**
	 * Deze methode maakt een MessageDialog met daarin een melding.
	 * @param s	de melding die weergegeven moet worden
	 */
	public KlantException (String s)
	{
		JOptionPane.showMessageDialog(null, "KlantException: " + s);
		System.out.println("KlantException: " + s);
	}
	
	/**
	 * Deze methode maakt een MessageDialog met "KlantException".
	 */
	public KlantException ()
	{
		JOptionPane.showMessageDialog(null, "KlantException");
		System.out.println("KlantException");
	}
}
