
package userInterfaceLaag;

// Imports
import domeinLaag.Boeking;
import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * Deze Controller Klasse handelt het boekingsoverzicht per vlucht af.
 * Naast het starten van de bijbehorende GUI beschikt de klasse ook
 * over een aantal methoden die aangeroepen worden door ActionListeners.
 */
public class OvBkPerVlController
{
	// Relaties
	private OvBkPerVlFrame myFrame;		// GUI voor deze Controller.
	private Luchthaven vertrekpunt;		// de Luchthaven van vertrek.
	private Luchthaven aankomstpunt;	// de Luchthaven van bestemming.
	private Vlucht vlucht;	// De geselecteerde vlucht voor het overzicht.

	// Constructors
	/**
	 * Constructor voor deze Controller. De constructor maakt OvBkPerVlFrame
	 * aan. Deze wordt voorzien van gegevens over alle Luchthavens.
	 */
	public OvBkPerVlController ()
	{
		this.vertrekpunt = Luchthaven.getAlleLuchthavens().firstEntry().getValue();
		this.aankomstpunt = Luchthaven.getAlleLuchthavens().firstEntry().getValue();
		TreeMap<String, Luchthaven> luchthavens = Luchthaven.getAlleLuchthavens();

		myFrame = new OvBkPerVlFrame(luchthavens, this);
		myFrame.setVisible(true);
	}

	/**
	 * Deze methode wordt aangeroepen door de ActionHandler van het vertrek- en
	 * bestemmingveld. Als een van deze gezet wordt, moet de inhoud van de
	 * mogelijke vertrek momenten veranderen gebaseerd op de Vertrek- en
	 * Aankomstpunten. Deze Vertrek momenten worden dan terug gegeven zodat de
	 * GUI die weer kan geven.
	 * @param vertrekpunt	de Luchthaven van vertrek
	 * @param bestemming	de Luchthaven van bestemming
	 * @return				een TreeMap van vertrektijden (datum+tijd) en Vluchten
	 */
	public TreeMap<String, Vlucht> vertrekpuntEnBestemming (Luchthaven vertrekpunt, Luchthaven bestemming)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		TreeMap<String, Vlucht> vluchten = new TreeMap<String, Vlucht>();
		int i = 0;
        for (Vlucht vl : Vlucht.getAlleVluchten())
        {
			System.out.println("Vlucht gevonden");
			i++;
            if (vl.getVertrekpunt().equals(vertrekpunt))
            {
				System.out.println("Vertrekpunt gelijk");
                if (vl.getBestemming().equals(bestemming))
                {
					System.out.println("Bestemming gelijk");
                    String datumtijd = formatter.format(vl.getVertrekTijd().getTime());
					vluchten.put(datumtijd, vl);
                }
            }
		}
		return vluchten;
	}

	/**
	 * Deze methode wordt aangeroepen door de ActionHandler van het vlucht veld.
	 * Als deze gezet wordt, worden alle boekingen van de vlucht opgehaald en
	 * terug gegeven als een array.
	 * @param vl	de geselecteerde Vlucht
	 * @return		een twee-dimensionale array met boekingsgegevens
	 */
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

	/**
	 * Deze methode sluit de GUI.
	 */
	public void cancel ()
	{
		myFrame.dispose();
	}

	/**
	 * Deze methode sluit de GUI.
	 */
	public void ok ()
	{
		myFrame.dispose();
	}
}
