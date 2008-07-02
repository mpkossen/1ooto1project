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
public class FabrikantTest {

    public FabrikantTest() {
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
	 * Test of setNaam method, of class Fabrikant.
	 */
	@Test
	public
	void setNaam()
	{
		System.out.println("setNaam");
		String nm = "";
		Fabrikant instance = null;
		instance.setNaam(nm);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setContactPersoon method, of class Fabrikant.
	 */
	@Test
	public
	void setContactPersoon()
	{
		System.out.println("setContactPersoon");
		String cp = "";
		Fabrikant instance = null;
		instance.setContactPersoon(cp);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getNaam method, of class Fabrikant.
	 */
	@Test
	public
	void getNaam()
	{
		System.out.println("getNaam");
		Fabrikant instance = null;
		String expResult = "";
		String result = instance.getNaam();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getContactpersoon method, of class Fabrikant.
	 */
	@Test
	public
	void getContactpersoon()
	{
		System.out.println("getContactpersoon");
		Fabrikant instance = null;
		String expResult = "";
		String result = instance.getContactpersoon();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getVliegtuigTypen method, of class Fabrikant.
	 */
	@Test
	public
	void getVliegtuigTypen()
	{
		System.out.println("getVliegtuigTypen");
		Fabrikant instance = null;
		TreeMap<String, VliegtuigType> expResult = null;
		TreeMap<String, VliegtuigType> result = instance.getVliegtuigTypen();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAlleFabrikanten method, of class Fabrikant.
	 */
	@Test
	public
	void getAlleFabrikanten()
	{
		System.out.println("getAlleFabrikanten");
		TreeMap<String, Fabrikant> expResult = null;
		TreeMap<String, Fabrikant> result = Fabrikant.getAlleFabrikanten();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of createVliegtuigType method, of class Fabrikant.
	 */
	@Test
	public
	void createVliegtuigType()
	{
		System.out.println("createVliegtuigType");
		String code = "";
		int capR = 0;
		int capNR = 0;
		Fabrikant instance = null;
		VliegtuigType expResult = null;
		VliegtuigType result = instance.createVliegtuigType(code, capR, capNR);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}