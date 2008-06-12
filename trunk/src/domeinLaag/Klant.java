package domeinLaag;

import java.util.HashSet;

/**
 * In deze klasse worden Klanten aangemaakt en opgeslagen.
 */
public class Klant
{
    private String naam;
    private String straat;
    private String plaats;
    private int huisNr;
    private static HashSet alleKlanten;

    // Constructors
    public Klant(String nm, String ad, int huis, String pl)
    {
        this.naam = nm;
        this.plaats = pl;
        this.huisNr = huis;
        this.plaats = pl;
    }

    // Setters
    public void setNaam(String nm)
    {
        this.naam = nm;
    }

    public void setStraat(String st)
    {
        this.straat = st;
    }

    public void setPlaats(String pl)
    {
        this.plaats = pl;
    }

    public void setHuisNr(int hn)
    {
        this.huisNr = hn;
    }

    // Getters
    public String getNaam()
    {
        return naam;
    }
    
    public String getStraat ()
    {
        return straat;
    }
    
    public String getPlaats ()
    {
        return plaats;
    }
    
    public int getHuisNr ()
    {
        return huisNr;
    }
    
    public static HashSet getAlleKlanten ()
    {
        return alleKlanten;
    }
    
    public void bewaar() throws KlantException
    {
        if (naam.equals(null)	||
			straat.equals(null)	||
			huisNr < 1			||
			plaats.equals(null)
			)
		{
			throw new KlantException();
		}
		else
		{
			alleKlanten.add(this);
		}
    }
    
}
