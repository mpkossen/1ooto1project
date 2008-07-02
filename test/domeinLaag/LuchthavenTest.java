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
public class LuchthavenTest {

    public LuchthavenTest() {
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
	 * Test of setNaam method, of class Luchthaven.
	 */
	@Test
	public
	void setNaam()
	{
		System.out.println("setNaam");
		String nm = "";
		Luchthaven instance = new Luchthaven();
		instance.setNaam(nm);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setCode method, of class Luchthaven.
	 */
	@Test
	public
	void setCode()
	{
		System.out.println("setCode");
		String code = "";
		Luchthaven instance = new Luchthaven();
		instance.setCode(code);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setLand method, of class Luchthaven.
	 */
	@Test
	public
	void setLand()
	{
		System.out.println("setLand");
		Land land = null;
		Luchthaven instance = new Luchthaven();
		instance.setLand(land);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setWerkPlaats method, of class Luchthaven.
	 */
	@Test
	public
	void setWerkPlaats()
	{
		System.out.println("setWerkPlaats");
		boolean wp = false;
		Luchthaven instance = new Luchthaven();
		instance.setWerkPlaats(wp);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getNaam method, of class Luchthaven.
	 */
	@Test
	public
	void getNaam()
	{
		System.out.println("getNaam");
		Luchthaven instance = new Luchthaven();
		String expResult = "";
		String result = instance.getNaam();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getCode method, of class Luchthaven.
	 */
	@Test
	public
	void getCode()
	{
		System.out.println("getCode");
		Luchthaven instance = new Luchthaven();
		String expResult = "";
		String result = instance.getCode();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getWerkPlaats method, of class Luchthaven.
	 */
	@Test
	public
	void getWerkPlaats()
	{
		System.out.println("getWerkPlaats");
		Luchthaven instance = new Luchthaven();
		boolean expResult = false;
		boolean result = instance.getWerkPlaats();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getLand method, of class Luchthaven.
	 */
	@Test
	public
	void getLand()
	{
		System.out.println("getLand");
		Luchthaven instance = new Luchthaven();
		Land expResult = null;
		Land result = instance.getLand();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAlleLuchthavens method, of class Luchthaven.
	 */
	@Test
	public
	void getAlleLuchthavens()
	{
		System.out.println("getAlleLuchthavens");
		TreeMap<String, Luchthaven> expResult = null;
		TreeMap<String, Luchthaven> result = Luchthaven.getAlleLuchthavens();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of bewaar method, of class Luchthaven.
	 */
	@Test
	public
	void bewaar() throws Exception
	{
		System.out.println("bewaar");
		Luchthaven instance = new Luchthaven();
		instance.bewaar();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}