
package domeinLaag;

// imports
import javax.swing.*;

/**
 * Deze Exception wordt gegooid als er iets mis gaat bij het aanmaken of
 * bewerken van een Vlucht.
 */
public class VluchtException extends Exception
{
	/**
	 * Deze methode maakt een MessageDialog met daarin een melding.
	 * @param s	de melding die weergegeven moet worden
	 */
	public VluchtException(String s)
	{
		super(s);
		JOptionPane.showMessageDialog(null, s);
	}
	
	/**
	 * Deze methode maakt een MessageDialog met "VluchtException".
	 */
	public VluchtException()
	{
		super();
		JOptionPane.showMessageDialog(null, "VluchtException");
	}
}
