
package domeinLaag;

import java.util.Calendar;
import java.util.Date;
import java.util.TreeMap;

public class Vliegtuig
{
	// Attributen
	private String naam = "";
	private Calendar datumInGebruik = null;
	
	// Relaties
	private VliegtuigType vliegtuigType;
	private LuchtvaartMaatschappij lvm;

	public Vliegtuig (LuchtvaartMaatschappij lvm)
	{
		this.lvm = lvm;
	}

	/**
	Constructor bedoelt om in main() test-objecten mee aan te maken.
	@param lvm
	@param VtT
	@param naam
	 */
	public Vliegtuig (LuchtvaartMaatschappij lvm, VliegtuigType VtT, String naam, Calendar inGebruik) throws IllegalArgumentException
	{
		this.lvm = lvm;
		vliegtuigType = VtT;
		setInGebruik(inGebruik);
		setNaam(naam);
		lvm.addVliegtuig(this);

	}

	public void setVliegtuigType (VliegtuigType vtt)
	{
		this.vliegtuigType = vtt;
	}

	public VliegtuigType getVliegtuigType ()
	{
		return vliegtuigType;
	}

	/**
	Controleert of de naam niet leeg is en uniek is voor de LvM:
	- Vraag een lijst van alle vliegtuigen op.
	- Controleer of er al een vliegtuig met die naam is.
	- Zo ja, throw IllegalArgumentException
	- Zo nee, zet de naam.
	@param naam
	 */
	public void setNaam (String nm) throws IllegalArgumentException
	{
		String nmTrim = nm.trim();
		TreeMap<String, Vliegtuig> alleVt = lvm.getVliegtuigen();
		Vliegtuig bestaandVliegtuig = alleVt.get(nmTrim);
		if (bestaandVliegtuig != null)
		{
			throw new IllegalArgumentException("Naam bestaat al!");
		}
		else if (nmTrim.length() == 0)
		{
			throw new IllegalArgumentException("Naam heeft geen geldige waarde!");
		}
		else
		{
			this.naam = nmTrim;
		}
	}

	public String getNaam ()
	{
		return naam;
	}

	/**
	@param inGebruik
	 */
	public void setInGebruik (Calendar inGebruik) throws IllegalArgumentException
	{
		Calendar datumIG = inGebruik;
		datumIG.setLenient(false);
		// Ter controle of het een juiste datum is.
		// Calendar doet dit niet bij het zetten, maar bij getTime() en dergelijke.
		try
		{
			Date datum = datumIG.getTime();
			datumInGebruik = (Calendar) inGebruik.clone();
		}
		catch (IllegalArgumentException e)
		{
			throw new IllegalArgumentException("Geen geldige datum!");
		}
	}

	/**
	 * Controleert of lvm, vtt en naam ingevuld zijn.
	 * 	Zo niet: werp een IllegalStateException.
	 * 	Zo wel: roept lvm.addVliegtuig().
	 *   @throws java.lang.IllegalStateException indien niet alle attributen zijn ingevuld.
	 */
	public void bewaar () throws IllegalStateException
	{
		if (vliegtuigType == null)
		{
			throw new IllegalStateException("Vliegtuigtype niet ingevuld!");
		}
		else if (naam.equals(""))
		{
			throw new IllegalStateException("Naam niet ingevuld!");
		}
		else if (datumInGebruik == null)
		{
			throw new IllegalStateException("Datum-in-gebruik niet ingevuld!");
		}
		else
		{
			lvm.addVliegtuig(this);
		}
	}

	public int[] getCapaciteit ()
	{
		return vliegtuigType.geefCapaciteit();
	}
}
