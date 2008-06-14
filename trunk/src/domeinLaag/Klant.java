package domeinLaag;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

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
    
    public static TreeMap<String, Klant> geefAlle ()
    {
		TreeMap<String, Klant> klanten = new TreeMap<String, Klant>();
		
		for (Iterator it = alleKlanten.iterator(); it.hasNext(); )
		{
			Klant kl = (Klant)it.next();
			klanten.put(kl.getNaam(), kl);
		}
        return klanten;
    }
    
    public void bewaar() throws KlantException, KlantBestaatAlException
    {
        if (naam.equals(null)	||
			straat.equals(null)	||
			huisNr < 1			||
			plaats.equals(null)
			)
		{
			throw new KlantException("Onvolledige Invoer");
		}
		else if (bestaatAl(this))
		{
			throw new KlantBestaatAlException("Klant was al geregistreerd");
		}		
		else
		{
			alleKlanten.add(this);
		}
    }
	
	public static boolean bestaatAl (Klant klant)
	{
		for (Iterator i = alleKlanten.iterator(); i.hasNext();)
		{
			Klant andereKlant = (Klant)i.next();
			if (andereKlant.getNaam().equals(klant.getNaam())		&&
				andereKlant.getStraat().equals(klant.getStraat())	&&
				andereKlant.getHuisNr() == klant.getHuisNr()		&&
				andereKlant.getPlaats().equals(klant.getHuisNr())
			)
			{
				return true;
			}
		}
		return false;
	}
}
