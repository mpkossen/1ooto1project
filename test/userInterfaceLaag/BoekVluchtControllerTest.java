/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterfaceLaag;

import domeinLaag.*;
import java.util.Calendar;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.text.SimpleDateFormat;
import static org.junit.Assert.*;

/**
 *
 * @author kalizec
 */
public class BoekVluchtControllerTest {

    Luchthaven lh1, lh2, lh3, lh4, lh5;
    Vliegtuig vt1, vt2, vt3, vt4, vt5;
    Vlucht v1, v2, v3;
    SimpleDateFormat sdf;
    public BoekVluchtControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
	LuchtvaartMaatschappij lvm = new LuchtvaartMaatschappij("NLM");

	Fabrikant f1 = new Fabrikant("Airbus", "G. Dejenelle");
	Fabrikant f2 = new Fabrikant("Fokker", "A.J. Berger");
	Fabrikant f3 = new Fabrikant("Boeing", "W.J. McNerney");

	VliegtuigType vtt1 = f1.createVliegtuigType("A-200", 60, 80);
	VliegtuigType vtt2 = f1.createVliegtuigType("A-201", 65, 88);
	VliegtuigType vtt3 = f2.createVliegtuigType("F-100", 37, 70);
	VliegtuigType vtt4 = f2.createVliegtuigType("F-101", 45, 82);
	VliegtuigType vtt5 = f3.createVliegtuigType("747", 140, 245);
	VliegtuigType vtt6 = f3.createVliegtuigType("777", 110, 165);

	Calendar datum = Calendar.getInstance();
	datum.set(2000, 1, 1);
	 vt1 = new Vliegtuig(lvm, vtt1, "Luchtbus 100", datum);
	datum.set(2006, 6, 1);
	 vt2 = new Vliegtuig(lvm, vtt3, "Karel Doorman", datum);
	datum.set(1999, 11, 1);
	 vt3 = new Vliegtuig(lvm, vtt4, "Fokke", datum);
	datum.set(1999, 11, 1);
	 vt4 = new Vliegtuig(lvm, vtt4, "Sukke", datum);
	datum.set(2005, 8, 1);
	 vt5 = new Vliegtuig(lvm, vtt5, "Cargo 1", datum);

	Land l1 = new Land("Nederland", 31);
	Land l2 = new Land("België", 32);
	Land l3 = new Land("Frankrijk", 11);
	Land l4 = new Land("Duitsland", 13);
	Land l5 = new Land("Engeland", 44);

	lh1 = new Luchthaven("Schiphol", "ASD", true, l1);
	lh2 = new Luchthaven("Charles de Gaule", "PRI", true, l3);
	lh3 = new Luchthaven("Tegel", "TEG", true, l4);
	lh4 = new Luchthaven("Heathrow", "HTW", true, l5);
	lh5 = new Luchthaven("Brussel", "BRU", false, l2);

	Calendar vertrek = Calendar.getInstance();
	Calendar aankomst = Calendar.getInstance();
	vertrek.set(2008, 0, 1, 12, 0);
	aankomst.set(2008, 0, 2, 12, 0);

	 v1 = new Vlucht(vt3, lh1, lh2, vertrek, aankomst);
	// v2 = new Vlucht(vt3, lh2, lh1, vertrek, aankomst);
	// v3 = new Vlucht(vt3, lh2, lh3, vertrek, aankomst);

	vertrek.set(2008, 0, 2, 12, 0);
	aankomst.set(2008, 0, 3, 12, 0);

	/*Vlucht v4 = new Vlucht(vt3, lh1, lh2, vertrek, aankomst);
	Vlucht v5 = new Vlucht(vt3, lh1, lh3, vertrek, aankomst);
	Vlucht v6 = new Vlucht(vt3, lh2, lh3, vertrek, aankomst);*/

	Klant k1 = new Klant("Frank Masolijn", "Eikeboom", 19, "Culemborg");
	Klant k2 = new Klant("Maarten Kossen", "Geen Idee", 10, "Ergens");
	Klant k3 = new Klant("Tim Lambo", "Weet ik veel?", 17, "Ergens Anders");
	Klant k4 = new Klant("Arno Becker", "Nergens?", 1, "Dakloos");

	Boeking b1 = new Boeking(v1, 1, false, k1);
	Boeking b2 = new Boeking(v2, 1, false, k2);
	v1.addBoeking(b1);
	v1.addBoeking(b2);
		 sdf = new SimpleDateFormat("dd-MM-yy");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of vertrekpuntEnBestemming method, of class BoekVluchtController.
     */
    @Test
    public void vertrekpuntEnBestemming() {
	System.out.println("\tvertrekpuntEnBestemming");
	System.out.print("Geldige data\t\t\t");
	Luchthaven vertrekpunt = lh1;
	Luchthaven bestemming = lh2;
	BoekVluchtController instance = new BoekVluchtController();
	TreeMap<String, Vlucht> expResult = new TreeMap<String, Vlucht>();
	expResult.put(sdf.format(v1.getVertrekTijd().getTime()), v1);
	//expResult.put(sdf.format(v2.getVertrekTijd().getTime()), v2);
	
	TreeMap<String, Vlucht> result = instance.vertrekpuntEnBestemming(vertrekpunt, bestemming);
	assertEquals(expResult, result);
	System.out.println("Succes!");
	System.out.print("Dezelfde data\t\t\t");
	 vertrekpunt = lh1;
	 bestemming = lh1;
	expResult = new TreeMap<String, Vlucht>();
	result = instance.vertrekpuntEnBestemming(vertrekpunt, bestemming);
	assertEquals(expResult, result);
	System.out.println("Succes! (fout correct afgevangen)");
	System.out.print("Ongeldige data\t\t\t");
	 vertrekpunt = lh1;
	 bestemming = null;
	expResult = new TreeMap<String, Vlucht>();
	result = instance.vertrekpuntEnBestemming(vertrekpunt, bestemming);
	assertEquals(expResult, result);
	System.out.println("Succes! (fout correct afgevangen)");
	
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }

    /**
     * Test of vlucht method, of class BoekVluchtController.
     */
    @Test
    public void vlucht() {
	System.out.println("\tvlucht");
	Vlucht vlucht = null;
	BoekVluchtController instance = new BoekVluchtController();
	instance.vlucht(vlucht);
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }

    /**
     * Test of klant method, of class BoekVluchtController.
     */
    @Test
    public void klant() {
	System.out.println("\tklant");
	BoekVluchtController instance = new BoekVluchtController();
	System.out.print("Correcte data\t\t\t");
	try {
	    instance.klant("Naam", "Straat", "1", "Plaats");
	    System.out.println("Succes!");
	    
	} catch (Exception e){
	    fail("Gefaald: "+e);
	    }
	System.out.print("Incorrecte data\t\t\t");
	try {
	    instance.klant("Naam", "Straat", "henk", "Plaats");
	    fail("Gefaald!");
	    
	} catch (Exception e){
	    System.out.println("Succes! (fout correct afgevangen: "+e+")");
	    }
	System.out.print("Geen data\t\t\t");
	try {
	    instance.klant("", "", "", "");
	    fail("Gefaald!");
	    
	} catch (Exception e){
	    System.out.println("Succes! (fout correct afgevangen: "+e+")");
	    }
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }

    /**
     * Test of plaats method, of class BoekVluchtController.
     */
    @Test
    public void plaats() {
	System.out.println("\tplaats");
	BoekVluchtController instance = new BoekVluchtController();
	System.out.print("Correcte data\t\t\t");
	try {
	    instance.plaats("15", true);
	    System.out.println("Succes!");
	    
	} catch (Exception e){
	    fail("Gefaald: "+e);
	    }
	System.out.print("Incorrecte data\t\t\t");
	try {
	    instance.plaats("kaas", true);
	    fail("Gefaald!");
	} catch (Exception e){
	    
	    System.out.println("Succes! (fout correct afgevangen: "+e+")");
	    }
	
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }

    /**
     * Test of ok method, of class BoekVluchtController.
     */
    @Test
    public void ok() {
	System.out.println("ok");
	
	BoekVluchtController instance = new BoekVluchtController();
	instance.klant("hax", "hax", "12", "hax");
	instance.plaats("32", false);
	instance.vlucht(v1);
	instance.ok();
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class BoekVluchtController.
     */
    @Test
    public void cancel() {
	System.out.println("cancel");
	BoekVluchtController instance = new BoekVluchtController();
	instance.cancel();
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }
}