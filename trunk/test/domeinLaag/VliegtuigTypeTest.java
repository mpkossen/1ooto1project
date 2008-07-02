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
public class VliegtuigTypeTest {

    public VliegtuigTypeTest() {
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
	 * Test of getCode method, of class VliegtuigType.
	 */
	@Test
	public
	void getCode()
	{
		System.out.println("getCode");
		VliegtuigType instance = null;
		String expResult = "";
		String result = instance.getCode();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getFabrikant method, of class VliegtuigType.
	 */
	@Test
	public
	void getFabrikant()
	{
		System.out.println("getFabrikant");
		VliegtuigType instance = null;
		Fabrikant expResult = null;
		Fabrikant result = instance.getFabrikant();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getCapaciteit method, of class VliegtuigType.
	 */
	@Test
	public
	void getCapaciteit()
	{
		System.out.println("getCapaciteit");
		VliegtuigType instance = null;
		int[] expResult = null;
		int[] result = instance.getCapaciteit();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}