
package userInterfaceLaag;

// Imports
import domeinLaag.Boeking;
import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.TreeMap;

public class OvBkPerVlContr
{
	// Relaties
	private OvBkPerVlFrame myFrame;
	private Luchthaven vertrekpunt;
	private Luchthaven aankomstpunt;
	private Vlucht vlucht;

	// Constructors
	public OvBkPerVlContr ()
	{
		this.vertrekpunt = Luchthaven.getAlleLuchthavens().firstEntry().getValue();
		this.aankomstpunt = Luchthaven.getAlleLuchthavens().firstEntry().getValue();
		TreeMap<String, Luchthaven> luchthavens = Luchthaven.getAlleLuchthavens();

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

	public Object[][] vlucht (Vlucht vl)
	{
		this.vlucht = vl;
		HashSet<Boeking> alleBoekingen = vlucht.getAlleBoekingen();
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
