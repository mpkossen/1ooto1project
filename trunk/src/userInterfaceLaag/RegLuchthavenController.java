
package userInterfaceLaag;

// Imports
import domeinLaag.*;
import java.util.*;

/**
 * Deze Controller Klasse handelt het registreren van een nieuwe Luchthaven af.
 * Naast het starten van de bijbehorende GUI beschikt de klasse ook
 * over een aantal methoden die aangeroepen worden door ActionListeners.
 */
public class RegLuchthavenController
{
	// Relaties
	private Land land;					// Het land waar de Luchthaven ligt.
	private Luchthaven luchthaven;		// De te registreren Luchthaven.
	private RegLuchthavenFrame myFrame;	// GUI voor deze Controller.

	// Constructors
	/**
	 * Constructor, waarin tevens:
	 * - Een lijst van alle landen wordt opgevraagd.
	 * - De constructor van  RegLuchthavenFrame wordt aangeroepen, waarbij een lijst van alleen de namen van alle landen wordt meegegeven.
	 * - De constructor van Luchthaven wordt aangeroepen. De link naar deze nieuwe luchthaven wordt vastgelegd.
	 */
	public RegLuchthavenController ()
	{
		luchthaven = new Luchthaven();
		TreeMap<String, Land> alleLanden = Land.getAlleLanden();
		this.land = alleLanden.firstEntry().getValue();
		myFrame = new RegLuchthavenFrame(this, alleLanden);
		myFrame.setVisible(true);
	}

	/**
	 * Deze methode wordt aangeroepen door de ActionHandler van het land veld.
	 * Legt de link naar het geselecteerde land vast en geeft die door aan de nieuwe luchthaven.
	 * Vraagt land.code op en returned dit.
	 * @param land	het Land waar de Luchthaven zich bevindt
	 * @return		de landcode van het Land
	 */
	public int land (Land land)
	{
		luchthaven.setLand(land);
		return land.getCode();
	}

	/**
	 * Deze methode wordt aangeroepen door de ActionHandler van het naam veld.
	 * Roept lhv.setNaam(). Geef de exception door aan het frame, als die
	 * optreedt.
	 * @param naam	de naam van de Luchthaven
	 * @throws java.lang.LuchthavenException	als de naam al bezet is of ongeldig
	 */
	public void naam (String nm) throws LuchthavenException
	{
		try
		{
			luchthaven.setNaam(nm);
		}
		catch (IllegalArgumentException e)
		{
			throw new LuchthavenException(e.getMessage());
		}
	}

	/**
	 * Deze methode wordt aangeroepen door de ActionHandler van het code veld.
	 * Roept lhv.setCode().
	 * @param code	de code (afkorting) waarmee deze Luchthaven aangeduid wordt.
	 */
	public void code (String code) throws LuchthavenException
	{
		luchthaven.setCode(code);
	}

	/**
	 * Deze methode wordt aangeroepen door de ActionHandler van het werkplaats
	 * veld. Roept lhv.setWerkPlaats().
	 * @param wp	true als er een werkplaats is, anders false.
	 */
	public void werkPlaats (boolean wp) throws LuchthavenException
	{
		luchthaven.setWerkPlaats(wp);
	}

	/**
	 * Deze methode wordt aangeroepen door de ActionHandler van de OK button
	 * Roept lhv.bewaar() aan en sluit het scherm. Geeft de exception door aan
	 * het frame, als die optreedt.
	 * @throws java.lang.LuchthavenException	als er bij het bewaren een
	 * IllegalArgumentException optreedt bij het bewaren.
	 */
	public void ok () throws LuchthavenException
	{
		try
		{
			luchthaven.bewaar();
			myFrame.dispose();
		}
		catch (IllegalArgumentException e)
		{
			throw new LuchthavenException(e.getMessage());
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
