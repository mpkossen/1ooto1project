
package domeinLaag;

// Imports
import java.util.HashSet;
import java.util.TreeMap;

public class LuchtvaartMaatschappij
{
	// Attributen
	private String naam;
	
	// Relaties
	private HashSet<Vliegtuig> vliegtuigen = new HashSet<Vliegtuig>();

	// Constructors
	/**
	 * @param naam
	 */
	public LuchtvaartMaatschappij (String naam)
	{
		this.naam = naam;
	}

	// Getters
	/**
	 * @return TreeMap met key = naam en value = een referentie naar het vliegtuig-object
	 */
	public TreeMap<String, Vliegtuig> getVliegtuigen ()
	{
		TreeMap<String, Vliegtuig> alleVliegtuigen = new TreeMap<String, Vliegtuig>();
		for (Vliegtuig vliegtuig : vliegtuigen)
		{
			String vliegtuigNaam = vliegtuig.getNaam();
			alleVliegtuigen.put(vliegtuigNaam, vliegtuig);
		}
		return alleVliegtuigen;
	}
	
	// Adders
	/**
	 * @param vt
	 */
	public void addVliegtuig (Vliegtuig vt)
	{
		vliegtuigen.add(vt);
	}
	
	// Removers
	/**
	 * @param vt
	 */
	public void removeVliegtuig (Vliegtuig vt)
	{
		vliegtuigen.remove(vt);
	}
}

