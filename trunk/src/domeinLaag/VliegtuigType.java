
package domeinLaag;

/**
 * Een object van deze klasse representeert een type of model vliegtuigen.
 * Er wordt behouden wat de code is voor het type en wat de capaciteiten zijn
 * qua roken en niet-roken. Ook wordt bijgehouden wie de fabrikant is.
 */
public class VliegtuigType
{
	// Attributen
	private String code;				// De code voor dit type vliegtuig.
	private int capaciteitRoken;		// Het aantal zitplaatsen voor rokers.
	private int capaciteitNietRoken;	// Het aantal zitplaatsen voor niet-rokers.
	
	// Relaties
	private Fabrikant fabrikant;		// De fabrikant van dit type.

	// Constructors
	/**
	 * Constructor voor het aanmaken van een VliegtuigType. Wordt momenteel
	 * alleen in Fabrikant (vanuit Main) gebruikt om de boel te vullen.
	 * Er zijn geen Use Cases die objecten van deze klasse aanmaken of bewerken.
	 * @param fb	de fabrikant van het type
	 * @param cd	de code voor het type
	 * @param cr	de capaciteit qua zitplaatsen roken
	 * @param cnr	de capaciteit qua zitplaatsen niet-roken
	 */
	public VliegtuigType (Fabrikant fb, String cd, int cr, int cnr)
	{
		this.fabrikant = fb;
		this.code = cd;
		this.capaciteitRoken = cr;
		this.capaciteitNietRoken = cnr;
	}

	// Getters
	/**
	 * Deze methode geeft de code voor van dit type vliegtuig.
	 * @return	de code van dit vliegtuigType
	 */
	public String getCode ()
	{
		return code;
	}

	/**
	 * Deze methode geeft de fabrikant van dit type vliegtuig.
	 * @return	de Fabrikant van dit vliegtuigType
	 */
	public Fabrikant getFabrikant ()
	{
		return fabrikant;
	}

	/**
	 * Deze methode geeft de capaciteit (zitplaatsen) van dit type vliegtuig.
	 * @return	een één-dimensionale array met twee elementen.
	 * Het eerste element is het aantal rokers plaatsen.
	 * Het tweede element is het aantal niet-rokers plaatsen.
	 */
	public int[] getCapaciteit ()
	{
		int[] cap = new int[2];
		cap[0] = capaciteitRoken;
		cap[1] = capaciteitNietRoken;
		return cap;
	}
}
