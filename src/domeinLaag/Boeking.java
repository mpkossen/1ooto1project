
package domeinLaag;

// Imports
import java.util.Iterator;

/**
 * Een object van deze klasse representeert één boeking voor één vlucht van één klant. 
 */
public class Boeking
{
	// Attributen
	private boolean roken;		// Of het om roken- of niet-roken-plaatsen gaat.
	private int aantalPlaatsen;	// Het aantal plaatsen voor deze boeking.

	// Relaties
	private Klant klant;		// De klant die deze boeking gedaan heeft.
	private Vlucht vlucht;		// De vlucht waar deze boeking voor is.

	//Constructors
	/**
	 * Constructor voor klasse Boeking. Wordt gebruikt door Main om de boel even te vullen.
	 * Dit zodat er ook wat te testen valt.
	 * @param vl is de vlucht waarvoor deze boeking is.
	 * @param ap is het aantal geboekte plaatsen op de vlucht.
	 * @param rkn is true als het om "roken" gaat en false als het om "niet-roken" gaat.
	 * @param kl is de klant die de boeking gedaan heeft.
	 */
	public Boeking (Vlucht vl, int ap, boolean rkn, Klant kl)
	{
		this.vlucht = vl;
		this.aantalPlaatsen = ap;
		this.roken = rkn;
		this.klant = kl;
	}
	
	/**
	 * Constructor voor klasse Boeking. Wordt gebruikt door de Controllers om een boeking aan te maken.
	 */
	public Boeking ()
	{
	}

	// Setters
	/**
	 * Deze methode zet in de boeking of het om roken- of niet-roken-plaatsen gaat.
	 *	@param rkn is roken als het true is en niet roken als het false is.
	 */
	public void setRoken (boolean rkn)
	{
		this.roken = rkn;
	}

	//TL: Deze Methode moet nog een Roken Check krijgen en een Aantal plaatsen Check
	//FM: Voor zover ik kan zien is dat nu gefixed.
	/**
	 * Deze methode controleert het aantal beschikbare (vrije) plaatsen op de vlucht.
	 * Als dat aantal beschikbare plaatsen voldoende is voor het aantal gewenste plaatsen
	 * EN die plaatsen zijn van het juiste type (Roken/Niet Roken) dan wordt het aantal plaatsen
	 * gezet. Indien er onvoldoende plaatsen van het juiste type beschikbaar zijn wordt een
	 * BoekingException gegooit. Uiteraard worden, in geval van succes, de benodigde plaatsen op
	 * niet-beschikbaar gezet.
	 * @param ap is het aantal gewenste plaatsen voor deze Boeking.
	 * @throws domeinLaag.BoekingException als er onvoldoende, juiste plaatsen beschikbaar zijn.
	 */
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

	/**
	 * Deze methode zet de klant van deze boeking naar het klant argument.
	 * @param kl is de klant die deze boeking gedaan heeft.
	 */
	public void setKlant (Klant kl)
	{
		this.klant = kl;
	}

	/**
	 * Deze methode zet de vlucht van deze boeking naar het vlucht argument.
	 * @param vl is de vlucht waar deze boeking over gaat.
	 */
	public void setVlucht (Vlucht vl)
	{
		this.vlucht = vl;
	}

	// Getters
	/**
	 * Deze methode returned of de Boeking om roken/niet-roken plaatsen gaat.
	 * @return is true als het om "Roken" gaat en false als het om "Niet Roken" gaat.
	 */
	public boolean getRoken ()
	{
		return roken;
	}

	/**
	 * Deze methode returned het aantal plaatsen op de vlucht.
	 * @return is het aantal plaatsen dat deze boeking op de vlucht heeft.
	 */
	public int getAantalPlaatsen ()
	{
		return aantalPlaatsen;
	}

	/**
	 * Deze methode returned de vlucht waar deze boeking voor is.
	 * @return is de vlucht waar deze boeking voor is.
	 */
	public Vlucht getVlucht ()
	{
		return vlucht;
	}

	/**
	 * Deze methode returned de klant die deze boeking gedaan heeft.
	 * @return is de klant die deze boeking gedaan heeft.
	 */
	public Klant getKlant ()
	{
		return klant;
	}

	// Overige Methodes
	/**
	 * Deze methode bewaart alle ingevoerde gegevens door dit object te registreren bij de centraler gelegen klassen.
	 * @throws domeinLaag.BoekingException als gegevens ontbreken of ongeldig zijn.
	 * @throws domeinLaag.KlantException als er iets mis is met de klantgegevens.
	 * @throws domeinLaag.KlantBestaatAlException als de klant al bleek te bestaan.
	 */
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

