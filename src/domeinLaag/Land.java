
package domeinLaag;

//Imports
import java.util.HashSet;
import java.util.TreeMap;

/**
 * Een object van deze klasse representeert één land en houdt bij welke luchthavens zich er bevinden.
 * Ook wordt bijgehouden hoe het land heet en wat de landcode is.
 */
public class Land
{
	// Attributen
	private String naam;	// De naam van het land.
	private int code;		// De landcode van het land.
	
	// Relaties
	private HashSet<Luchthaven> luchthavens;	// Een HashSet van alle luchthavens in het land.
	private static HashSet<Land> alleLanden = new HashSet<Land>();	// Een static HashSet van alle landen.

	// Constructors
	/**
	 * Constructor voor het aanmaken van een Land. Wordt momenteel alleen in Main gebruikt om de boel te vullen.
	 * Er zijn geen Use Cases die objecten van deze klasse aanmaken of bewerken.
	 * @param nm is de naam van het land.
	 * @param cd is de landcode van het land.
	 */
	public Land (String nm, int cd)
	{
		naam = nm;
		code = cd;
		luchthavens = new HashSet<Luchthaven>();
		alleLanden.add(this);
	}

	// Setters
	/**
	 * Deze methode zet de naam van het land.
	 * @param nm is de naam van het land.
	 */
	public void setNaam (String nm)
	{
		this.naam = nm;
	}
	
	/**
	 * Deze methode zet de landcode van het land.
	 * @param cd is de landcode van het land.
	 */
	public void setCode (int cd)
	{
		this.code = cd;
	}
	
	// Setters
	/**
	 * Deze methode geeft de naam van het land.
	 * @return is de naam van het land.
	 */
	public String getNaam ()
	{
		return naam;
	}

	/**
	 * Deze methode geeft de landcode van het land.
	 * @return is de landcode van het land.
	 */
	public int getCode ()
	{
		return code;
	}

	/**
	 * Deze methode geeft alle luchthavens in het land.
	 * @return is een TreeMap van de luchthavennamen en de luchthavens van het land.
	 */
	public TreeMap<String, Luchthaven> getLuchthavens ()
	{
		TreeMap<String, Luchthaven> luchthavenMap = new TreeMap<String, Luchthaven>();
		for (Luchthaven l : luchthavens)
		{
			String nm = l.getNaam();
			luchthavenMap.put(nm, l);
		}
		return luchthavenMap;
	}	
	
	/**
	 * Deze static methode geeft alle luchthavens van alle landen.
	 * @return is een TreeMap van alle luchthavennamen en alle luchthavens.
	 */
	public static TreeMap<String, Land> getAlleLanden ()
	{
		TreeMap<String, Land> landMap = new TreeMap<String, Land>();
		for (Land l : alleLanden)
		{
			String nm = l.getNaam();
			landMap.put(nm, l);
		}
		return landMap;
	}

	/**
	 * Deze methode voegt een luchthaven toe aan een land.
	 * @param lhvn is de luchthaven die toegevoegd moet worden aan het land.
	 */
	public void addLuchthaven (Luchthaven lhvn)
	{
		luchthavens.add(lhvn);
	}
	
	/**
	 * Deze methode verwijdert een luchthaven van een land.
	 * @param lhvn is de luchthaven die verwijdert moet worden.
	 */
	public void removeLuchthaven (Luchthaven lhvn)
	{
		luchthavens.remove(lhvn);
	}
}

