
package domeinLaag;

// Imports
import java.util.HashSet;
import java.util.TreeMap;

/**
 * Een object van deze klasse representeert één luchtvaartmaatschappij.
 * De luchtvaartmaatschappij heeft een naam en een aantal vliegtuigen.
 * Normaliter bestaat er maar één object van deze klasse.
 */
public class LuchtvaartMaatschappij
{
	// Attributen
	private String naam;	// De naam van de luchtvaartmaatschappij
	
	// Relaties
	private HashSet<Vliegtuig> vliegtuigen = new HashSet<Vliegtuig>();	// De Vliegtuigen van de luchtvaartmaatschappij.

	// Constructors
	/**
	 * Constructor voor het aanmaken van een Luchtvaartmaatschappij.
	 * Wordt momenteel alleen in Main gebruikt om de boel te vullen.
	 * Er zijn geen Use Cases die objecten van deze klasse aanmaken of bewerken.
	 * @param nm	de naam van de luchtvaartmaatschappij
	 */
	public LuchtvaartMaatschappij (String nm)
	{
		this.naam = nm;
	}

	// Getters
	/**
	 * Deze methode geeft alle vliegtuigen van de luchtvaartmaatschappij.
	 * @return	een TreeMap van vliegtuignamen en Vliegtuigen
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
	 * Deze methode voegt een Vliegtuig toe aan de luchtvaartmaatschappij.
	 * @param vt	het toe te voegen Vliegtuig
	 */
	public void addVliegtuig (Vliegtuig vt)
	{
		vliegtuigen.add(vt);
	}
	
	// Removers
	/**
	 * Deze methode verwijdert een Vliegtuig van een luchtvaartmaatschappij.
	 * @param vt	het te verwijderen Vliegtuig
	 */
	public void removeVliegtuig (Vliegtuig vt)
	{
		vliegtuigen.remove(vt);
	}
}

