/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterfaceLaag;

import domeinLaag.*;
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
public class RegLuchthavenControllerTest {
    private LuchtvaartMaatschappij lvm;

		private Fabrikant f1;
		private Fabrikant f2;
		private Fabrikant f3;

		private VliegtuigType vtt1;
		private VliegtuigType vtt2;
		private VliegtuigType vtt3;
		private VliegtuigType vtt4;
		private VliegtuigType vtt5;
		private VliegtuigType vtt6;

		private Calendar datum;
		private Vliegtuig vt1;
		private Vliegtuig vt2;
		private Vliegtuig vt3;
		private Vliegtuig vt4;
		private Vliegtuig vt5;

		private Land l1;
		private Land l2;
		private Land l3;
		private Land l4;
		private Land l5;

		private Luchthaven lh1;
		private Luchthaven lh2;
		private Luchthaven lh3;
		private Luchthaven lh4;
		private Luchthaven lh5;

		private Calendar vertrek;
		private Calendar aankomst;

		private Vlucht v1;
		private Vlucht v2;
		private Vlucht v3;
		private Vlucht v4;
		private Vlucht v5;
		private Vlucht v6;

		private Klant k1;
		private Klant k2;
		private Klant k3;
		private Klant k4;

		private Boeking b1;
		private Boeking b2;

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
		this.lvm = new LuchtvaartMaatschappij("NLM");

		this.f1 = new Fabrikant("Airbus", "G. Dejenelle");
		this.f2 = new Fabrikant("Fokker", "A.J. Berger");
		this.f3 = new Fabrikant("Boeing", "W.J. McNerney");

		this.vtt1 = f1.createVliegtuigType("A-200", 60, 80);
		this.vtt2 = f1.createVliegtuigType("A-201", 65, 88);
		this.vtt3 = f2.createVliegtuigType("F-100", 37, 70);
		this.vtt4 = f2.createVliegtuigType("F-101", 45, 82);
		this.vtt5 = f3.createVliegtuigType("747", 140, 245);
		this.vtt6 = f3.createVliegtuigType("777", 110, 165);

		this.datum = Calendar.getInstance();
		datum.set(2000, 1, 1);
		this.vt1 = new Vliegtuig(lvm, vtt1, "Luchtbus 100", datum);
		datum.set(2006, 6, 1);
		this.vt2 = new Vliegtuig(lvm, vtt3, "Karel Doorman", datum);
		datum.set(1999, 11, 1);
		this.vt3 = new Vliegtuig(lvm, vtt4, "Fokke", datum);
		datum.set(1999, 11, 1);
		this.vt4 = new Vliegtuig(lvm, vtt4, "Sukke", datum);
		datum.set(2005, 8, 1);
		this.vt5 = new Vliegtuig(lvm, vtt5, "Cargo 1", datum);

		this.l1 = new Land("Nederland", 31);
		this.l2 = new Land("België", 32);
		this.l3 = new Land("Frankrijk", 11);
		this.l4 = new Land("Duitsland", 13);
		this.l5 = new Land("Engeland", 44);

		this.lh1 = new Luchthaven("Schiphol", "ASD", true, l1);
		this.lh2 = new Luchthaven("Charles de Gaule", "PRI", true, l3);
		this.lh3 = new Luchthaven("Tegel", "TEG", true, l4);
		this.lh4 = new Luchthaven("Heathrow", "HTW", true, l5);
		this.lh5 = new Luchthaven("Brussel", "BRU", false, l2);

		this.vertrek = Calendar.getInstance();
		this.aankomst = Calendar.getInstance();
		vertrek.set(2008, 0, 1, 12, 0);
		aankomst.set(2008, 0, 2, 12, 0);

		this.v1 = new Vlucht(vt3, lh1, lh2, vertrek, aankomst);
		this.v2 = new Vlucht(vt3, lh1, lh3, vertrek, aankomst);
		this.v3 = new Vlucht(vt3, lh2, lh3, vertrek, aankomst);

		vertrek.set(2008, 0, 2, 12, 0);
		aankomst.set(2008, 0, 3, 12, 0);

		this.v4 = new Vlucht(vt3, lh1, lh2, vertrek, aankomst);
		this.v5 = new Vlucht(vt3, lh1, lh3, vertrek, aankomst);
		this.v6 = new Vlucht(vt3, lh2, lh3, vertrek, aankomst);

		this.k1 = new Klant("Frank Masolijn", "Eikeboom", 19, "Culemborg");
		this.k2 = new Klant("Maarten Kossen", "Geen Idee", 10, "Ergens");
		this.k3 = new Klant("Tim Lambo", "Weet ik veel?", 17, "Ergens Anders");
		this.k4 = new Klant("Arno Becker", "Nergens?", 1, "Dakloos");

		this.b1 = new Boeking(v1, 1, false, k1);
		this.b2 = new Boeking(v2, 1, false, k2);
		v1.addBoeking(b1);
		v1.addBoeking(b2);
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
		System.out.println("land - Test 1");
		Land land = l1;
		RegLuchthavenController instance = new RegLuchthavenController();
		int expResult = 31;
		int result = instance.land(land);
		assertEquals(expResult, result);
	}

	/**
	 * Test of naam method, of class RegLuchthavenController.
	 */
	@Test
	public
	void naam() throws Exception
	{
		System.out.println("naam - Test 1");
		String nm = "Almere Airport";
		RegLuchthavenController instance = new RegLuchthavenController();
		instance.land(l1);
		instance.naam(nm);
		
		System.out.println("naam - Test 2");
		nm = "Schiphol";
		instance = new RegLuchthavenController();
		try
		{
		    instance.land(l1);
		    instance.naam(nm);
		    fail("Namen mogen niet dubbel zijn");
		}
		catch (LuchthavenException e)
		{

		}
	}

	/**
	 * Test of code method, of class RegLuchthavenController.
	 */
	@Test
	public
	void code() throws Exception
	{
		System.out.println("code - Test 1");
		String code = "AMS";
		RegLuchthavenController instance = new RegLuchthavenController();
		try
		{
		    instance.code(code);
		}
		catch (LuchthavenException e)
		{
		    fail("Hier had geen exception op mogen treden");
		}
	}

	/**
	 * Test of werkPlaats method, of class RegLuchthavenController.
	 */
	@Test
	public
	void werkPlaats() throws Exception
	{
		System.out.println("werkPlaats - Test 1");
		boolean wp = lh1.getWerkPlaats();
		RegLuchthavenController instance = new RegLuchthavenController();
		instance.werkPlaats(wp);
	}

	/**
	 * Test of ok method, of class RegLuchthavenController.
	 */
	@Test
	public
	void ok() throws Exception
	{
		System.out.println("ok - Test 1");
		RegLuchthavenController instance = new RegLuchthavenController();
		Land l9 = new Land("JHKDHKJSD", 123);
		// Luchthaven lh9 = new Luchthaven("Mumbay Airport", "IAP", true, l9);
		instance.land(l9);
		try
		{
		    instance.naam("Mumbay");
		}
		catch (LuchthavenException e)
		{
		    fail("Namen mogen niet dubbel zijn");
		}
		instance.code("IAP");
		instance.ok();
	}

	/**
	 * Test of cancel method, of class RegLuchthavenController.
	 */
	@Test
	public
	void cancel()
	{
		System.out.println("cancel - Test 1");
		RegLuchthavenController instance = new RegLuchthavenController();
		instance.cancel();
	}

}