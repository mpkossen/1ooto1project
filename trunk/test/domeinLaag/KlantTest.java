/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package domeinLaag;

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
public class KlantTest {

    public KlantTest() {
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
	 * Test of setNaam method, of class Klant.
	 */
	@Test
	public
	void setNaam()
	{
		System.out.println("setNaam");
		String nm = "";
		Klant instance = null;
		instance.setNaam(nm);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setStraat method, of class Klant.
	 */
	@Test
	public
	void setStraat()
	{
		System.out.println("setStraat");
		String st = "";
		Klant instance = null;
		instance.setStraat(st);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setPlaats method, of class Klant.
	 */
	@Test
	public
	void setPlaats()
	{
		System.out.println("setPlaats");
		String pl = "";
		Klant instance = null;
		instance.setPlaats(pl);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setHuisNr method, of class Klant.
	 */
	@Test
	public
	void setHuisNr()
	{
		System.out.println("setHuisNr");
		int hn = 0;
		Klant instance = null;
		instance.setHuisNr(hn);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getNaam method, of class Klant.
	 */
	@Test
	public
	void getNaam()
	{
		System.out.println("getNaam");
		Klant instance = null;
		String expResult = "";
		String result = instance.getNaam();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getStraat method, of class Klant.
	 */
	@Test
	public
	void getStraat()
	{
		System.out.println("getStraat");
		Klant instance = null;
		String expResult = "";
		String result = instance.getStraat();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getPlaats method, of class Klant.
	 */
	@Test
	public
	void getPlaats()
	{
		System.out.println("getPlaats");
		Klant instance = null;
		String expResult = "";
		String result = instance.getPlaats();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getHuisNr method, of class Klant.
	 */
	@Test
	public
	void getHuisNr()
	{
		System.out.println("getHuisNr");
		Klant instance = null;
		int expResult = 0;
		int result = instance.getHuisNr();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAlleKlanten method, of class Klant.
	 */
	@Test
	public
	void getAlleKlanten()
	{
		System.out.println("getAlleKlanten");
		TreeMap<String, Klant> expResult = null;
		TreeMap<String, Klant> result = Klant.getAlleKlanten();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of bestaatAl method, of class Klant.
	 */
	@Test
	public
	void bestaatAl()
	{
		System.out.println("bestaatAl");
		Klant kl = null;
		boolean expResult = false;
		boolean result = Klant.bestaatAl(kl);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of bewaar method, of class Klant.
	 */
	@Test
	public
	void bewaar() throws Exception
	{
		System.out.println("bewaar");
		Klant instance = null;
		instance.bewaar();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}