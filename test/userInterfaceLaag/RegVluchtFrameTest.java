/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterfaceLaag;

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kalizec
 */
public class RegVluchtFrameTest {

    public RegVluchtFrameTest() {
    }

	@BeforeClass
	public static
	void setUpClass() throws Exception
	{
	}

	@AfterClass
	public static
	void tearDownClass() throws Exception
	{
	}

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

	/**
	 * Test of initGUI method, of class RegVluchtFrame.
	 */
	@Test
	public
	void initGUI()
	{
		System.out.println("initGUI");
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.initGUI();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of preInitGUI method, of class RegVluchtFrame.
	 */
	@Test
	public
	void preInitGUI()
	{
		System.out.println("preInitGUI");
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.preInitGUI();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of postInitGUI method, of class RegVluchtFrame.
	 */
	@Test
	public
	void postInitGUI()
	{
		System.out.println("postInitGUI");
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.postInitGUI();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of main method, of class RegVluchtFrame.
	 */
	@Test
	public
	void main()
	{
		System.out.println("main");
		String[] args = null;
		RegVluchtFrame.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of showGUI method, of class RegVluchtFrame.
	 */
	@Test
	public
	void showGUI()
	{
		System.out.println("showGUI");
		RegVluchtFrame.showGUI();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of vliegtuigBoxItemStateChanged method, of class RegVluchtFrame.
	 */
	@Test
	public
	void vliegtuigBoxItemStateChanged()
	{
		System.out.println("vliegtuigBoxItemStateChanged");
		ItemEvent evt = null;
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.vliegtuigBoxItemStateChanged(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of vertrekPuntenBoxItemStateChanged method, of class RegVluchtFrame.
	 */
	@Test
	public
	void vertrekPuntenBoxItemStateChanged()
	{
		System.out.println("vertrekPuntenBoxItemStateChanged");
		ItemEvent evt = null;
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.vertrekPuntenBoxItemStateChanged(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of bestemmingenBoxItemStateChanged method, of class RegVluchtFrame.
	 */
	@Test
	public
	void bestemmingenBoxItemStateChanged()
	{
		System.out.println("bestemmingenBoxItemStateChanged");
		ItemEvent evt = null;
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.bestemmingenBoxItemStateChanged(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of okButtonActionPerformed method, of class RegVluchtFrame.
	 */
	@Test
	public
	void okButtonActionPerformed()
	{
		System.out.println("okButtonActionPerformed");
		ActionEvent evt = null;
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.okButtonActionPerformed(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of cancelButtonActionPerformed method, of class RegVluchtFrame.
	 */
	@Test
	public
	void cancelButtonActionPerformed()
	{
		System.out.println("cancelButtonActionPerformed");
		ActionEvent evt = null;
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.cancelButtonActionPerformed(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of vertrekTijdVeldFocusLost method, of class RegVluchtFrame.
	 */
	@Test
	public
	void vertrekTijdVeldFocusLost()
	{
		System.out.println("vertrekTijdVeldFocusLost");
		FocusEvent evt = null;
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.vertrekTijdVeldFocusLost(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of aankomstTijdVeldFocusLost method, of class RegVluchtFrame.
	 */
	@Test
	public
	void aankomstTijdVeldFocusLost()
	{
		System.out.println("aankomstTijdVeldFocusLost");
		FocusEvent evt = null;
		RegVluchtFrame instance = new RegVluchtFrame();
		instance.aankomstTijdVeldFocusLost(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}