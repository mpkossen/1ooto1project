
package domeinLaag;

// Imports
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.HashSet;

public class Vlucht
{
	//Attributen
	private int vluchtNummer;
	private Calendar vertrekTijd;
	private Calendar aankomstTijd;
	private Calendar duur;

	// Relaties
	private Vliegtuig vliegtuig;
	private Luchthaven bestemming;
	private Luchthaven vertrekpunt;
	private HashSet<Boeking> boekingen;
	private static HashSet<Vlucht> alleVluchten = new HashSet<Vlucht>();

	//Constructors
	/**
	 * Constructor bedoelt om test-objecten mee aan te maken.
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
	 * Constructor bedoeld om in RegVluchtController te gebruiken.
	 * de overige attributen worden dat met de zetmethoden gevuld.
	 * @param vlt
	 * @param vtp
	 */
	public Vlucht (Vliegtuig vlt, Luchthaven vtp)
	{
		this.vliegtuig = vlt;
		this.vertrekpunt = vtp;
		this.boekingen = new HashSet<Boeking>();
	}

	// Setters
	/**
	 * Controleer dat de vertrektijd niet overlapt met een andere vlucht van het toestel.
	 * @param tijd
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
	 * Controleer dat aankomstTijd > vertrekTijd.
	 * @param tijd
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
			throw new VluchtException("aankomsttijd voor vertrektijd");
		}
	}
	
	public void setVliegtuig (Vliegtuig vlt)
	{
		this.vliegtuig = vlt;
	}

	/**
	 * Controleer dat bestemming <> vertrekpunt.
	 * @param bestemming
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
	public Calendar getVertrekTijd ()
	{
		return vertrekTijd;
	}

	public Calendar getAankomstTijd ()
	{
		return aankomstTijd;
	}

	public Vliegtuig getVliegtuig ()
	{
		return vliegtuig;
	}
	
	public Luchthaven getVertrekpunt ()
	{
		return vertrekpunt;
	}

	public Luchthaven getBestemming ()
	{
		return bestemming;
	}

	public HashSet<Boeking> getAlleBoekingen ()
	{
		return boekingen;
	}

	/**
	 * @return java.util.HashSet
	 * Ik weet niet of dit zo klopt.
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
	public void addBoeking (Boeking bk)
	{
		boekingen.add(bk);
	}

	// Removers
	public void removeBoeking (Boeking bk)
	{
		boekingen.remove(bk);
	}

	// Overige Methodes
	/**
	 * Controleer of alle gegevens gezet zijn. Zo ja, bewaar de vluchtgegevens.
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

	/** Controleert of het vliegtuig op het meegegeven tijdstip al een vlucht heeft.
	 * @return true, als vliegtuig bezet. Anders false.
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
