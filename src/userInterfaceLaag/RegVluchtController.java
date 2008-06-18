
package userInterfaceLaag;

// Imports
import java.util.*;
import domeinLaag.Luchthaven;
import domeinLaag.LuchtvaartMaatschappij;
import domeinLaag.Vliegtuig;
import domeinLaag.Vlucht;
import domeinLaag.VluchtException;

public class RegVluchtController
{
	// Relaties
	private TreeMap<String, Vliegtuig> vt;
	private Vliegtuig hetVliegtuig;
	private LuchtvaartMaatschappij lvm;
	private TreeMap<String, Luchthaven> lh;
	private Vlucht deVlucht;
	private RegVluchtJFrame myFrame;

	// Constructors
	/**
	 * Toon frame met alle fabrikanten.
	 * @param lvm
	 */
	public RegVluchtController (LuchtvaartMaatschappij lvm)
	{
		this.lvm = lvm;
		vt = lvm.getVliegtuigen();
		lh = Luchthaven.getAlleLuchthavens();

		myFrame = new RegVluchtJFrame(vt.keySet(), lh.keySet(), this);
		myFrame.setVisible(true);
	}	

	// Overige Methodes
	/**
	 * Onthoud het vliegtuig. En toon de capaciteit van het vliegtuig.
	 */
	public int[] vliegtuig (String naam)
	{
		hetVliegtuig = (Vliegtuig) vt.get(naam);
		int[] cap = hetVliegtuig.getCapaciteit();
		return cap;
		//todo toon capaciteit
	}

	/**
	 * Creeer een nieuwe vlucht en geef de maatschappij, het vliegtuig en vertrekpunt
	 * mee.
	 */
	public void vertrekpunt (String naam)
	{
		Luchthaven eenLuchthaven = lh.get(naam);
		deVlucht = new Vlucht(hetVliegtuig, eenLuchthaven);
	}

	/**
	 * Leg bestemming vast bij vlucht.
	 */
	public void bestemming (String naam) throws VluchtException
	{
		Luchthaven eenLuchthaven = (Luchthaven) lh.get(naam);
		deVlucht.setBestemming(eenLuchthaven);
	}

	/**
	 * Leg vertrektijd vast bij vlucht.
	 * @param vertrektijd
	 */
	public void vertrektijd (Calendar vertrektijd) throws VluchtException
	{
		deVlucht.setVertrekTijd(vertrektijd);
	}

	/**
	 * Leg aankomstTijd vast bij Vlucht.
	 * @param tijd
	 */
	public void aankomstTijd (Calendar tijd) throws VluchtException
	{
		deVlucht.setAankomstTijd(tijd);
	}

	/**
	 * Bewaar de vluchtgegegevens.
	 */
	public void ok () throws VluchtException
	{
		deVlucht.bewaar();
	}
}
