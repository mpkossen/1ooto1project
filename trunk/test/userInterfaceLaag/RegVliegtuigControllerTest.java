/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterfaceLaag;

import java.util.Calendar;
import java.util.Vector;
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
public class RegVliegtuigControllerTest {

    public RegVliegtuigControllerTest() {
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
	 * Test of fabrikant method, of class RegVliegtuigController.
	 */
	@Test
	public
	void fabrikant()
	{
		System.out.println("fabrikant");
		String fbrn = "";
		RegVliegtuigController instance = null;
		Vector<String> expResult = null;
		Vector<String> result = instance.fabrikant(fbrn);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of type method, of class RegVliegtuigController.
	 */
	@Test
	public
	void type()
	{
		System.out.println("type");
		String vttcd = "";
		RegVliegtuigController instance = null;
		int[] expResult = null;
		int[] result = instance.type(vttcd);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of naam method, of class RegVliegtuigController.
	 */
	@Test
	public
	void naam()
	{
		System.out.println("naam");
		String naam = "";
		RegVliegtuigController instance = null;
		instance.naam(naam);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of inGebruik method, of class RegVliegtuigController.
	 */
	@Test
	public
	void inGebruik()
	{
		System.out.println("inGebruik");
		Calendar inGebruik = null;
		RegVliegtuigController instance = null;
		instance.inGebruik(inGebruik);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of ok method, of class RegVliegtuigController.
	 */
	@Test
	public
	void ok()
	{
		System.out.println("ok");
		RegVliegtuigController instance = null;
		instance.ok();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of cancel method, of class RegVliegtuigController.
	 */
	@Test
	public
	void cancel()
	{
		System.out.println("cancel");
		RegVliegtuigController instance = null;
		instance.cancel();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}