
package domeinLaag;

// Imports
import java.util.HashSet;
import java.util.Iterator;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * In deze klasse worden Klanten aangemaakt en opgeslagen.
 */
public class Klant
{
	// Attributen
    private String naam;	// Voorletters + Achternaam van de klant.
    private String straat;	// Straat van de klant.
    private String plaats;	// Woonplaats van de klant.
    private int huisNr;		// Huisnummer van de klant.
	
	// Relaties
    private static HashSet alleKlanten = new HashSet();	// Static HashSet met daarin alle klanten.

    // Constructors
	/**
	 * Constructor voor klasse Boeking. Wordt gebruikt door Main om de boel even te vullen.
	 * Dit zodat er ook wat te testen valt. Wordt ook gebruik in BoekVluchtContr om een klant
	 * aan te maken en op te slaan indien die nog niet bestaat.
	 * @param nm is de naam van de klant.
	 * @param str is de straat van de klant.
	 * @param hnr is het huisnummer van de klant.
	 * @param pl is de woonplaats van de klant.
	 */
    public Klant(String nm, String str, int hnr, String pl)
    {
        this.naam = nm;
        this.straat = str;
        this.huisNr = hnr;
        this.plaats = pl;
    }

    /**
	 * Deze methode zet de naam van de klant.
	 * @param nm is de naam van de klant.
	 */
    public void setNaam(String nm)
    {
        this.naam = nm;
    }

	/**
	 * Deze methode zet de straat van de klant.
	 * @param st is de straat van de klant.
	 */
    public void setStraat(String st)
    {
        this.straat = st;
    }

	/**
	 * Deze methode zet de woonplaats van de klant.
	 * @param pl is de woonplaats van de klant.
	 */
    public void setPlaats(String pl)
    {
        this.plaats = pl;
    }

	/**
	 * Deze methode zet het huisnummer van de klant.
	 * @param hn is het huisnummer van de klant.
	 */
    public void setHuisNr(int hn)
    {
        this.huisNr = hn;
    }

    // Getters
	/**
	 * Deze methode returned de naam van de klant.
	 * @return is de naam van de klant.
	 */
    public String getNaam()
    {
        return naam;
    }
    
	/**
	 * Deze methode returned de straat van de klant.
	 * @return is de straat van de klant.
	 */
    public String getStraat ()
    {
        return straat;
    }
    
	/**
	 * Deze methode returned de woonplaats van de klant.
	 * @return is de woonplaats van de klant.
	 */
    public String getPlaats ()
    {
        return plaats;
    }
    
	/**
	 * Deze methode returned het huisnummer van de klant.
	 * @return is het huisnummer van de klant.
	 */
    public int getHuisNr ()
    {
        return huisNr;
    }
    
	/**
	 * Deze static methode returned alle klanten.
	 * @return is een TreeMap van klantnamen en Klanten.
	 */
    public static TreeMap<String, Klant> getAlleKlanten ()
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

	// Overige Methodes
	/**
	 * Deze static methode controleert of een klant al bestaat. Er wordt gecontroleert
	 * door te kijken of de naam en het gehele adres overeen komen. Als ook maar iets
	 * afwijkt wordt het geaccepteert als een andere klant.
	 * @param kl is de klant die je wil testen.
	 * @return is true als de klant al bestaat en false als dat niet zo is.
	 */
	public static boolean bestaatAl (Klant kl)
	{
		for (Iterator it = getAlleKlanten().values().iterator(); it.hasNext();)
		{
			Klant andereKlant = (Klant)it.next();
			if (andereKlant.getNaam().equals(kl.getNaam())		&&
				andereKlant.getStraat().equals(kl.getStraat())	&&
				andereKlant.getHuisNr() == kl.getHuisNr()		&&
				andereKlant.getPlaats().equals(kl.getHuisNr())
			)
			{
			return true;
			}
		}
		return false;
	}
	
	/**
	 * Deze methode slaat een aanmaakte klant op indien deze nog niet bestaat.
	 * Als de klant wel al bestaat (zie methode bestaatAl), dan wordt een
	 * KlantBestaatAlException gegooid die de gebruiker dit laat weten. De
	 * verdere afhandeling gebeurt dan in de controller.
	 * @throws domeinLaag.KlantException als er ongeldige gegevens ingevoegd zijn.
	 * @throws domeinLaag.KlantBestaatAlException als de klant al bestond.
	 */
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
