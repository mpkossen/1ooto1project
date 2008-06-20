
package domeinLaag;

// Imports
import java.util.Calendar;
import java.util.Date;
import java.util.TreeMap;

/**
 * Een object van deze klasse representeert één vliegtuig. Een vliegtuig behoort
 * aan een luchtvaartmaatschappij. Verder heeft een vliegtuig een vliegtuigtype,
 * een naam en een datum waarop deze in gebruik is genomen.
 */
public class Vliegtuig
{
	// Attributen
	private String naam = "";				// Naam van het vliegtuig.
	private Calendar datumInGebruik = null;	// Datum van in gebruikname.
	
	// Relaties
	private VliegtuigType vliegtuigType;	// Type van het vliegtuig.
	private LuchtvaartMaatschappij lvm;		// Eigenaar van het vliegtuig.

	// Constructors
	/**
	 * Constructor voor het aanmaken van een Vliegtuig. Wordt momenteel alleen in Main gebruikt om de boel te vullen.
	 * Er zijn geen Use Cases die objecten van deze klasse aanmaken of bewerken.
	 * @param lvm	de LuchtvaartMaatschappij die eigenaar is van het vliegtuig
	 * @param vtt	het VliegtuigType van het vliegtuig
	 * @param nm	de naam van het vliegtuig
	 * @param ig	de datum van ingebruikname
	 * @throws java.lang.IllegalArgumentException	als er iets mis is met de naam of de datum
	 */
	public Vliegtuig (LuchtvaartMaatschappij lvm, VliegtuigType vtt, String nm, Calendar ig) throws IllegalArgumentException
	{
		this.lvm = lvm;
		this.vliegtuigType = vtt;
		setInGebruik(ig);
		setNaam(nm);
		lvm.addVliegtuig(this);
	}	
	
	/**
	 * Constructor voor het aanmaken van een Vliegtuig. Alle andere attributen
	 * en relaties worden later door de RegVliegtuigController gezet middels
	 * de setters.
	 * @param lvm	de LuchtvaartMaatschappij die eigenaar is van het vliegtuig
	 */
	public Vliegtuig (LuchtvaartMaatschappij lvm)
	{
		this.lvm = lvm;
	}
	
	// Setters
	/**
	 * Deze methode zet het type van het vliegtuig.
	 * @param vtt	het VliegtuigType van het Vliegtuig
	 */
	public void setVliegtuigType (VliegtuigType vtt)
	{
		this.vliegtuigType = vtt;
	}

	/**
	 * Deze methode zet de naam van het vliegtuig.
	 * Eerst wordt de naam getrimmed (whitespace eraf).
	 * Vervolgens wordt gecontroleerd of de naam niet al bestaat.
	 * Ook wordt gecontroleerd of er wel wat overblijft na de trim.
	 * @param nm	de naam van het vliegtuig
	 * @throws java.lang.IllegalArgumentException	als de naam al bestaat of ongeldig is
	 */
	public void setNaam (String nm) throws IllegalArgumentException
	{
		String nmTrim = nm.trim();
		TreeMap<String, Vliegtuig> alleVt = lvm.getVliegtuigen();
		Vliegtuig bestaandVliegtuig = alleVt.get(nmTrim);
		if (bestaandVliegtuig != null)
		{
			throw new IllegalArgumentException("Naam bestaat al!");
		}
		else if (nmTrim.length() == 0)
		{
			throw new IllegalArgumentException("Naam heeft geen geldige waarde!");
		}
		else
		{
			this.naam = nmTrim;
		}
	}

	/**
	 * Deze methode zet de datum van ingebruikname van het vliegtuig.
	 * Er wordt gecontroleerd of de datum wel bestaat.
	 * @param inGebruik	de datum waarop het vliegtuig in gebruik genomen is
	 * @throws java.lang.IllegalArgumentException	als de datum ongeldig is
	 */
	public void setInGebruik (Calendar inGebruik) throws IllegalArgumentException
	{
		Calendar datumIG = inGebruik;
		datumIG.setLenient(false);
		// Ter controle of het een juiste datum is.
		// Calendar doet dit niet bij het zetten, maar bij getTime() en dergelijke.
		try
		{
			Date datum = datumIG.getTime();
			datumInGebruik = (Calendar) inGebruik.clone();
		}
		catch (IllegalArgumentException e)
		{
			throw new IllegalArgumentException("Geen geldige datum!");
		}
	}

	// Getters
	/**
	 * Deze methode geeft het type van het vliegtuig.
	 * @return	het VliegtuigType van het Vliegtuig
	 */
	public VliegtuigType getVliegtuigType ()
	{
		return vliegtuigType;
	}
	
	/**
	 * Deze methode geeft de naam van het vliegtuig.
	 * @return	de naam van het Vliegtuig
	 */
	public String getNaam ()
	{
		return naam;
	}
	
	/**
	 * Deze methode geeft de capaciteit van het vliegtuig.
	 * Deze capaciteit is bekend bij het VliegtuigType.
	 * @return	een één-dimensionale array met twee elementen.
	 * Het eerste element is het aantal rokers plaatsen.
	 * Het tweede element is het aantal niet-rokers plaatsen.
	 */
	public int[] getCapaciteit ()
	{
		return vliegtuigType.getCapaciteit();
	}		
	
	// Overige Methodes
	/**
	 * Deze methode bewaart het vliegtuig door deze toe te voegen aan de luchtvaartmaatschappij.
	 * Dit gebeurt pas nadat gecontroleerd is of alle waarden gezet zijn.
	 * Zo niet: werp een IllegalStateException.
	 * Zo wel: roept lvm.addVliegtuig().
	 * @throws java.lang.IllegalStateException	als niet alle attributen zijn ingevuld.
	 */
	public void bewaar () throws IllegalStateException
	{
		if (vliegtuigType == null)
		{
			throw new IllegalStateException("Vliegtuigtype niet ingevuld!");
		}
		else if (naam.equals(""))
		{
			throw new IllegalStateException("Naam niet ingevuld!");
		}
		else if (datumInGebruik == null)
		{
			throw new IllegalStateException("Datum-in-gebruik niet ingevuld!");
		}
		else
		{
			lvm.addVliegtuig(this);
		}
	}
}
