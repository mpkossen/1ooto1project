/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package domeinLaag;

import java.util.Calendar;
import java.util.HashSet;
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
public class VluchtTest {

    public VluchtTest() {
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
	 * Test of setVertrekTijd method, of class Vlucht.
	 */
	@Test
	public
	void setVertrekTijd() throws Exception
	{
		System.out.println("setVertrekTijd");
		Calendar tijd = null;
		Vlucht instance = null;
		instance.setVertrekTijd(tijd);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setAankomstTijd method, of class Vlucht.
	 */
	@Test
	public
	void setAankomstTijd() throws Exception
	{
		System.out.println("setAankomstTijd");
		Calendar tijd = null;
		Vlucht instance = null;
		instance.setAankomstTijd(tijd);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setVliegtuig method, of class Vlucht.
	 */
	@Test
	public
	void setVliegtuig()
	{
		System.out.println("setVliegtuig");
		Vliegtuig vlt = null;
		Vlucht instance = null;
		instance.setVliegtuig(vlt);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setBestemming method, of class Vlucht.
	 */
	@Test
	public
	void setBestemming() throws Exception
	{
		System.out.println("setBestemming");
		Luchthaven bestemming = null;
		Vlucht instance = null;
		instance.setBestemming(bestemming);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getVertrekTijd method, of class Vlucht.
	 */
	@Test
	public
	void getVertrekTijd()
	{
		System.out.println("getVertrekTijd");
		Vlucht instance = null;
		Calendar expResult = null;
		Calendar result = instance.getVertrekTijd();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAankomstTijd method, of class Vlucht.
	 */
	@Test
	public
	void getAankomstTijd()
	{
		System.out.println("getAankomstTijd");
		Vlucht instance = null;
		Calendar expResult = null;
		Calendar result = instance.getAankomstTijd();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getVliegtuig method, of class Vlucht.
	 */
	@Test
	public
	void getVliegtuig()
	{
		System.out.println("getVliegtuig");
		Vlucht instance = null;
		Vliegtuig expResult = null;
		Vliegtuig result = instance.getVliegtuig();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getVertrekpunt method, of class Vlucht.
	 */
	@Test
	public
	void getVertrekpunt()
	{
		System.out.println("getVertrekpunt");
		Vlucht instance = null;
		Luchthaven expResult = null;
		Luchthaven result = instance.getVertrekpunt();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getBestemming method, of class Vlucht.
	 */
	@Test
	public
	void getBestemming()
	{
		System.out.println("getBestemming");
		Vlucht instance = null;
		Luchthaven expResult = null;
		Luchthaven result = instance.getBestemming();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAlleBoekingen method, of class Vlucht.
	 */
	@Test
	public
	void getAlleBoekingen()
	{
		System.out.println("getAlleBoekingen");
		Vlucht instance = null;
		HashSet<Boeking> expResult = null;
		HashSet<Boeking> result = instance.getAlleBoekingen();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getAlleVluchten method, of class Vlucht.
	 */
	@Test
	public
	void getAlleVluchten()
	{
		System.out.println("getAlleVluchten");
		HashSet<Vlucht> expResult = null;
		HashSet<Vlucht> result = Vlucht.getAlleVluchten();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of addBoeking method, of class Vlucht.
	 */
	@Test
	public
	void addBoeking()
	{
		System.out.println("addBoeking");
		Boeking bk = null;
		Vlucht instance = null;
		instance.addBoeking(bk);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of removeBoeking method, of class Vlucht.
	 */
	@Test
	public
	void removeBoeking()
	{
		System.out.println("removeBoeking");
		Boeking bk = null;
		Vlucht instance = null;
		instance.removeBoeking(bk);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of bewaar method, of class Vlucht.
	 */
	@Test
	public
	void bewaar() throws Exception
	{
		System.out.println("bewaar");
		Vlucht instance = null;
		instance.bewaar();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of vertrekpuntEnBestemming method, of class Vlucht.
	 */
	@Test
	public
	void vertrekpuntEnBestemming()
	{
		System.out.println("vertrekpuntEnBestemming");
		Luchthaven vtk = null;
		Luchthaven bst = null;
		HashSet<Vlucht> expResult = null;
		HashSet<Vlucht> result = Vlucht.vertrekpuntEnBestemming(vtk, bst);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

}