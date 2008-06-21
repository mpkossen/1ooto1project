
package userInterfaceLaag;

// Imports
import domeinLaag.Luchthaven;
import domeinLaag.LuchtvaartMaatschappij;
import domeinLaag.Vliegtuig;
import domeinLaag.Vlucht;
import domeinLaag.VluchtException;
import java.util.Calendar;
import java.util.TreeMap;

/**
 * Deze Controller Klasse handelt het registreren van een nieuwe Vlucht af.
 * Naast het starten van de bijbehorende GUI beschikt de klasse ook
 * over een aantal methoden die aangeroepen worden door ActionListeners.
 */
public class RegVluchtController
{
	// Relaties
	private LuchtvaartMaatschappij luchtvaartMaatschappij;	// De LuchtvaartMaatschappij.
	private Vliegtuig vliegtuig;							// Het Vliegtuig dat de Vlucht uit gaat voeren.
	private Vlucht vlucht;									// De nieuwe Vlucht.
	private TreeMap<String, Vliegtuig> alleVliegtuigen;		// Alle Vliegtuigen van de luchtvaartMaatschappij.
	private TreeMap<String, Luchthaven> alleLuchthavens;	// Alle Luchthavens.
	private RegVluchtFrame myFrame;						// GUI voor deze Controller.
	
	// Constructors
	/**
	 * Deze constructor geeft een gesorteerde lijst (TreeMap) van alle Luchthavens
	 * en alle Vliegtuigen van deze LuchtvaartMaatschappij en maakt daar een
	 * RegVluchtFrame mee aan.
	 * Toon frame met alle fabrikanten.
	 * @param lvm
	 */
	public RegVluchtController (LuchtvaartMaatschappij lvm)
	{
		this.luchtvaartMaatschappij = lvm;
		alleVliegtuigen = lvm.getVliegtuigen();
		alleLuchthavens = Luchthaven.getAlleLuchthavens();

		myFrame = new RegVluchtFrame(alleVliegtuigen.keySet(), alleLuchthavens.keySet(), this);
		myFrame.setVisible(true);
	}	

	// Overige Methodes
	/**
	 * Onthoud het vliegtuig. En toon de capaciteit van het vliegtuig.
	 */
	public int[] vliegtuig (String naam)
	{
		vliegtuig = (Vliegtuig) alleVliegtuigen.get(naam);
		int[] cap = vliegtuig.getCapaciteit();
		return cap;
		//todo toon capaciteit
	}

	/**
	 * Creeer een nieuwe vlucht en geef de maatschappij, het vliegtuig en vertrekpunt
	 * mee.
	 */
	public void vertrekpunt (String naam)
	{
		Luchthaven eenLuchthaven = alleLuchthavens.get(naam);
		vlucht = new Vlucht(vliegtuig, eenLuchthaven);
	}

	/**
	 * Leg bestemming vast bij vlucht.
	 */
	public void bestemming (String naam) throws VluchtException
	{
		Luchthaven eenLuchthaven = (Luchthaven) alleLuchthavens.get(naam);
		vlucht.setBestemming(eenLuchthaven);
	}

	/**
	 * Leg vertrektijd vast bij vlucht.
	 * @param vertrektijd
	 */
	public void vertrektijd (Calendar vertrektijd) throws VluchtException
	{
		vlucht.setVertrekTijd(vertrektijd);
	}

	/**
	 * Leg aankomstTijd vast bij Vlucht.
	 * @param tijd
	 */
	public void aankomstTijd (Calendar tijd) throws VluchtException
	{
		vlucht.setAankomstTijd(tijd);
	}

	/**
	 * Bewaar de vluchtgegegevens.
	 */
	public void ok () throws VluchtException
	{
		vlucht.bewaar();
	}
}
