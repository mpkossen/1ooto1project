
package domeinLaag;

// Imports
import javax.swing.*;

public class BoekingException extends Exception
{
	// Attributes


	// Relations


	// Constructors
	public BoekingException (String s)
	{
		super(s);
		JOptionPane.showMessageDialog(null, s);
	}

	public BoekingException ()
	{
		super();
		JOptionPane.showMessageDialog(null, "LuchthavenException");
	}
	
	// Setters


	// Getters


	// Adders

	
	// Removers


	// Others

}
