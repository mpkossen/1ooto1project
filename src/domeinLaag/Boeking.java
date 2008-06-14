
package domeinLaag;

import java.util.HashSet;

/**
 * Hierin worden boekingen geregeld. 
 */
public class Boeking
{
	// Attributen
	private boolean roken;
	private int aantalPlaatsen;
	// Relaties
	private Klant klant;
	private Vlucht vlucht;

	//Constructors
	/**
	 * Maakt een klanten vector aan.
	 */
	public Boeking ()
	{
	}

	public Boeking (Vlucht vl, int ap, boolean rkn, Klant kl)
	{
		this.vlucht = vl;
		this.aantalPlaatsen = ap;
		this.roken = rkn;
		this.klant = klant;
	}
	
	/**
	 * 
	 * @param rkn is roken als het true is en niet roken als het false is.
	 */
	// Setters
	public void setRoken (Boolean rkn)
	{
		this.roken = rkn;
	}

	/**
	 * Deze methode controleert het aantal plaatsen en Roken/Niet roken en geeft vervolgens aan of het kan ja of nee.
	 */
	//T.L. Deze Methode moet nog een Roken Check krijgen en een Aantal plaatsen Check
	public void setPlaatsen (int ap)
	{
		this.aantalPlaatsen = ap;
	}

	public void setKlant (Klant kl)
	{
		this.klant = kl;
	}

	public void setVlucht (Vlucht vl)
	{
		this.vlucht = vl;
	}

	// Getters
	public Boolean getRoken ()
	{
		return roken;
	}

	public int getAantalPlaatsen ()
	{
		return aantalPlaatsen;
	}

	public Vlucht getVlucht ()
	{
		return vlucht;
	}

	public Klant getKlant ()
	{
		return klant;
	}

	public void bewaar () throws BoekingException, KlantException, KlantBestaatAlException
	{
		if (vlucht.equals(null))
		{
			throw new BoekingException("");
		}
		else if (klant.equals(null))
		{
			throw new BoekingException("");
		}
		else if (aantalPlaatsen < 1)
		{
			throw new BoekingException("");
		}
		else
		{
			klant.bewaar();
			vlucht.addBoeking(this);
		}
	}
}

