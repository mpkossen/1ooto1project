/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package domeinLaag;

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
public class BoekingTest {

    public BoekingTest() {
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
	 * Test of setRoken method, of class Boeking.
	 */
	@Test
	public
	void setRoken()
	{
		System.out.println("setRoken");
		boolean rkn = false;
		Boeking instance = new Boeking();
		instance.setRoken(rkn);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setPlaatsen method, of class Boeking.
	 */
	@Test
	public
	void setPlaatsen() throws Exception
	{
		System.out.println("setPlaatsen");
		int ap = 0;
		Boeking instance = new Boeking();
		instance.setPlaatsen(ap);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setKlant method, of class Boeking.
	 */
	@Test
	public
	void setKlant()
	{
		System.out.println("setKlant");
		Klant kl = null;
		Boeking instance = new Boeking();
		instance.setKlant(kl);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setVlucht method, of class Boeking.
	 */
	@Test
	public
	void setVlucht()
	{
		System.out.println("setVlucht");
		Vlucht vl = null;
		Boeking instance = new Boeking();
		instance.setVlucht(vl);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getRoken method, of class Boeking.
	 */
	@Test
	public
	void getRoken()
	{
		System.out.println("getRoken");
		Boeking instance = new Boeking();
		boolean expResult = false;
		boolean result = instance.getRoken();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAantalPlaatsen method, of class Boeking.
	 */
	@Test
	public
	void getAantalPlaatsen()
	{
		System.out.println("getAantalPlaatsen");
		Boeking instance = new Boeking();
		int expResult = 0;
		int result = instance.getAantalPlaatsen();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getVlucht method, of class Boeking.
	 */
	@Test
	public
	void getVlucht()
	{
		System.out.println("getVlucht");
		Boeking instance = new Boeking();
		Vlucht expResult = null;
		Vlucht result = instance.getVlucht();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getKlant method, of class Boeking.
	 */
	@Test
	public
	void getKlant()
	{
		System.out.println("getKlant");
		Boeking instance = new Boeking();
		Klant expResult = null;
		Klant result = instance.getKlant();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of bewaar method, of class Boeking.
	 */
	@Test
	public
	void bewaar() throws Exception
	{
		System.out.println("bewaar");
		Boeking instance = new Boeking();
		instance.bewaar();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}