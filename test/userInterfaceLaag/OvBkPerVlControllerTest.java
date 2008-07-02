/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterfaceLaag;

import domeinLaag.Boeking;
import domeinLaag.Fabrikant;
import domeinLaag.Klant;
import domeinLaag.Land;
import domeinLaag.Luchthaven;
import domeinLaag.LuchtvaartMaatschappij;
import domeinLaag.Vliegtuig;
import domeinLaag.VliegtuigType;
import domeinLaag.Vlucht;
import java.text.SimpleDateFormat;
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
	private Vlucht vl4;
	
	private Klant kl1;
	private Klant kl2;
	
	private Boeking bk1;
	private Boeking bk2;
	private Boeking bk3;
	private Boeking bk4;
	
	private TreeMap<String, Vlucht> expResult1;
	private TreeMap<String, Vlucht> expResult2;
	private TreeMap<String, Vlucht> expResult3;
			
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
		Calendar t4 = Calendar.getInstance();
		t1.set(2008, 1, 1);
		t2.set(2008, 1, 2);
		t3.set(2008, 1, 3);
		t4.set(2008, 1, 3);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		
		this.lvm = new LuchtvaartMaatschappij("Kalizec Airlines");
		this.fab = new Fabrikant("Airbus", "Dalai Lama");
		this.vtt = new VliegtuigType(fab, "A380", 0, 650);
		
		this.ln1 = new Land("Nederland", 31);
		this.ln2 = new Land("Engeland", 44);

		this.vt1 = new Vliegtuig(lvm, vtt, "Fokke", t1);
		this.vt2 = new Vliegtuig(lvm, vtt, "Sukke", t2);
		
		this.lhvn1 = new Luchthaven("Schiphol", "AMS", true, ln1);
		this.lhvn2 = new Luchthaven("Eindhoven Airport", "EHV", false, ln1);
		this.lhvn3 = new Luchthaven("Heathrow", "HTW", true, ln2);
		
		this.vl1 = new Vlucht(vt1, lhvn1, lhvn2, t1, t2);
		this.vl2 = new Vlucht(vt1, lhvn2, lhvn1, t2, t3);
		this.vl3 = new Vlucht(vt2, lhvn1, lhvn3, t2, t3);
		this.vl4 = new Vlucht(vt2, lhvn3, lhvn1, t3, t4);
		
		this.kl1 = new Klant("F.Masolijn", "Eikeboom", 19, "Culemborg");
		this.kl2 = new Klant("A. Becker", "Kalverstraat", 1, "Amsterdam");
		
		this.bk1 = new Boeking(vl1, 400, false, kl1);
		this.bk2 = new Boeking(vl2, 400, false, kl1);
		this.bk3 = new Boeking(vl3, 200, false, kl2);
		this.bk4 = new Boeking(vl4, 200, false, kl2);
		
		this.expResult1 = new TreeMap<String, Vlucht>();
		this.expResult1.put(formatter.format(vl1.getVertrekTijd().getTime()), vl1);
		
		this.expResult2 = new TreeMap<String, Vlucht>();
		this.expResult2.put(formatter.format(vl2.getVertrekTijd().getTime()), vl2);
		
		this.expResult3 = new TreeMap<String, Vlucht>();
		
		System.out.println("Setup completed.");
		System.out.println("Vluchten: " + domeinLaag.Vlucht.getAlleVluchten().size());
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
		System.out.println("vertrekpuntEnBestemming - Test 1");
		Luchthaven vertrekpunt = lhvn1;
		Luchthaven bestemming = lhvn2;
		OvBkPerVlController instance = new OvBkPerVlController();
		TreeMap<String, Vlucht> result = instance.vertrekpuntEnBestemming(vertrekpunt, bestemming);
		assertEquals(expResult1, result);
		
		System.out.println("vertrekpuntEnBestemming - Test 2");
		vertrekpunt = lhvn2;
		bestemming = lhvn1;
		result = instance.vertrekpuntEnBestemming(vertrekpunt, bestemming);
		assertEquals(expResult2, result);

		System.out.println("vertrekpuntEnBestemming - Test 3");
		vertrekpunt = lhvn2;
		bestemming = lhvn3;
		result = instance.vertrekpuntEnBestemming(vertrekpunt, bestemming);
		assertEquals(expResult3, result);
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
