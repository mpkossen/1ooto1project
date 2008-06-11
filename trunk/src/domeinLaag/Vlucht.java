package domeinLaag;
import java.util.*;


public class Vlucht
{
   private static HashSet<Vlucht> alleVluchten = new HashSet<Vlucht>();
   private int vluchtNummer;
   private Vliegtuig vt;
   private Luchthaven bestemming;
   private Luchthaven vertrekpunt;
   private Calendar vertrekTijd;
   private Calendar aankomstTijd;
   private Calendar duur;
   private Boeking boeking;


   /** Controleert of het vliegtuig op het meegegeven tijdstip al een vlucht heeft.
    * @return true, als vliegtuig bezet. Anders false.
    */
   private static boolean isBezet(Vliegtuig vliegtuig, Calendar d){
	   boolean b = false;
	   for (Vlucht v : alleVluchten) {
			if (v.vt.equals(vliegtuig)) {
				if (v.geefVertrekTijd().after(d) && v.getAankomstTijd().before(d) )
				b = true;
			}
	   }
	   return b;
   }


   /**

    * Constructor bedoeld om in RegVluchtController te gebruiken.
    * de overige attributen worden dat met de zetmethoden gevuld.
    * @param vt
    * @param vertrekp
    */
   public Vlucht(Vliegtuig vt, Luchthaven vertrekp)
   {
    this.vt = vt;
    this.vertrekpunt = vertrekp;
   }

   /**
   	* Constructor bedoelt om test-objecten mee aan te maken.
	*/
   public Vlucht(Vliegtuig vt, Luchthaven vertrekp, Luchthaven best, Calendar vertrek, Calendar aankomst)
   {
	this.vt = vt;
	this.vertrekpunt = vertrekp;
	this.bestemming = best;
	this.vertrekTijd = (Calendar)vertrek.clone();
	this.aankomstTijd = (Calendar) aankomst.clone();
	alleVluchten.add(this);
   }


   /**
    * Controleer dat bestemming <> vertrekpunt.
    * @param bestemming
    */
   public void zetBestemming(Luchthaven bestemming)
   {
   	if(bestemming == vertrekpunt)
   		this.bestemming = bestemming;
   	else
   		throw new IllegalArgumentException("bestemming en vertrek zijn gelijk");

   }
   
   public Luchthaven geefBestemming()
   {
       return bestemming;
   }

   /**
    * Controleer dat de vertrektijd niet overlapt met een andere vlucht van het toestel.
    * @param tijd
    */
   public void zetVertrekTijd(Calendar tijd) throws VluchtException
   {
	Calendar vTijd = tijd;
	vTijd.setLenient(false);
	// Ter controle of het een juiste datum is. Gebeurt niet bij het zetten, maar bij het getten.
	try {
		Date datum = vTijd.getTime();
	} catch (IllegalArgumentException e){
		throw new VluchtException("Geen geldige datum!");
	}
   	if(!Vlucht.isBezet(vt,vTijd)){
   		vertrekTijd = (Calendar) vTijd.clone();
   	}
   	else
   		throw new VluchtException("vliegtuig reeds bezet op " + tijd.getTime());


   }

   public Calendar geefVertrekTijd(){
   	return vertrekTijd;
   }

   /**
    * Controleer dat aankomstTijd > vertrekTijd.
    * @param tijd
    */
   public void zetAankomstTijd(Calendar tijd) throws VluchtException
   {
	Calendar aTijd = tijd;
	aTijd.setLenient(false);
	// Ter controle of het een juiste datum is. Gebeurt niet bij het zetten, maar bij het getten.
	try {
		Date datum = aTijd.getTime();
	} catch (IllegalArgumentException e){
		throw new VluchtException("Geen geldige datum!");
	}
    if(aTijd.before(vertrekTijd))
    	aankomstTijd = (Calendar) aTijd.clone();
   	else
   		throw new VluchtException("aankomsttijd voor vertrektijd");
   }

   public Calendar getAankomstTijd(){
	   return aankomstTijd;
	  }

   public Luchthaven geefVertrekpunt()
   {
       return vertrekpunt;
   }
   
   public void setBoeking(Boeking b)
   {
       this.boeking = b;
   }
   
   public Boeking getBoeking()
   {
       return boeking;
   }
   
   public void setVliegtuig(Vliegtuig v)
   {
       this.vt = v;
   }
   
   public Vliegtuig getVliegtuig()
   {
       return vt;
   }
   /**
    * Controleer of alle gegevens gezet zijn. Zo ja, bewaar de vluchtgegevens.
    */
   public void bewaar() throws VluchtException
   {
   		if(bestemming == null)
   			throw new VluchtException("geen geldige bestemming.");
   		else if(vertrekpunt == null)
			throw new VluchtException("geen geldig vertrekpunt.");
		else if(aankomstTijd == null)
			throw new VluchtException("geen geldige aankomsttijd.");
		else if(vertrekTijd == null)
			throw new VluchtException("geen geldige vertrektijd.");
   		else
			alleVluchten.add(this);

   }

	/**
	 * @return Naam van de bestemming.
	 */
	public String getBestemming() {
		return bestemming.geefNaam();
	}

}
