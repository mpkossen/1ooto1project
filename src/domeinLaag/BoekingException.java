
package domeinLaag;

// Imports
import javax.swing.*;

/**
 * Deze Exception wordt gegooid als er iets mis gaat bij het aanmaken of
 * bewerken van een Boeking. Zaken die mis kunnen gaan zijn:
 * - Onvoldoende beschikbare capaciteit van het gewenste type.
 * - Geen vlucht geselecteerd voor deze boeking.
 * - Geen of ongeldige klantgegevens ingevoerd.
 * - Ongeldige invoer voor het aantal gewenste plaatsen.
 */
public class BoekingException extends Exception
{
	// Constructors
	/**
	 * Deze methode maakt een MessageDialog met daarin een melding.
	 * @param s de melding die weergegeven moet worden.
	 */
	public BoekingException (String s)
	{
		JOptionPane.showMessageDialog(null, "BoekingException: " + s);
		System.out.println("BoekingException: " + s);
	}

	/**
	 * Deze methode maakt een MessageDialog met "BoekingException".
	 */
	public BoekingException ()
	{
		JOptionPane.showMessageDialog(null, "BoekingException");
		System.out.println("BoekingException");
	}
}
