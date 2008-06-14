package domeinLaag;

import java.util.HashSet;
import java.util.Iterator;
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
    private static HashSet alleKlanten = new HashSet();

    // Constructors
    public Klant(String nm, String str, int hnr, String pl)
    {
        this.naam = nm;
        this.straat = str;
        this.huisNr = hnr;
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
		
		Iterator it = alleKlanten.iterator();
		for (; it.hasNext();)
		{
			Klant kl = (Klant)it.next();
			klanten.put(kl.getNaam(), kl);
		}
        return klanten;
    }
	    
	public static boolean bestaatAl (Klant klant)
	{
		for (Iterator it = geefAlle().values().iterator(); it.hasNext();)
		{
			Klant andereKlant = (Klant)it.next();
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
	
    public void bewaar() throws KlantException, KlantBestaatAlException
    {
		if (naam == null		||
			straat == null		||
			huisNr < 1			||
			plaats == null
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
}
