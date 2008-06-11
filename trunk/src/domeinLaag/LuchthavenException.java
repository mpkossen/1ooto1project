package domeinLaag;

import javax.swing.*;
// LuchthavenException.java created on 28-mei-2008

/**
 * @author Frank Masolijn
 */
public class LuchthavenException extends Exception {

	/**
	 * 
	 */
	public LuchthavenException() {
		super();
		JOptionPane.showMessageDialog(null, "LuchthavenException");
	}

	/**
	 * @param arg0
	 */
	public LuchthavenException(String s) {
		super(s);
		JOptionPane.showMessageDialog(null, s);
	}
}
