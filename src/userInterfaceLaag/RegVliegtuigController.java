
package userInterfaceLaag;

// Imports
import domeinLaag.Fabrikant;
import domeinLaag.LuchtvaartMaatschappij;
import domeinLaag.Vliegtuig;
import domeinLaag.VliegtuigType;

import java.util.Calendar;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

/**
 * Deze Controller Klasse handelt het registreren van een nieuw Vliegtuig af.
 * Naast het starten van de bijbehorende GUI beschikt de klasse ook
 * over een aantal methoden die aangeroepen worden door ActionListeners.
 */
public class RegVliegtuigController
{
	private LuchtvaartMaatschappij lvm;
	private VliegtuigType vtt;
	private Vliegtuig vt;
	private Fabrikant fbr;
	private RegVliegtuigFrame rvf;
	private TreeMap<String, Fabrikant> fabrMap;
	private TreeMap<String, VliegtuigType> vliegtuigTypen;

	// Constructors
	/**
	 * Deze constructor geeft een gesorteerde lijst (Set) van alle Fabrikanten
	 * en maakt daar een RegVliegtuigFrame mee aan.
	 * @param lvm	de LuchtvaartMaatschappij waar het Vliegtuig toe gaat behoren.
	 */
	public RegVliegtuigController (LuchtvaartMaatschappij lvm)
	{
		this.lvm = lvm;
		vt = new Vliegtuig(lvm);
		//Vraag alle fabrikanten op en maak een (gesorteerde) Set met hun namen voor het frame.
		fabrMap = Fabrikant.getAlleFabrikanten();
		Set<String> fabrSet = fabrMap.keySet();
		rvf = new RegVliegtuigFrame(this, fabrSet);
		rvf.setVisible(true);
	}

	// Overige Methodes

	/* FM: TODO deze methode maakt gebruik van een Vector waar een HashSet of
	 * TreeMap beter is. Dat moet dus aangepast worden.*/
	
	/**
	 * Deze methode zet de Fabrikant van het nieuwe Vliegtuig en geeft de door
	 * die Fabrikant gemaakte VliegtuigTypen terug. Deze methode wordt
	 * aangeroepen door de ActionListener van het fabrikant veld.
	 * @param fbrn	de Fabrikant van het Vliegtuig
	 * @return		een Vector met alle vliegtuigtypen van die Fabrikant
	 */
	public Vector<String> fabrikant (String fbrn)
	{
		Vector<String> v = new Vector<String>();
		//Zoek (de link naar) het fabrikant-object, op basis van de naam.
		this.fbr = fabrMap.get(fbrn);
		String cp = this.fbr.getContactpersoon();
		v.add(cp);
		//Vraag alle vliegtuigtypen op en maak een (gesorteerde) Set met hun namen voor het frame.
		vliegtuigTypen = fbr.getVliegtuigTypen();
		Set<String> vttSetc = vliegtuigTypen.keySet();
		for (String s : vttSetc)
		{
			v.add(s);
		}
		return v;
	}

	/**
	 * Deze methode zet het vliegtuigtype van het nieuwe vliegtuig en
	 * geeft de capaciteit terug. Wordt aangeroepen door de ActionListener van
	 * het VliegtuigType veld.
	 * @param	vttcd de code van het gekozen vliegtuigtype
	 * @return	één-dimensionale array met twee elementen. De eerste voor het
	 * aantal rokers plaatsen, de andere voor het aantal niet-rokers plaatsen.
	 */
	public int[] type (String vttcd)
	{
		//Zoek (de link naar) het vliegtuigtype-object, op basis van de naam.
		vtt = vliegtuigTypen.get(vttcd);
		vt.setVliegtuigType(vtt);
		int[] cap = this.vtt.getCapaciteit();
		return cap;
	}

	/**
	 * Deze methode zet de naam van het nieuwe vliegtuig en wordt aangeroepen
	 * door de ActionListener van het naam veld.
	 * @param naam	is de naam van het nieuwe Vliegtuig
	 * @throws java.lang.IllegalArgumentException	als de naam ongeldig is of
	 * al bestaat
	 */
	public void naam (String naam) throws IllegalArgumentException
	{
		vt.setNaam(naam);
	}

	/**
	 * Deze methode zet de datum van ingebruikname van het nieuwe vliegtuig en
	 * wordt aangeroepen door de ActionListener van het datum veld.
	 * @param inGebruik	de datum van ingebruikname
	 * @throws java.lang.IllegalArgumentException	als de datum ongeldig is
	 */
	public void inGebruik (Calendar inGebruik) throws IllegalArgumentException
	{
		vt.setInGebruik(inGebruik);
	}

	/**
	 * Deze methode slaat alle eerder ingevoerde gegeven op. Indien een of meer
	 * van de gegevens niet ok zijn dan wordt er in de domeinlaag een Exception
	 * gegenereerd die doorgestuurd wordt. Wordt aangeroepen door de OK-button.
	 * @throws java.lang.IllegalStateException	als een of meer van de gegevens
	 * onjuist zijn
	 */
	public void ok () throws IllegalStateException
	{
		vt.bewaar();
		rvf.dispose();
	}

	/**
	 * Deze methode sluit de GUI.
	 */	
	public void cancel ()
	{
		rvf.dispose();
	}
}
