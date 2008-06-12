
package userInterfaceLaag;

// Imports
import java.util.Calendar;
import java.util.TreeMap;
import java.text.SimpleDateFormat;
import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;

public class BoekVluchtContr
{
	// Attributes
	private BoekVluchtFrame myFrame;
	private Luchthaven vertrekpunt;
	private Luchthaven aankomstpunt;
	private Calendar vertrektijd;
	private Vlucht vlucht;	
	// Relations


	// Constructors
	public BoekVluchtContr ()
	{
		this.vertrekpunt = Luchthaven.geefAlle().firstEntry().getValue();
		this.aankomstpunt = Luchthaven.geefAlle().firstEntry().getValue();
		TreeMap<String, Luchthaven> luchthavens = Luchthaven.geefAlle();
		
		this.myFrame = new BoekVluchtFrame(luchthavens, this);
		myFrame.setVisible(true);
	}

	// Overige Methodes
	public void Vlucht ()
	{
		
	}
	
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
		return;
	}
	
	public void klant (String naam, String adres, int huisNr, String plaats)
	{
		
	}
	
	public void plaats (int aantal, boolean roken)
	{
		
	}
	
	public void ok ()
	{
		
	}
	
	public void cancel ()
	{
		myFrame.dispose();
	}
}
