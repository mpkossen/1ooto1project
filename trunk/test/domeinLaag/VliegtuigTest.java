/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package domeinLaag;

import java.util.Calendar;
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
public class VliegtuigTest {

    public VliegtuigTest() {
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
	 * Test of setVliegtuigType method, of class Vliegtuig.
	 */
	@Test
	public
	void setVliegtuigType()
	{
		System.out.println("setVliegtuigType");
		VliegtuigType vtt = null;
		Vliegtuig instance = null;
		instance.setVliegtuigType(vtt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setNaam method, of class Vliegtuig.
	 */
	@Test
	public
	void setNaam()
	{
		System.out.println("setNaam");
		String nm = "";
		Vliegtuig instance = null;
		instance.setNaam(nm);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setInGebruik method, of class Vliegtuig.
	 */
	@Test
	public
	void setInGebruik()
	{
		System.out.println("setInGebruik");
		Calendar inGebruik = null;
		Vliegtuig instance = null;
		instance.setInGebruik(inGebruik);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getVliegtuigType method, of class Vliegtuig.
	 */
	@Test
	public
	void getVliegtuigType()
	{
		System.out.println("getVliegtuigType");
		Vliegtuig instance = null;
		VliegtuigType expResult = null;
		VliegtuigType result = instance.getVliegtuigType();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getNaam method, of class Vliegtuig.
	 */
	@Test
	public
	void getNaam()
	{
		System.out.println("getNaam");
		Vliegtuig instance = null;
		String expResult = "";
		String result = instance.getNaam();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getCapaciteit method, of class Vliegtuig.
	 */
	@Test
	public
	void getCapaciteit()
	{
		System.out.println("getCapaciteit");
		Vliegtuig instance = null;
		int[] expResult = null;
		int[] result = instance.getCapaciteit();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of bewaar method, of class Vliegtuig.
	 */
	@Test
	public
	void bewaar()
	{
		System.out.println("bewaar");
		Vliegtuig instance = null;
		instance.bewaar();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}