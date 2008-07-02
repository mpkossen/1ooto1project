/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterfaceLaag;

import domeinLaag.Land;
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
public class RegLuchthavenControllerTest {

    public RegLuchthavenControllerTest() {
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
	 * Test of land method, of class RegLuchthavenController.
	 */
	@Test
	public
	void land()
	{
		System.out.println("land");
		Land land = null;
		RegLuchthavenController instance = new RegLuchthavenController();
		int expResult = 0;
		int result = instance.land(land);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of naam method, of class RegLuchthavenController.
	 */
	@Test
	public
	void naam() throws Exception
	{
		System.out.println("naam");
		String nm = "";
		RegLuchthavenController instance = new RegLuchthavenController();
		instance.naam(nm);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of code method, of class RegLuchthavenController.
	 */
	@Test
	public
	void code() throws Exception
	{
		System.out.println("code");
		String code = "";
		RegLuchthavenController instance = new RegLuchthavenController();
		instance.code(code);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of werkPlaats method, of class RegLuchthavenController.
	 */
	@Test
	public
	void werkPlaats() throws Exception
	{
		System.out.println("werkPlaats");
		boolean wp = false;
		RegLuchthavenController instance = new RegLuchthavenController();
		instance.werkPlaats(wp);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of ok method, of class RegLuchthavenController.
	 */
	@Test
	public
	void ok() throws Exception
	{
		System.out.println("ok");
		RegLuchthavenController instance = new RegLuchthavenController();
		instance.ok();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of cancel method, of class RegLuchthavenController.
	 */
	@Test
	public
	void cancel()
	{
		System.out.println("cancel");
		RegLuchthavenController instance = new RegLuchthavenController();
		instance.cancel();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}