
package domeinLaag;

// Imports
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Een object van deze klasse representeert één vlucht van één vliegtuig.
 * Een vlucht heeft een vertrekpunt en een bestemming. Ook heeft het een
 * vluchtnummer en momenten van vertrek. Lokaal wordt ook de verwachte
 * vluchtduur bijgehouden en tot slot worden alle boekingen bijgehouden.
 */
public class Vlucht
{
	//Attributen
	private int vluchtNummer;		// Het vluchtnummer van de vlucht.
	private Calendar vertrekTijd;	// Datum en Tijd van gepland vertrek.
	private Calendar aankomstTijd;	// Datum en Tijd van geplande aankomst.
	private Calendar duur;			// Geplande vluchtduur.

	// Relaties
	private Vliegtuig vliegtuig;		// Vliegtuig voor deze vlucht.
	private Luchthaven vertrekpunt;		// Luchthaven van vertrek.
	private Luchthaven bestemming;		// Luchthaven van bestemming.
	private HashSet<Boeking> boekingen;	// Boekingen voor deze vlucht.
	private static HashSet<Vlucht> alleVluchten = new HashSet<Vlucht>();	// Alle vluchten.

	//Constructors
	/**
	 * Constructor voor het aanmaken van een Vlucht. Wordt momenteel alleen in Main gebruikt om de boel te vullen.
	 * @param vlt vliegtuig voor deze vlucht
	 * @param vtp luchthaven van vertrek
	 * @param bst luchthaven van bestemming
	 * @param vertrek datum en tijd van vertrek
	 * @param aankomst datum en tijd van aankomst
	 */
	public Vlucht (Vliegtuig vlt, Luchthaven vtp, Luchthaven bst, Calendar vertrek, Calendar aankomst)
	{
		this.vliegtuig = vlt;
		this.vertrekpunt = vtp;
		this.bestemming = bst;
		this.vertrekTijd = (Calendar) vertrek.clone();
		this.aankomstTijd = (Calendar) aankomst.clone();
		this.boekingen = new HashSet<Boeking>();
		alleVluchten.add(this);
	}

	/**
	 * Constructor voor het aanmaken van een Vlucht. Alle overige attributen
	 * en relaties worden later door de RegVluchtController gezet middels
	 * de setters.
	 * @param vlt	vliegtuig voor deze vlucht
	 * @param vtp	luchthaven van vertrek
	 */
	public Vlucht (Vliegtuig vlt, Luchthaven vtp)
	{
		this.vliegtuig = vlt;
		this.vertrekpunt = vtp;
		this.boekingen = new HashSet<Boeking>();
	}

	// Setters
	/**
	 * Deze methode zet de vertrektijd. Dit na controle of het vliegtuig wel
	 * beschikbaar is en of de vertrektijd wel geldig is.
	 * @param tijd	de geplande tijd van vertrek
	 * @throws domeinLaag.VluchtException	als het vliegtuig reeds bezet is of de vertrektijd ongeldig is
	 */
	public void setVertrekTijd (Calendar tijd) throws VluchtException
	{
		tijd.setLenient(false);
		// Ter controle of het een juiste datum is. Gebeurt niet bij het zetten, maar bij het getten.
		try
		{
			Date datum = tijd.getTime();
		}
		catch (IllegalArgumentException e)
		{
			throw new VluchtException("Geen geldige datum!");
		}
		if (!Vlucht.isBezet(vliegtuig, tijd))
		{
			vertrekTijd = (Calendar) tijd.clone();
		}
		else
		{
			throw new VluchtException("vliegtuig reeds bezet op " + tijd.getTime());
		}
	}
	
	/**
	 * Deze methode zet de aankomsttijd. Dit na controle de aankomsttijd wel
	 * geldig is en wel later is dan de vertrektijd.
	 * @param tijd	de geplande tijd van aankomst
	 * @throws domeinLaag.VluchtException	als de aankomsttijd eerder is dan het vertrek of de vertrektijd ongeldig is
	 */
	public void setAankomstTijd (Calendar tijd) throws VluchtException
	{
		tijd.setLenient(false);
		// Ter controle of het een juiste datum is. Gebeurt niet bij het zetten, maar bij het getten.
		try
		{
			Date datum = tijd.getTime();
		}
		catch (IllegalArgumentException e)
		{
			throw new VluchtException("Geen geldige datum!");
		}
		if (tijd.after(vertrekTijd))
		{
			aankomstTijd = (Calendar) tijd.clone();
		}
		else
		{
			throw new VluchtException("Aankomsttijd voor Vertrektijd");
		}
	}
	
	/**
	 * Deze methode zet het vliegtuig voor deze vlucht.
	 * @param vlt	het Vliegtuig dat gebruikt wordt voor deze Vlucht
	 */
	public void setVliegtuig (Vliegtuig vlt)
	{
		this.vliegtuig = vlt;
	}

	/**
	 * Deze methode zet de luchthaven van bestemming.
	 * @param bestemming	de Luchthaven van bestemming voor de Vlucht
	 * @throws domeinLaag.VluchtException	als vertrekpunt en bestemming gelijk zijn
	 */
	public void setBestemming (Luchthaven bestemming) throws VluchtException
	{
		if (bestemming != vertrekpunt)
		{
			this.bestemming = bestemming;
		}
		else
		{
			throw new VluchtException("Vertrekpunt en bestemming zijn gelijk");
		}
	}	
	
	// Getters
	/**
	 * Deze methode geeft de vertrektijd.
	 * @return	de datum en tijd van vertrek
	 */
	public Calendar getVertrekTijd ()
	{
		return vertrekTijd;
	}

	/**
	 * Deze methode geeft de aankomsttijd.
	 * @return	de datum en tijd van aankomst
	 */
	public Calendar getAankomstTijd ()
	{
		return aankomstTijd;
	}

	/**
	 * Deze methode geeft het vliegtuig voor deze vlucht.
	 * @return	het Vliegtuig voor deze Vlucht
	 */
	public Vliegtuig getVliegtuig ()
	{
		return vliegtuig;
	}
	
	/**
	 * Deze methode geeft het vertrekpunt van deze vlucht.
	 * @return	de Luchthaven van vertrek
	 */
	public Luchthaven getVertrekpunt ()
	{
		return vertrekpunt;
	}

	/**
	 * Deze methode geeft de bestemming van deze vlucht.
	 * @return	de Luchthaven van bestemming
	 */
	public Luchthaven getBestemming ()
	{
		return bestemming;
	}

	/**
	 * Deze methode geeft alle boekingen voor deze vlucht.
	 * @return	een HashSet van alle boekingen voor deze vlucht.
	 */
	public HashSet<Boeking> getAlleBoekingen ()
	{
		return boekingen;
	}

	/**
	 * Deze statische methode geeft alle vluchten.
	 * @return	een HashSet van alle Vluchten
	 */
	public static HashSet<Vlucht> getAlleVluchten ()
	{
		HashSet<Vlucht> alleV = new HashSet<Vlucht>();
		for (Iterator<Vlucht> i = alleVluchten.iterator(); i.hasNext();)
		{
			Vlucht vl = i.next();
			alleV.add(vl);
		}
		return alleV;
	}	
	
	// Adders
	/**
	 * Deze methode voegt een boeking toe aan de vlucht.
	 * @param bk	de Boeking om toe te voegen aan de Vlucht
	 */
	public void addBoeking (Boeking bk)
	{
		boekingen.add(bk);
	}

	// Removers
	/**
	 * Deze methode verwijdert een boeking van de vlucht.
	 * @param bk	de Boeking om te verwijderen van de Vlucht
	 */
	public void removeBoeking (Boeking bk)
	{
		boekingen.remove(bk);
	}

	// Overige Methodes
	/**
	 * Deze methode bewaart alle gegevens mits de gegevens geldig zijn.
	 * Dit bewaren wordt gedaan door deze Vlucht toe te voegen aan alleVluchten.
	 * @throws domeinLaag.VluchtException	als de plaats of tijd van vertrek of aankomst ongeldig is
	 */
	public void bewaar () throws VluchtException
	{
		if (bestemming == null)
		{
			throw new VluchtException("geen geldige bestemming.");
		}
		else if (vertrekpunt == null)
		{
			throw new VluchtException("geen geldig vertrekpunt.");
		}
		else if (aankomstTijd == null)
		{
			throw new VluchtException("geen geldige aankomsttijd.");
		}
		else if (vertrekTijd == null)
		{
			throw new VluchtException("geen geldige vertrektijd.");
		}
		else
		{
			alleVluchten.add(this);
		}
	}

	/**
	 * Deze methode geeft alle vluchten voor de gegeven combinatie van vertrekpunt
	 * en bestemming.
	 * @param vtk	de Luchthaven van vertrek
	 * @param bst	de Luchthaven van bestemming
	 * @return		een HashSet van alle vluchten voor deze combinatie
	 */
	public static HashSet<Vlucht> vertrekpuntEnBestemming (Luchthaven vtk, Luchthaven bst)
	{
		HashSet<Vlucht> vluchtenPerLuchthavenCombi = new HashSet();

		int i = 0;
		for (Vlucht vl : alleVluchten)
		{
			i++;
			if (vl.vertrekpunt.equals(vtk))
			{
				if (vl.bestemming.equals(bst))
				{
					vluchtenPerLuchthavenCombi.add(vl);
				}
			}
		}
		return vluchtenPerLuchthavenCombi;
	}

	/**
	 * Deze methode controlleert of een vliegtuig niet al bezet is voor een andere vlucht.
	 * @param vliegtuig	het vliegtuig wat mogelijk al bezet is
	 * @param d			de datum en tijd waartegen gecontroleerd moet worden
	 * @return			true als bezet, false als beschikbaar
	 */
	private static boolean isBezet (Vliegtuig vliegtuig, Calendar d)
	{
		boolean b = false;
		for (Vlucht v : alleVluchten)
		{
			if (v.vliegtuig.equals(vliegtuig))
			{
				if ((d.getTimeInMillis() / 1000 >= v.getVertrekTijd().getTimeInMillis() / 1000) &&
					(d.getTimeInMillis() / 1000 <= v.getAankomstTijd().getTimeInMillis() / 1000))
				{
					b = true;
				}
			}
		}
		return b;
	}
}
