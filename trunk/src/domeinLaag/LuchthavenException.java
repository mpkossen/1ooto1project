
package domeinLaag;

// Imports
import javax.swing.*;

/**
 * Deze Exception wordt gegooid als er iets mis gaat bij het aanmaken of
 * bewerken van een Luchthaven.
 */
public class LuchthavenException extends Exception
{
	/**
	 * Deze methode maakt een MessageDialog met daarin een melding.
	 * @param s	de melding die weergegeven moet worden
	 */
	public LuchthavenException(String s)
	{
		super(s);
		JOptionPane.showMessageDialog(null, s);
	}	

	/**
	 * Deze methode maakt een MessageDialog met "LuchthavenException".
	 */
	public LuchthavenException()
	{
		super();
		JOptionPane.showMessageDialog(null, "LuchthavenException");
	}
}
