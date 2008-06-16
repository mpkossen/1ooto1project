
package userInterfaceLaag;

import domeinLaag.*;
import java.util.*;

public class RegLuchthavenContr
{
	private Land land;
	private Luchthaven luchthaven;
	private RegLuchthavenFrame myFrame;

	/**
	Constructor, waarin tevens:
	- Een lijst van alle landen wordt opgevraagd.
	- De constructor van  RegLuchthavenFrame wordt aangeroepen, waarbij een
	lijst van alleen de namen van alle landen wordt meegegeven.
	- De constructor van Luchthaven wordt aangeroepen. De link naar deze
	nieuwe luchthaven wordt vastgelegd.
	 */
	public RegLuchthavenContr ()
	{
		luchthaven = new Luchthaven();
		TreeMap<String, Land> alleLanden = Land.getAlleLanden();
		this.land = alleLanden.firstEntry().getValue();
		myFrame = new RegLuchthavenFrame(this, alleLanden);
		myFrame.setVisible(true);
	}

	/**
	Legt de link naar het geselecteerde land vast en geeft die door aan de nieuwe luchthaven.
	Vraagt land.code op en returned dit.
	@param land
	@return int
	 */
	public int land (Land land)
	{
		luchthaven.setLand(land);
		return land.getCode();
	}

	/**
	Roep lhv.setNaam().
	Geef de exception door aan het frame, als die optreedt.
	@param naam
	@throws java.lang.LuchthavenException
	 */
	public void naam (String nm) throws LuchthavenException
	{
		luchthaven.setNaam(nm);
	}

	/**
	Roep lhv.setCode().
	@param code
	 */
	public void code (String code) throws LuchthavenException
	{
		luchthaven.setCode(code);
	}

	/**
	Roep lhv.setWerkPlaats().
	@param wp
	 */
	public void werkPlaats (boolean wp) throws LuchthavenException
	{
		luchthaven.setWerkPlaats(wp);
	}

	/**
	Roep lhv.bewaar().
	Geef de exception door aan het frame, als die optreedt.
	@throws java.lang.IllegalStateException
	 */
	public void ok () throws LuchthavenException
	{
		luchthaven.bewaar();
		myFrame.dispose();
	}

	/**
	Sluit functie af.
	 */
	public void cancel ()
	{
		myFrame.dispose();
	}
}
