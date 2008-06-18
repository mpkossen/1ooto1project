
package domeinLaag;

// Imports
import java.util.TreeMap;
import java.util.HashSet;

/**
 * Een object van deze klasse representeert één fabrikant en houdt bij welke vliegtuigtypen deze maakt.
 * Ook wordt begehouden hoe de fabrikant heet en wie de aangewezen contactpersoon is.
 */
public class Fabrikant
{
	// Attributen
	private String naam;			// Naam van de fabrikant.
	private String contactPersoon;	// Naam van de contactpersoon bij deze fabrikant voor de luchtvaartmaatschappij.

	// Relaties
	private HashSet<VliegtuigType> vliegtuigTypen;	// Vliegtuigtypen gefabriceert door deze fabrikant.
	private static HashSet<Fabrikant> alleFabrikanten = new HashSet<Fabrikant>();	// Statische relatie naar alle fabrikanten. 

	// Constructors
	/**
	 * Constructor voor het aanmaken van een Fabrikant. Wordt momenteel alleen in Main gebruikt om de boel te vullen.
	 * Er zijn geen Use Cases die objecten van deze klasse aanmaken of bewerken.
	 * @param nm is de naam van de fabrikant.
	 * @param cp is de naam van de contactpersoon.
	 */
	public Fabrikant (String nm, String cp)
	{
		this.naam = nm;
		this.contactPersoon = cp;
		Fabrikant.alleFabrikanten.add(this);
		vliegtuigTypen = new HashSet<VliegtuigType>();
	}

	// Setters
	/**
	 * Deze methode zet de naam van de fabrikant.
	 * @param nm is de naam van de fabrikant.
	 */
	public void setNaam (String nm)
	{
		this.naam = nm;
	}
	
	/**
	 * Deze methode zet de naam van de contactpersoon.
	 * @param cp is de naam van de contactpersoon.
	 */
	public void setContactPersoon (String cp)
	{
		this.contactPersoon = cp;
	}
	
	// Getters
	/**
	 * Deze methode geeft de naam van de fabrikant.
	 * @return is de naam van de fabrikant.
	 */
	public String getNaam ()
	{
		return naam;
	}

	/**
	 * Deze methode geeft de naam van de contactpersoon.
	 * @return is de naam van de contactpersoon.
	 */
	public String getContactpersoon ()
	{
		return contactPersoon;
	}

	/**
	 * Deze methode geeft een TreeMap met alle vliegtuigtypen die deze fabrikant levert.
	 * @return is een TreeMap van de naam van het vliegtuigtype en het vliegtuigtype-object.
	 */
	public TreeMap<String, VliegtuigType> getVliegtuigTypen ()
	{
		TreeMap<String, VliegtuigType> alleVliegtuigTypen = new TreeMap<String, VliegtuigType>();
		for (VliegtuigType vliegtuigType : vliegtuigTypen)
		{
			String code = vliegtuigType.getCode();
			alleVliegtuigTypen.put(code, vliegtuigType);
		}
		return alleVliegtuigTypen;
	}

	/**
	 * Deze statische methode geeft een TreeMap met alle fabrikanten.
	 * @return is een TreeMap van de naam van de fabrikant en het fabrikant-object.
	 */
	public static TreeMap<String, Fabrikant> getAlleFabrikanten ()
	{
		TreeMap<String, Fabrikant> fabrikanten = new TreeMap<String, Fabrikant>();
		for (Fabrikant fabrikant : alleFabrikanten)
		{
			String naam = fabrikant.naam;
			fabrikanten.put(naam, fabrikant);
		}
		return fabrikanten;
	}	
	
	// Creators
	/**
	 * Deze methode creëert een nieuw vliegtuigtype en voegt het toe aan deze fabrikant.
	 * @param code is de code waarmee dit type toestel aangeduid wordt.
	 * @param capR is de roken-capaciteit van het vliegtuigtype.
	 * @param capNR is de niet-roken-capaciteit van het vliegtuigtype.
	 * @return is het aangemaakte vliegtuigtype-object.
	 */
	public VliegtuigType createVliegtuigType (String code, int capR, int capNR)
	{
		VliegtuigType vtt = new VliegtuigType(this, code, capR, capNR);
		vliegtuigTypen.add(vtt);
		return vtt;
	}
}
