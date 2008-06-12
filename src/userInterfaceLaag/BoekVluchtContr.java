
package userInterfaceLaag;

// Imports
import java.util.TreeMap;
import domeinLaag.Luchthaven;
import domeinLaag.Vlucht;

public class BoekVluchtContr
{
	// Attributes
	private BoekVluchtFrame myFrame;
	
	// Relations


	// Constructors
	public BoekVluchtContr ()
	{
		this.myFrame = new BoekVluchtFrame();
		myFrame.setVisible(true);
	}

	// Overige Methodes
	public void Vlucht ()
	{
		
	}
	
	public TreeMap<String, Vlucht> vertrekpEnBestemm (Luchthaven vertrekp, Luchthaven bestemm)
	{
		return null;
	}

	public void vlucht()
	{
		
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
		
	}
}
