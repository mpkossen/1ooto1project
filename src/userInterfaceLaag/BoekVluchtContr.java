
package userInterfaceLaag;

// Imports
import domeinLaag.Boeking;
import domeinLaag.BoekingException;
import domeinLaag.Klant;
import domeinLaag.KlantException;
import domeinLaag.KlantBestaatAlException;
import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;
import java.text.SimpleDateFormat;
import java.util.TreeMap;

public class BoekVluchtContr
{
	// Attributen
	private int aantalPlaatsen;
	private boolean roken;
	private String naam;
	private String straat;
	private int huisNr;
	private String plaats;
	
	// Relations
	private BoekVluchtFrame myFrame;
	private Vlucht vlucht;

	// Constructors
	public BoekVluchtContr ()
	{
		this.myFrame = new BoekVluchtFrame(this);
		myFrame.setVisible(true);
	}

	// Overige Methodes
	public TreeMap<String, Vlucht> vertrekpuntEnBestemming (Luchthaven vertrekpunt, Luchthaven bestemming)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		TreeMap<String, Vlucht> vluchten = new TreeMap<String, Vlucht>();
		int i = 0;
        for (Vlucht vl : Vlucht.geefAlleVluchten())
        {
			i++;
            if (vl.geefVertrekpunt().equals(vertrekpunt))
            {
                if (vl.geefBestemming().equals(bestemming))
                {
                    String datumtijd = formatter.format(vl.geefVertrekTijd().getTime());
					vluchten.put(datumtijd, vl);
                }
            }
		}
		return vluchten;
	}

	public void vlucht	(Vlucht vlucht)
	{
		this.vlucht = vlucht;
	}
	
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
	
	public void ok ()
	{
		System.out.println("Naam: " + naam);
		System.out.println("Straat: " + straat);
		System.out.println("HuisNr: " + huisNr);			
		System.out.println("Plaats: " + plaats);
		Klant klant = new Klant(naam, straat, huisNr, plaats);
		Boeking boeking = new Boeking();
		boeking.setVlucht(vlucht);
		boeking.setKlant(klant);
		boeking.setPlaatsen(aantalPlaatsen);
		boeking.setRoken(roken);
		try
		{
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
	
	public void cancel ()
	{
		myFrame.dispose();
	}
}
