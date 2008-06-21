
package domeinLaag;

// Imports
import javax.swing.*;

/**
 * Deze Exception wordt gegooid als er iets mis gaat bij het aanmaken of
 * bewerken van een Klant. Specifiek aleen als de klant al bleek te bestaan.
 * Dit omdat alle gegevens identiek zijn aan een reeds eerder ingevoerde klant.
 */
public class KlantBestaatAlException extends Exception
{
	/**
	 * Deze methode maakt een MessageDialog met daarin een melding.
	 * @param s	de melding die weergegeven moet worden
	 */
	public KlantBestaatAlException (String s)
	{
		JOptionPane.showMessageDialog(null, "KlantBestaatAlException: " + s);
		System.out.println("KlantBestaatAlException: " + s);
	}
	
	/**
	 * Deze methode maakt een MessageDialog met "KlantBestaatAlException".
	 */
	public KlantBestaatAlException ()
	{
		JOptionPane.showMessageDialog(null, "KlantBestaatAlException");
		System.out.println("KlantBestaatAlException");
	}
}
