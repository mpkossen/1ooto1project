/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterfaceLaag;

import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;
import java.util.TreeMap;
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
public class BoekVluchtControllerTest {

    public BoekVluchtControllerTest() {
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
	 * Test of vertrekpuntEnBestemming method, of class BoekVluchtController.
	 */
	@Test
	public
	void vertrekpuntEnBestemming()
	{
		System.out.println("vertrekpuntEnBestemming");
		Luchthaven vertrekpunt = null;
		Luchthaven bestemming = null;
		BoekVluchtController instance = new BoekVluchtController();
		TreeMap<String, Vlucht> expResult = null;
		TreeMap<String, Vlucht> result = instance.vertrekpuntEnBestemming(vertrekpunt, bestemming);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of vlucht method, of class BoekVluchtController.
	 */
	@Test
	public
	void vlucht()
	{
		System.out.println("vlucht");
		Vlucht vlucht = null;
		BoekVluchtController instance = new BoekVluchtController();
		instance.vlucht(vlucht);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of klant method, of class BoekVluchtController.
	 */
	@Test
	public
	void klant()
	{
		System.out.println("klant");
		String nm = "";
		String str = "";
		String hnr = "";
		String pl = "";
		BoekVluchtController instance = new BoekVluchtController();
		instance.klant(nm, str, hnr, pl);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of plaats method, of class BoekVluchtController.
	 */
	@Test
	public
	void plaats()
	{
		System.out.println("plaats");
		String aantal = "";
		boolean roken = false;
		BoekVluchtController instance = new BoekVluchtController();
		instance.plaats(aantal, roken);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of ok method, of class BoekVluchtController.
	 */
	@Test
	public
	void ok()
	{
		System.out.println("ok");
		BoekVluchtController instance = new BoekVluchtController();
		instance.ok();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of cancel method, of class BoekVluchtController.
	 */
	@Test
	public
	void cancel()
	{
		System.out.println("cancel");
		BoekVluchtController instance = new BoekVluchtController();
		instance.cancel();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}