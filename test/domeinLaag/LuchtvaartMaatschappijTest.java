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
public class LuchtvaartMaatschappijTest {

    public LuchtvaartMaatschappijTest() {
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
	 * Test of getVliegtuigen method, of class LuchtvaartMaatschappij.
	 */
	@Test
	public
	void getVliegtuigen()
	{
		System.out.println("getVliegtuigen");
		LuchtvaartMaatschappij instance = null;
		TreeMap<String, Vliegtuig> expResult = null;
		TreeMap<String, Vliegtuig> result = instance.getVliegtuigen();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addVliegtuig method, of class LuchtvaartMaatschappij.
	 */
	@Test
	public
	void addVliegtuig()
	{
		System.out.println("addVliegtuig");
		Vliegtuig vt = null;
		LuchtvaartMaatschappij instance = null;
		instance.addVliegtuig(vt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of removeVliegtuig method, of class LuchtvaartMaatschappij.
	 */
	@Test
	public
	void removeVliegtuig()
	{
		System.out.println("removeVliegtuig");
		Vliegtuig vt = null;
		LuchtvaartMaatschappij instance = null;
		instance.removeVliegtuig(vt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}