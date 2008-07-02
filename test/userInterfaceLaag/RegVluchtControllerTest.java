/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterfaceLaag;

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
public class RegVluchtControllerTest {

    public RegVluchtControllerTest() {
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
	 * Test of vliegtuig method, of class RegVluchtController.
	 */
	@Test
	public
	void vliegtuig()
	{
		System.out.println("vliegtuig");
		String nm = "";
		RegVluchtController instance = null;
		int[] expResult = null;
		int[] result = instance.vliegtuig(nm);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of vertrekpunt method, of class RegVluchtController.
	 */
	@Test
	public
	void vertrekpunt()
	{
		System.out.println("vertrekpunt");
		String nm = "";
		RegVluchtController instance = null;
		instance.vertrekpunt(nm);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of bestemming method, of class RegVluchtController.
	 */
	@Test
	public
	void bestemming() throws Exception
	{
		System.out.println("bestemming");
		String nm = "";
		RegVluchtController instance = null;
		instance.bestemming(nm);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of vertrektijd method, of class RegVluchtController.
	 */
	@Test
	public
	void vertrektijd() throws Exception
	{
		System.out.println("vertrektijd");
		Calendar vtt = null;
		RegVluchtController instance = null;
		instance.vertrektijd(vtt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of aankomstTijd method, of class RegVluchtController.
	 */
	@Test
	public
	void aankomstTijd() throws Exception
	{
		System.out.println("aankomstTijd");
		Calendar att = null;
		RegVluchtController instance = null;
		instance.aankomstTijd(att);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of ok method, of class RegVluchtController.
	 */
	@Test
	public
	void ok() throws Exception
	{
		System.out.println("ok");
		RegVluchtController instance = null;
		instance.ok();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}