
package domeinLaag;

// Imports
import java.util.TreeMap;
import java.util.HashSet;

public class LuchtvaartMaatschappij
{
	// Attributen
	private String naam;
	
	// Relaties
	private HashSet<Vliegtuig> vliegtuigen = new HashSet<Vliegtuig>();

	/**
	 * @param naam
	 */
	public LuchtvaartMaatschappij (String naam)
	{
		this.naam = naam;
	}

	/**
	 * @param vt
	 */
	public void addVliegtuig (Vliegtuig vt)
	{
		vliegtuigen.add(vt);
	}
	
	/**
	 * 
	 * @param vt
	 */
	public void removeVliegtuig (Vliegtuig vt)
	{
		vliegtuigen.remove(vt);
	}

	/**
	 * @return TreeMap met key = naam en value = een referentie naar het vliegtuig-object
	 */
	public TreeMap<String, Vliegtuig> getVliegtuigen ()
	{
		TreeMap<String, Vliegtuig> alleVt = new TreeMap<String, Vliegtuig>();
		for (Vliegtuig vt : vliegtuigen)
		{
			String naam = vt.getNaam();
			alleVt.put(naam, vt);
		}
		return alleVt;
	}
}

