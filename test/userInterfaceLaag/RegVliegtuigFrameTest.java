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
public class RegVliegtuigFrameTest {

    public RegVliegtuigFrameTest() {
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
	 * Test of initGUI method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void initGUI()
	{
		System.out.println("initGUI");
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.initGUI();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of preInitGUI method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void preInitGUI()
	{
		System.out.println("preInitGUI");
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.preInitGUI();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of postInitGUI method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void postInitGUI()
	{
		System.out.println("postInitGUI");
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.postInitGUI();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of FabrikantComboItemStateChanged method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void FabrikantComboItemStateChanged()
	{
		System.out.println("FabrikantComboItemStateChanged");
		ItemEvent evt = null;
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.FabrikantComboItemStateChanged(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of TypeComboItemStateChanged method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void TypeComboItemStateChanged()
	{
		System.out.println("TypeComboItemStateChanged");
		ItemEvent evt = null;
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.TypeComboItemStateChanged(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of NaamTextFieldFocusLost method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void NaamTextFieldFocusLost()
	{
		System.out.println("NaamTextFieldFocusLost");
		FocusEvent evt = null;
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.NaamTextFieldFocusLost(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of InGebruikTextFieldFocusLost method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void InGebruikTextFieldFocusLost()
	{
		System.out.println("InGebruikTextFieldFocusLost");
		FocusEvent evt = null;
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.InGebruikTextFieldFocusLost(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of OKActionPerformed method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void OKActionPerformed()
	{
		System.out.println("OKActionPerformed");
		ActionEvent evt = null;
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.OKActionPerformed(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of CancelActionPerformed method, of class RegVliegtuigFrame.
	 */
	@Test
	public
	void CancelActionPerformed()
	{
		System.out.println("CancelActionPerformed");
		ActionEvent evt = null;
		RegVliegtuigFrame instance = new RegVliegtuigFrame();
		instance.CancelActionPerformed(evt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}