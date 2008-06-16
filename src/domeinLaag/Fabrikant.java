
package domeinLaag;

// Imports
import java.util.TreeMap;
import java.util.HashSet;

/**
 * Hierin worden fabrikanten en hun vliegtuig typen aangemaakt.
 */
public class Fabrikant
{
	// Attributen
	private String naam;
	private String contactPersoon;

	// Relaties
	private HashSet<VliegtuigType> vliegtuigTypen;
	private static HashSet<Fabrikant> alleFabrikanten = new HashSet<Fabrikant>();

	// Constructors
	/**
	@param naam
	@param cp
	 */
	public Fabrikant (String nm, String cp)
	{
		this.naam = nm;
		this.contactPersoon = cp;
		Fabrikant.alleFabrikanten.add(this);
		vliegtuigTypen = new HashSet<VliegtuigType>();
	}

	// Setters
	public void setNaam (String nm)
	{
		this.naam = nm;
	}
	
	public void setContactPersoon (String cp)
	{
		this.contactPersoon = cp;
	}
	
	// Getters
	/**
	@return TreeMap met key = naam en value = referentie naar het fabrikant-object.
	 */
	public String getNaam ()
	{
		return naam;
	}

	/**
	@return String
	 */
	public String getContactpersoon ()
	{
		return contactPersoon;
	}

	/**
	@return TreeMap met key = code en value = referentie naar het vliegtuigtype-object.
	 */
	public TreeMap<String, VliegtuigType> getVliegtuigTypen ()
	{
		TreeMap<String, VliegtuigType> alleVliegtuigTypen = new TreeMap<String, VliegtuigType>();
		for (VliegtuigType vliegtuigType : vliegtuigTypen)
		{
			String code = vliegtuigType.getCode();
			alleVliegtuigTypen.put(code, vliegtuigType);
		}
		return alleVliegtuigTypen;
	}

	public static TreeMap<String, Fabrikant> getAlleFabrikanten ()
	{
		TreeMap<String, Fabrikant> fabrikanten = new TreeMap<String, Fabrikant>();
		for (Fabrikant fabrikant : alleFabrikanten)
		{
			String naam = fabrikant.naam;
			fabrikanten.put(naam, fabrikant);
		}
		return fabrikanten;
	}	
	
	// Creators
	/**
	@param code
	@param capR
	@param capNR
	@return VliegtuigType
	 */
	public VliegtuigType createVliegtuigType (String code, int capR, int capNR)
	{
		VliegtuigType vtt = new VliegtuigType(this, code, capR, capNR);
		vliegtuigTypen.add(vtt);
		return vtt;
	}
}
