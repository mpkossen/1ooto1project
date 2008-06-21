
package userInterfaceLaag;

// Imports
import domeinLaag.Boeking;
import domeinLaag.BoekingException;
import domeinLaag.Klant;
import domeinLaag.KlantBestaatAlException;
import domeinLaag.KlantException;
import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;
import java.text.SimpleDateFormat;
import java.util.TreeMap;

/**
 * Deze Controller Klasse handelt het boeken van een vlucht af.
 * Naast het starten van de bijbehorende GUI beschikt de klasse ook
 * over een aantal methoden die aangeroepen worden door ActionListeners.
 */
public class BoekVluchtController
{
	// Attributen
	private int aantalPlaatsen;	// Aantal plaatsen voor deze boeking.
	private boolean roken;		// True als het roken-plaatsen betreft, anders false.
	private String naam;		// Naam van de klant die boekt.
	private String straat;		// Straat van de klant die boekt.
	private int huisNr;			// Huisnummer van de klant die boekt.
	private String plaats;		// Woonplaats van de klant die boekt.
	
	// Relations
	private BoekVluchtFrame myFrame;	// GUI voor deze Controller.
	private Vlucht vlucht;				// Vlucht waar deze boeking over gaat.

	// Constructors
	/**
	 * Constructor voor deze Controller.
	 * De constructor maakt BoekVluchtFrame aan.
	 */
	public BoekVluchtController ()
	{
		this.myFrame = new BoekVluchtFrame(this);
		myFrame.setVisible(true);
	}

	// Overige Methodes
	/**
	 * Deze methode levert alle vluchten die voldoen aan een gegeven
	 * vertrekpunt en bestemming, dit zodat de GUI er een keuze tussen
	 * kan bieden.
	 * @param vertrekpunt	de Luchthaven van vertrek
	 * @param bestemming	de Luchthaven van bestemming
	 * @return				een TreeMap van vertrektijden (datum+tijd) en Vluchten.
	 */
	public TreeMap<String, Vlucht> vertrekpuntEnBestemming (Luchthaven vertrekpunt, Luchthaven bestemming)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		TreeMap<String, Vlucht> vluchten = new TreeMap<String, Vlucht>();
		int i = 0;
        for (Vlucht vl : Vlucht.getAlleVluchten())
        {
			i++;
            if (vl.getVertrekpunt().equals(vertrekpunt))
            {
                if (vl.getBestemming().equals(bestemming))
                {
                    String datumtijd = formatter.format(vl.getVertrekTijd().getTime());
					vluchten.put(datumtijd, vl);
                }
            }
		}
		return vluchten;
	}

	/**
	 * Deze methode zet de geselecteerde vlucht voor de boeking. Deze methode
	 * wordt aangeroepen door de ActionListeners van de GUI.
	 * @param vlucht	de gekozen vlucht
	 */
	public void vlucht	(Vlucht vlucht)
	{
		this.vlucht = vlucht;
	}
	
	/**
	 * Deze methode zet de gegevens van de klant voor de boeking. Deze methode
	 * wordt aangeroepen door de ActionListeners van de GUI.
	 * @param nm	de naam van de klant
	 * @param str	de straat van de klant
	 * @param hnr	het huisnummer van de klant
	 * @param pl	de woonplaats van de klant
	 * @throws java.lang.NumberFormatException	als het huisnummer ongeldige invoer bevat
	 */
	public void klant (String nm, String str, String hnr, String pl) throws NumberFormatException
	{
		try
		{
			this.naam = nm.trim();
			this.straat = str.trim();
			this.huisNr = Integer.parseInt(hnr.trim());
			this.plaats = pl.trim();
		}
		catch (NumberFormatException nfe)
		{
			throw new NumberFormatException("Ongeldige invoer voor het huisnummer.");
		}
	}
	
	/**
	 * Deze methode zet het aantal en type zitplaatsen voor de boeking. Deze
	 * methode wordt aangeroepen door de ActionListeners van de GUI.
	 * @param aantal	het aantal gewenste zitplaatsen
	 * @param roken		het type zitplaatsen (roken vs niet-roken)
	 * @throws java.lang.NumberFormatException	als het aantal plaatsen ongeldige invoer bevat
	 */
	public void plaats (String aantal, boolean roken) throws NumberFormatException
	{
		try
		{
			this.aantalPlaatsen = Integer.parseInt(aantal);
			this.roken = roken;
		}
		catch (NumberFormatException nfe)
		{
			throw new NumberFormatException("Ongeldige invoer voor het aantal stoelen.");
		}		
	}
	
	/**
	 * Deze methode slaat alle eerder ingevoerde gegeven op. Indien een of meer
	 * van de gegevens niet ok zijn dan wordt er in de domeinlaag een Exception
	 * gegenereerd en in deze methode afgevangen.
	 */
	public void ok ()
	{
		Klant klant = new Klant(naam, straat, huisNr, plaats);
		Boeking boeking = new Boeking();
		try
		{
			boeking.setVlucht(vlucht);
			boeking.setKlant(klant);
			boeking.setPlaatsen(aantalPlaatsen);
			boeking.setRoken(roken);			
			boeking.bewaar();
			myFrame.dispose();
		}
		catch (KlantException ke)
		{
			// De klantgegevens (naam, straat huisnummer, plaats) zijn niet ok.
			// De boekingsgevens (vlucht, aantalPlaasen, roken) zijn dus wel ok.
		}
		catch (KlantBestaatAlException kbae)	// Klant bestaat dus al
		{
			boeking.setKlant(klant);			// Dan maar een bestaande klant refereren.
			vlucht.addBoeking(boeking);			// Uiteraard moeten we dan wel nog even de boeking bewaren.
		}
		catch (BoekingException be)
		{
			// De boekingsgegevens (vlucht, aantalPlaasen, roken) zijn niet ok.
		}
	}
	
	/**
	 * Deze methode sluit de GUI.
	 */
	public void cancel ()
	{
		myFrame.dispose();
	}
}
