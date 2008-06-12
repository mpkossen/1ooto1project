
package userInterfaceLaag;

import domeinLaag.Boeking;
import domeinLaag.Klant;
import domeinLaag.Vlucht;
import domeinLaag.Luchthaven;
import domeinLaag.LuchtvaartMaatschappij;

import java.util.Calendar;
import java.util.HashSet;
import java.text.SimpleDateFormat;
import java.util.TreeMap;
import java.util.Vector;

public class OvBkPerVlContr
{
	private LuchtvaartMaatschappij luchtvaartMaatschappij;
	private OvBkPerVlFrame myFrame;
	private Luchthaven vertrekpunt;
	private Luchthaven aankomstpunt;
	private Calendar vertrektijd;
	private Vlucht vlucht;

	public OvBkPerVlContr ()
	{
		this.vertrekpunt = Luchthaven.geefAlle().firstEntry().getValue();
		this.aankomstpunt = Luchthaven.geefAlle().firstEntry().getValue();
		TreeMap<String, Luchthaven> luchthavens = Luchthaven.geefAlle();

		myFrame = new OvBkPerVlFrame(luchthavens, this);
		myFrame.setVisible(true);
	}

	/*  Dit wordt aangeroepen door de ActionHandler van het vertrek veld.
	 *  Als dit vertrek punt gezet wordt, moet de inhoud van de mogelijke
	 *  Vertrek momenten veranderen gebaseerd op de Vertrek- en Aankomstpunten.
	 *  Deze Vertrek momenten worden dan terug gegeven zodat de GUI die weer
	 *  kan geven.
	 */
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

	public Object[][] vlucht (Vlucht vl)
	{
		this.vlucht = vl;
		Vector<Boeking> alleBoekingen = vlucht.getAlleBoekingen();
		int size = alleBoekingen.size();
		Object[][] boekingen = new Object[size][4];

		int i = 0;
		for (Boeking boeking : alleBoekingen)
		{
			boekingen[i][0] = boeking.getKlant().getNaam();
			boekingen[i][1] = boeking.getKlant().getPlaats();
			boekingen[i][2] = Integer.toString(boeking.getAantalPlaatsen());
			if (boeking.getRoken())
			{
				boekingen[i][3] = "Ja";
			}
			else
			{
				boekingen[i][3] = "Nee";
			}
			i++;
		}
		return boekingen;
	}

	public void cancel ()
	{
		myFrame.dispose();
	}

	public void ok ()
	{
		myFrame.dispose();
	}
}
