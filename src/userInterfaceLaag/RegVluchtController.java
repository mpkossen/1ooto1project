
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
	private RegVluchtFrame myFrame;							// GUI voor deze Controller.
	
	// Constructors
	/**
	 * Deze constructor maakt een gesorteerde lijst (TreeMap) van alle
	 * Luchthavens en alle Vliegtuigen van deze LuchtvaartMaatschappij en maakt
	 * daar een RegVluchtFrame mee aan.
	 * @param lvm	de LuchtvaartMaatschappij
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
	 * Deze methode zet de nm van het vliegtuig voor de vlucht en wordt
	 * aangeroepen door de ActionListener van het vliegtuig veld.
	 * @param nm	de nm van het vliegtuig
	 * @return		een één-dimensionale array met de capaciteit van het Vliegtuig.
	 * Twee velden, het eerste veld voor rokers, het tweede voor niet-rokers.
	 */
	public int[] vliegtuig (String nm)
	{
		vliegtuig = (Vliegtuig) alleVliegtuigen.get(nm);
		int[] cap = vliegtuig.getCapaciteit();
		return cap;
		//todo toon capaciteit
	}

	/**
	 * Deze methode zet het vertrekpunt (naam van de Luchthaven) van de vlucht
	 * en wordt aangeroepen door de ActionListener van het vertrekpunt veld.
	 * @param nm	de naam van het vertrekpunt
	 */
	public void vertrekpunt (String nm)
	{
		Luchthaven eenLuchthaven = alleLuchthavens.get(nm);
		vlucht = new Vlucht(vliegtuig, eenLuchthaven);
	}

	/**
	 * Deze methode zet de bestemming (naam van de Luchthaven) van de vlucht
	 * en wordt aangeroepen door de ActionListener van het bestemming veld.
	 * @param nm	de naam van de bestemming
	 * @throws domeinLaag.VluchtException	als vertrekpunt en bestemming gelijk zijn
	 */
	public void bestemming (String nm) throws VluchtException
	{
		Luchthaven eenLuchthaven = (Luchthaven) alleLuchthavens.get(nm);
		vlucht.setBestemming(eenLuchthaven);
	}

	/**
	 * Deze methode zet de vertrektijd van de vlucht en wordt aangeroepen door
	 * de ActionListener van het vertrektijd veld.
	 * @param vtt	het moment van vertrek voor deze vlucht
	 * @throws domeinLaag.VluchtException	als de aankomsttijd voor de
	 * vertrektijd ligt of de tijd ongeldig is
	 */
	public void vertrektijd (Calendar vtt) throws VluchtException
	{
		vlucht.setVertrekTijd(vtt);
	}

	/**
	 * Deze methode zet de aankomsttijd van de vlucht en wordt aangeroepen door
	 * de ActionListener van het aankomsttijd veld.
	 * @param att	het moment van aankomst van deze vlucht
	 * @throws domeinLaag.VluchtException	als de aankomsttijd voor de
	 * vertrektijd ligt of de tijd ongeldig is
	 */
	public void aankomstTijd (Calendar att) throws VluchtException
	{
		vlucht.setAankomstTijd(att);
	}

	/**
	 * Deze methode wordt aangeroepen door de ActionHandler van de OK button
	 * Roept vlucht.bewaar() aan en sluit het scherm. Geeft de exception door
	 * aan het frame, als die optreedt.
	 * @throws java.lang.VluchtException	als er bij het bewaren een
	 * VluchtException optreedt bij het bewaren.
	 */
	public void ok () throws VluchtException
	{
		vlucht.bewaar();
		myFrame.dispose();
	}
}
