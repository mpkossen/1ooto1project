package domeinLaag;

import java.util.*;

public class Vlucht
{
    private static HashSet<Vlucht> alleVluchten = new HashSet<Vlucht>();
    private int vluchtNummer;
    private Vliegtuig vliegtuig;
    private Luchthaven bestemming;
    private Luchthaven vertrekpunt;
    private Calendar vertrekTijd;
    private Calendar aankomstTijd;
    private Calendar duur;
    private HashSet<Boeking> boekingen;

	//Constructors
    /**
     * Constructor bedoeld om in RegVluchtController te gebruiken.
     * de overige attributen worden dat met de zetmethoden gevuld.
     * @param vt
     * @param vertrekp
     */
    public Vlucht(Vliegtuig vt, Luchthaven vertrekp)
    {
        this.vliegtuig = vt;
        this.vertrekpunt = vertrekp;
		this.boekingen = new HashSet<Boeking>();
    }

    /**
     * Constructor bedoelt om test-objecten mee aan te maken.
     */
    public Vlucht(Vliegtuig vt, Luchthaven vertrekp, Luchthaven best, Calendar vertrek, Calendar aankomst)
    {
        this.vliegtuig = vt;
        this.vertrekpunt = vertrekp;
        this.bestemming = best;
        this.vertrekTijd = (Calendar) vertrek.clone();
        this.aankomstTijd = (Calendar) aankomst.clone();
		this.boekingen = new HashSet<Boeking>();
        alleVluchten.add(this);
    }	
	
    /** Controleert of het vliegtuig op het meegegeven tijdstip al een vlucht heeft.
     * @return true, als vliegtuig bezet. Anders false.
     */
    private static boolean isBezet(Vliegtuig vliegtuig, Calendar d)
    {
        boolean b = false;
        for (Vlucht v : alleVluchten)
        {
            if (v.vliegtuig.equals(vliegtuig))
            {
                if ((d.getTimeInMillis()/1000 >= v.geefVertrekTijd().getTimeInMillis()/1000)	&&
					(d.getTimeInMillis()/1000 <= v.getAankomstTijd().getTimeInMillis()/1000)
					)
                {
                    b = true;
                }
            }
        }
        return b;
    }

    /**
     * Controleer dat bestemming <> vertrekpunt.
     * @param bestemming
     */
    public void zetBestemming(Luchthaven bestemming) throws VluchtException
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

    public Luchthaven geefBestemming()
    {
        return bestemming;
    }

    /**
     * Controleer dat de vertrektijd niet overlapt met een andere vlucht van het toestel.
     * @param tijd
     */
    public void zetVertrekTijd(Calendar tijd) throws VluchtException
    {
        Calendar vTijd = tijd;
        vTijd.setLenient(false);
        // Ter controle of het een juiste datum is. Gebeurt niet bij het zetten, maar bij het getten.
        try
        {
            Date datum = vTijd.getTime();
        }
        catch (IllegalArgumentException e)
        {
            throw new VluchtException("Geen geldige datum!");
        }
        if (!Vlucht.isBezet(vliegtuig, vTijd))
        {
            vertrekTijd = (Calendar) vTijd.clone();
        }
        else
        {
            throw new VluchtException("vliegtuig reeds bezet op " + tijd.getTime());
        }
    }

    public Calendar geefVertrekTijd()
    {
        return vertrekTijd;
    }

    /**
     * Controleer dat aankomstTijd > vertrekTijd.
     * @param tijd
     */
    public void zetAankomstTijd(Calendar tijd) throws VluchtException
    {
        Calendar aTijd = tijd;
        aTijd.setLenient(false);
        // Ter controle of het een juiste datum is. Gebeurt niet bij het zetten, maar bij het getten.
        try
        {
            Date datum = aTijd.getTime();
        }
        catch (IllegalArgumentException e)
        {
            throw new VluchtException("Geen geldige datum!");
        }
        if(aTijd.after(vertrekTijd)) 
        {
            aankomstTijd = (Calendar) aTijd.clone();
        }
        else
        {
            throw new VluchtException("aankomsttijd voor vertrektijd");
        }
    }

    public Calendar getAankomstTijd()
    {
        return aankomstTijd;
    }

    public Luchthaven geefVertrekpunt()
    {
        return vertrekpunt;
    }

    public void setVliegtuig(Vliegtuig vt)
    {
        this.vliegtuig = vt;
    }
   
   /**
    * @return java.util.HashSet
    * Ik weet niet of dit zo klopt.
    */
   public static HashSet<Vlucht> geefAlleVluchten()
   {
	HashSet<Vlucht> alleV= new HashSet<Vlucht>();
	for (Iterator<Vlucht> i = alleVluchten.iterator(); i.hasNext();) {
		Vlucht vl = i.next();
		alleV.add(vl);
	}
	return alleV;
   }

    public Vliegtuig getVliegtuig()
    {
        return vliegtuig;
    }
    
    public HashSet<Boeking> geefBoekingen()
    {
	return boekingen;
    }
    
    public HashSet<Boeking> getAlleBoekingen ()
    {
        return boekingen;
    }

    public void addBoeking (Boeking bk)
    {
        if (!boekingen.contains(bk))
        {
            boekingen.add(bk);
        }
    }


    public void removeBoeking (Boeking bk)
    {
        if (boekingen.contains(bk))
        {
            boekingen.remove(bk);
        }
    }
    
    /**
     * Controleer of alle gegevens gezet zijn. Zo ja, bewaar de vluchtgegevens.
     */
    public void bewaar() throws VluchtException
    {
        if (bestemming == null)
        {
            throw new VluchtException("geen geldige bestemming.");
        }
        else
        {
            if (vertrekpunt == null)
            {
                throw new VluchtException("geen geldig vertrekpunt.");
            }
            else
            {
                if (aankomstTijd == null)
                {
                    throw new VluchtException("geen geldige aankomsttijd.");
                }
                else
                {
                    if (vertrekTijd == null)
                    {
                        throw new VluchtException("geen geldige vertrektijd.");
                    }
                    else
                    {
                        alleVluchten.add(this);
                    }
                }
            }
        }

    }

    /**
     * @return Naam van de bestemming.
     */
    public String getBestemming()
    {
        return bestemming.getNaam();
    }
    
    public static HashSet<Vlucht> vertrekpEnbestemm (Luchthaven vertrek, Luchthaven aankomst)
    {
        HashSet<Vlucht> vluchtenPerLuchthavenCombi = new HashSet();
		
		int i = 0;
        for (Vlucht vl : alleVluchten)
        {
			i++;
            if (vl.vertrekpunt.equals(vertrek))
            {
                if (vl.bestemming.equals(aankomst))
                {
                    vluchtenPerLuchthavenCombi.add(vl);
                }
            }
        }
        return vluchtenPerLuchthavenCombi;
    }
}
