
package domeinLaag;

import java.util.*;

public class Luchthaven
{
	private String naam = "";
	private String code = "";
	private boolean werkPlaats = false;
	private Land land;
	private static HashSet<Luchthaven> alleLuchthavens = new HashSet<Luchthaven>();

	public static HashSet geefAlleLuchthavensAlsHashSet ()
	{
		return alleLuchthavens;
	}

	/**
	 * Constructor bedoelt om in main() test-objecten mee aan te maken.
	 * @param naam
	 * @param code
	 * @param werkplaats
	 */
	public Luchthaven (String naam, String code, boolean werkplaats, Land land)
	{
		this.naam = naam;
		this.code = code;
		this.werkPlaats = werkplaats;
		this.land = land;
		alleLuchthavens.add(this);
	}

	/**
	 *  Constructor bedoelt om in RegLuchthavenController te gebruiken.
	 *  De diverse attributen worden met zet-methoden naderhand gevuld.
	 */
	public Luchthaven ()
	{
	}

	/**
	Controleer of de naam uniek is binnen het land.
	Zo ja, leg naam vast.
	Zo nee, throw exception.
	@param naam de naam van de nieuwe luchthaven.
	@throws java.lang.IllegalArgumentException indien de naam al bestaat binnen het land.
	 */
	public void zetNaam (String nm) throws IllegalArgumentException
	{
		if (land.geefLuchthavens().get(nm.trim()) != null)
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
	 * @return java.lang.String
	 */
	public String geefNaam ()
	{
		return naam;
	}

	/**
	 * @param code
	 */
	public String geefCode ()
	{
		return this.code;
	}

	public void zetCode (String code)
	{
		this.code = code;
	}

	/**
	@param wp
	 */
	public void zetWerkPlaats (boolean wp)
	{
		werkPlaats = wp;
	}

	public boolean geefWerkPlaats ()
	{
		return werkPlaats;
	}

	public Land geefLand ()
	{
		return land;
	}

	/**
	@param land
	 */
	public void zetLand (Land land)
	{
		this.land = land;
	}

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
	
	/**
	 * @return java.util.TreeMap
	 */
	public static TreeMap<String, Luchthaven> geefAlle ()
	{
		TreeMap<String, Luchthaven> alleLh = new TreeMap<String, Luchthaven>();
		for (Iterator<Luchthaven> i = alleLuchthavens.iterator(); i.hasNext();)
		{
			Luchthaven lh = i.next();
			alleLh.put(lh.naam, lh);
		}
		return alleLh;
	}	
}
