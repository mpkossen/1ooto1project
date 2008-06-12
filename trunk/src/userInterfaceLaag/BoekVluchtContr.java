
package userInterfaceLaag;

// Imports
import domeinLaag.Boeking;
import domeinLaag.BoekingException;
import domeinLaag.Klant;
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
	
	public void klant (String naam, String straat, int huisNr, String plaats)
	{
		this.naam = naam.trim();
		this.straat = straat.trim();
		this.huisNr = huisNr;
		this.plaats = plaats.trim();
	}
	
	public void plaats (int aantal, boolean roken)
	{
		this.aantalPlaatsen = aantal;
		this.roken = roken;
	}
	
	public void ok ()
	{
		Klant klant = new Klant(naam, straat, huisNr, plaats);
		Boeking boeking = new Boeking();
		boeking.setVlucht(vlucht);
		boeking.setKlant(klant);
		boeking.setPlaatsen(aantalPlaatsen);
		boeking.setRoken(roken);
		try
		{
			boeking.bewaar();
		}
		catch (BoekingException be)
		{
			
		}
	}
	
	public void cancel ()
	{
		myFrame.dispose();
	}
}
