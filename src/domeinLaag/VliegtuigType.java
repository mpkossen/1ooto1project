
package domeinLaag;

public class VliegtuigType
{
	// Attributen
	private String code;
	private int capaciteitRoken;
	private int capaciteitNietRoken;
	
	// Relaties
	private Fabrikant fabrikant;

	// Constructors
	/**
	@param cd
	@param capR
	@param capNR
	@param fabr
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
	@return java.lang.String
	 */
	public String getCode ()
	{
		return code;
	}

	public Fabrikant getFabrikant ()
	{
		return fabrikant;
	}

	/**
	@return int[]
	 */
	public int[] getCapaciteit ()
	{
		int[] cap = new int[2];
		cap[0] = capaciteitRoken;
		cap[1] = capaciteitNietRoken;
		return cap;
	}
}
