
package domeinLaag;

// Imports
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * Een object van deze klasse representeert één luchthaven.
 * Een Luchthaven heeft een naam en een code (afkorting).
 * Eventueel heeft de luchthaven ook een werkplaats.
 * Tot slot ligt de luchthaven in een land.
 */
public class Luchthaven
{
	// Attributes
	private String naam = "";			// De naam van de luchthaven.
	private String code = "";			// De code (afkorting) van de luchthaven.
	private boolean werkPlaats = false;	// Of de luchthaven een werkplaats heeft of niet.
	
	// Relaties
	private Land land;	// In welk land de luchthaven ligt.
	private static HashSet<Luchthaven> alleLuchthavens = new HashSet<Luchthaven>();	// Een statische HashSet van alle luchthavens.
	
	// Constructors
	/**
	 * Constructor voor het aanmaken van een Luchthaven. Wordt gebruikt door Main om de boel even te vullen.
	 * Dit zodat er ook wat te testen valt.
	 * @param nm	de naam van de luchthaven
	 * @param cd	de code (afkorting) van de luchthaven
	 * @param wp	true als de luchthaven een werkplaats heeft, anders false
	 * @param ln	het land waar de luchthaven in ligt
	 */
	public Luchthaven (String nm, String cd, boolean wp, Land ln)
	{
		this.naam = nm;
		this.code = cd;
		this.werkPlaats = wp;
		this.land = ln;
		alleLuchthavens.add(this);
		land.addLuchthaven(this);
	}

	/**
	 * Constructor voor het aanmaken van een Luchthaven. Wordt gebruikt om in
	 * de RegLuchthavenController. De diverse attributen worden met zet-methoden naderhand gevuld.
	 */
	public Luchthaven ()
	{
	}	
	
	// Setters
	/**
	 * Deze methode zet de naam van het Luchthaven.
	 * @param nm	de naam van de Luchthaven
	 * @throws java.lang.IllegalArgumentException als de naam al bestaat in dat land
	 * of als de naam geen geldige waarde heeft
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
	 * Deze methode zet de code (afkorting) van de Luchthaven.
	 * @param code	de code (afkorting) van de Luchthaven
	 */
	public void setCode (String code)
	{
		this.code = code;
	}

	/**
	 * Deze methode zet het land waar de Luchthaven in ligt.
	 * Hiertoe moet ook een aanpassing gedaan worden in het land.
	 * Eerst moet de luchthaven namelijk uit het oude land verwijderd worden.
	 * Het toevoegen aan het nieuwe land (en het verwijderen uit het oude) hoeft
	 * alleen te gebeuren als de luchthaven al aan alleLuchthavens	toegevoegd.
	 * Zo niet, dan	deze luchthaven namelijk nog nooit bewaard.
	 * @param land	het land waar de Luchthaven in ligt
	 */
	public void setLand (Land land)
	{
		if (alleLuchthavens.contains(this))		// Indien true	het land al eens bewaard.
		{
			this.land.removeLuchthaven(this);	// Eerst de luchthaven verwijderen uit het oude land.
		}
		this.land = land;						// Vervolgens het land veranderen.
		if (alleLuchthavens.contains(this))		// Indien true	het land al eens bewaard.
		{
			this.land.addLuchthaven(this);		// Tot slot de luchthaven toevoegen aan het nieuwe land.
		}
	}	
	
	/**
	 * Deze methode zet of de Luchthaven een werkplaats heeft of niet.
	 * @param wp	true als de Luchthaven een werkplaats heeft en anders false
	 */
	public void setWerkPlaats (boolean wp)
	{
		werkPlaats = wp;
	}	
	
	// Getters
	/**
	 * Deze methode geeft de naam van de Luchthaven.
	 * @return	de naam van de Luchthaven
	 */
	public String getNaam ()
	{
		return naam;
	}

	/**
	 * Deze methode geeft de code van de Luchthaven.
	 * @return	de code (afkorting) van de Luchthaven
	 */
	public String getCode ()
	{
		return this.code;
	}

	/**
	 * Deze methode geeft true als er een werkplaats is en anders false.
	 * @return	true als er een werkplaats is op de Luchthaven
	 */
	public boolean getWerkPlaats ()
	{
		return werkPlaats;
	}

	/**
	 * Deze methode geeft het Land waar de Luchthaven ligt.
	 * @return	het Land waar de Luchthaven ligt
	 */
	public Land getLand ()
	{
		return land;
	}
	
	/**
	 * Deze statische methode geeft alle luchthavennamen en Luchthavens terug.
	 * @return	een TreeMap van luchthavennamen en Luchthavens
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
	 * Deze methode bewaart deze Luchthaven door hem toe te voegen aan de Luchthavens van het land en alleLuchthavens.
	 * @throws domeinLaag.LuchthavenException	als nog niet alle attributen een waarde hebben
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
