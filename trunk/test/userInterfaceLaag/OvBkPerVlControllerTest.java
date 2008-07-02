/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterfaceLaag;

import domeinLaag.Fabrikant;
import domeinLaag.Land;
import domeinLaag.Luchthaven;
import domeinLaag.LuchtvaartMaatschappij;
import domeinLaag.Vliegtuig;
import domeinLaag.VliegtuigType;
import domeinLaag.Vlucht;
import java.util.Calendar;
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
public class OvBkPerVlControllerTest
{
	private LuchtvaartMaatschappij lvm;
	
	private Fabrikant fab;
	
	private VliegtuigType vtt;
	
	private Land ln1;
	private Land ln2;
	
	private Vliegtuig vt1;
	private Vliegtuig vt2;
	
	private Luchthaven lhvn1;
	private Luchthaven lhvn2;
	private Luchthaven lhvn3;
	
	private Vlucht vl1;
	private Vlucht vl2;
	private Vlucht vl3;
			
	public OvBkPerVlControllerTest()
	{

	}

	@BeforeClass
	public static void setUpClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownClass() throws Exception
	{
	}

	@Before
	public void setUp()
	{
		Calendar t1 = Calendar.getInstance();
		Calendar t2 = Calendar.getInstance();
		Calendar t3 = Calendar.getInstance();
		t1.set(2008, 1, 1);
		t2.set(2008, 1, 2);
		t3.set(2008, 1, 3);
		
		this.lvm = new LuchtvaartMaatschappij("Kalizec Airlines");
		this.fab = new Fabrikant("Airbus", "Dalai Lama");
		this.vtt = new VliegtuigType(fab, "A380", 0, 650);
		
		this.ln1 = new Land("Nederland", 31);
		this.ln2 = new Land("Engeland", 44);

		this.vt1 = new Vliegtuig(lvm, vtt, "Fokke", t1);
		this.vt2 = new Vliegtuig(lvm, vtt, "Sukke", t2);
		
		this.lhvn1 = new Luchthaven("Schiphol", "AMS", true, ln1);
		this.lhvn1 = new Luchthaven("Eindhoven Airport", "EHV", false, ln1);
		this.lhvn3 = new Luchthaven("Heathrow", "HTW", true, ln2);
		
		this.vl1 = new Vlucht(vt1, lhvn1, lhvn2, t1, t2);
		this.vl2 = new Vlucht(vt1, lhvn2, lhvn1, t2, t3);
		this.vl3 = new Vlucht(vt2, lhvn1, lhvn3, t2, t3);
	}

	@After
	public void tearDown()
	{
	}

	/**
	 * Test of vertrekpuntEnBestemming method, of class OvBkPerVlController.
	 */
	@Test
	public void vertrekpuntEnBestemming()
	{
		System.out.println("vertrekpuntEnBestemming");
		Luchthaven vertrekpunt = null;
		Luchthaven bestemming = null;
		OvBkPerVlController instance = new OvBkPerVlController();
		TreeMap<String, Vlucht> expResult = null;
		TreeMap<String, Vlucht> result = instance.vertrekpuntEnBestemming(vertrekpunt, bestemming);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of vlucht method, of class OvBkPerVlController.
	 */
	@Test
	public void vlucht()
	{
		System.out.println("vlucht");
		Vlucht vl = null;
		OvBkPerVlController instance = new OvBkPerVlController();
		Object[][] expResult = null;
		Object[][] result = instance.vlucht(vl);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of cancel method, of class OvBkPerVlController.
	 */
	@Test
	public void cancel()
	{
		System.out.println("cancel");
		OvBkPerVlController instance = new OvBkPerVlController();
		instance.cancel();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of ok method, of class OvBkPerVlController.
	 */
	@Test
	public void ok()
	{
		System.out.println("ok");
		OvBkPerVlController instance = new OvBkPerVlController();
		instance.ok();
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}
