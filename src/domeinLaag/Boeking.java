
package domeinLaag;

import java.util.Iterator;

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
	public Boeking (Vlucht vl, int ap, boolean rkn, Klant kl)
	{
		this.vlucht = vl;
		this.aantalPlaatsen = ap;
		this.roken = rkn;
		this.klant = kl;
	}
	
	public Boeking ()
	{
	}

	// Setters
	/**
	 *	@param rkn is roken als het true is en niet roken als het false is.
	 */
	public void setRoken (Boolean rkn)
	{
		this.roken = rkn;
	}

	/**
	 *	Deze methode controleert het aantal plaatsen en Roken/Niet roken en geeft vervolgens aan of het kan ja of nee.
	 */
	//TL: Deze Methode moet nog een Roken Check krijgen en een Aantal plaatsen Check
	//FM: Voor zover ik kan zien is dat nu gefixed.
	public void setPlaatsen (int ap) throws BoekingException
	{
		int[] capaciteit = vlucht.getVliegtuig().getCapaciteit();
		int[] plaatsen = new int[2];
		for (Iterator it = vlucht.getAlleBoekingen().iterator();  it.hasNext(); )
		{
			Boeking bk = (Boeking)it.next();
			if (bk.getRoken())	plaatsen[0] += bk.getAantalPlaatsen();
			else				plaatsen[1] += bk.getAantalPlaatsen();
		}
			
		if (roken)
		{
			if (capaciteit[0] > (plaatsen[0] + ap))	this.aantalPlaatsen = ap;
			else									throw new BoekingException("Onvoldoende Capaciteit");
		}
		else
		{
			if (capaciteit[1] > (plaatsen[1]+ ap))	this.aantalPlaatsen = ap;
			else									throw new BoekingException("Onvoldoende Capaciteit");
		}
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

	// Overige Methodes
	public void bewaar () throws BoekingException, KlantException, KlantBestaatAlException
	{
		if (vlucht == null)
		{
			throw new BoekingException("Geen vlucht geselecteerd");
		}
		else if (klant == null)
		{
			throw new BoekingException("Geen klant ingevoerd");
		}
		else if (aantalPlaatsen < 1)
		{
			throw new BoekingException("Ongeldige invoer voor het aantal plaatsen");
		}
		else
		{
			klant.bewaar();
			vlucht.addBoeking(this);
		}
	}
}

