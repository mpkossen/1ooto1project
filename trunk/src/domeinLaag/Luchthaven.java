
package domeinLaag;

// Imports
import java.util.*;

public class Luchthaven
{
	// Attributes
	private String naam = "";
	private String code = "";
	private boolean werkPlaats = false;
	
	// Relaties
	private Land land;
	private static HashSet<Luchthaven> alleLuchthavens = new HashSet<Luchthaven>();

	// Constructors
	/**
	 * Constructor bedoelt om in main() test-objecten mee aan te maken.
	 * @param naam
	 * @param code
	 * @param werkplaats
	 */
	public Luchthaven (String nm, String cd, boolean wp, Land ln)
	{
		this.naam = nm;
		this.code = cd;
		this.werkPlaats = wp;
		this.land = ln;
		alleLuchthavens.add(this);
	}

	/**
	 *  Constructor bedoelt om in RegLuchthavenController te gebruiken.
	 *  De diverse attributen worden met zet-methoden naderhand gevuld.
	 */
	public Luchthaven ()
	{
	}	
	
	// Setters
	/**
	Controleer of de naam uniek is binnen het land.
	Zo ja, leg naam vast.
	Zo nee, throw exception.
	@param naam de naam van de nieuwe luchthaven.
	@throws java.lang.IllegalArgumentException indien de naam al bestaat binnen het land.
	 */
	public void setNaam (String nm) throws IllegalArgumentException
	{
		if (land.getLuchthavens().get(nm.trim()) != null)
		{
			throw new IllegalArgumentException("Naam bestaat al!");
		}
		else if (nm.trim().length() == 0)
		{
			throw new IllegalArgumentException("Naam heeft geen geldige waarde!");
		}
		else
		{
			this.naam = nm.trim();
		}
	}

	/**
	 * @param code
	 */	
	public void setCode (String code)
	{
		this.code = code;
	}

	/**
	 * @param land
	 */
	public void setLand (Land land)
	{
		this.land = land;
	}	
	
	/**
	 * @param wp
	 */
	public void setWerkPlaats (boolean wp)
	{
		werkPlaats = wp;
	}	
	
	// Getters
	/**
	 * @return java.lang.String
	 */
	public String getNaam ()
	{
		return naam;
	}

	/**
	 * @param code
	 */
	public String getCode ()
	{
		return this.code;
	}

	/**
	 * @return boolean
	 */
	public boolean getWerkPlaats ()
	{
		return werkPlaats;
	}

	/**
	 * 
	 * @return Land
	 */
	public Land getLand ()
	{
		return land;
	}
	
	/**
	 * @return java.util.TreeMap
	 */
	public static TreeMap<String, Luchthaven> getAlleLuchthavens ()
	{
		TreeMap<String, Luchthaven> alleLh = new TreeMap<String, Luchthaven>();
		for (Iterator<Luchthaven> i = alleLuchthavens.iterator(); i.hasNext();)
		{
			Luchthaven lh = i.next();
			alleLh.put(lh.naam, lh);
		}
		return alleLh;
	}		

	// Overige Methodes
	/**
	Controleer of alle attributen een waarde hebben (alles verplicht).
	Zo ja: roep Land.addLuchthaven().
	Zo nee: IllegalStateException.
	Sluit functie af.
	@throws java.lang.IllegalStateException indien nog niet alle attributen een waarde hebben.
	 */
	public void bewaar () throws LuchthavenException
	{
		if (land == null)
		{
			throw new LuchthavenException("Land niet ingevuld!");
		}
		else if (naam.isEmpty())
		{
			throw new LuchthavenException("Naam niet ingevuld!");
		}
		else if (code.isEmpty())
		{
			throw new LuchthavenException("Code niet ingevuld!");
		}
		else
		{
			alleLuchthavens.add(this);
			land.addLuchthaven(this);
		}
	}
}
