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
public class LandTest {

    public LandTest() {
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
	 * Test of setNaam method, of class Land.
	 */
	@Test
	public
	void setNaam()
	{
		System.out.println("setNaam");
		String nm = "";
		Land instance = null;
		instance.setNaam(nm);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setCode method, of class Land.
	 */
	@Test
	public
	void setCode()
	{
		System.out.println("setCode");
		int cd = 0;
		Land instance = null;
		instance.setCode(cd);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getNaam method, of class Land.
	 */
	@Test
	public
	void getNaam()
	{
		System.out.println("getNaam");
		Land instance = null;
		String expResult = "";
		String result = instance.getNaam();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getCode method, of class Land.
	 */
	@Test
	public
	void getCode()
	{
		System.out.println("getCode");
		Land instance = null;
		int expResult = 0;
		int result = instance.getCode();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getLuchthavens method, of class Land.
	 */
	@Test
	public
	void getLuchthavens()
	{
		System.out.println("getLuchthavens");
		Land instance = null;
		TreeMap<String, Luchthaven> expResult = null;
		TreeMap<String, Luchthaven> result = instance.getLuchthavens();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAlleLanden method, of class Land.
	 */
	@Test
	public
	void getAlleLanden()
	{
		System.out.println("getAlleLanden");
		TreeMap<String, Land> expResult = null;
		TreeMap<String, Land> result = Land.getAlleLanden();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addLuchthaven method, of class Land.
	 */
	@Test
	public
	void addLuchthaven()
	{
		System.out.println("addLuchthaven");
		Luchthaven lhvn = null;
		Land instance = null;
		instance.addLuchthaven(lhvn);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of removeLuchthaven method, of class Land.
	 */
	@Test
	public
	void removeLuchthaven()
	{
		System.out.println("removeLuchthaven");
		Luchthaven lhvn = null;
		Land instance = null;
		instance.removeLuchthaven(lhvn);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}