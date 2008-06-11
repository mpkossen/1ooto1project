package domeinLaag;
import java.util.HashSet;
import java.util.TreeMap;


public class Land
{
   private String naam;
   private int code;
   /** Alle luchthavens binnen het land */
   private HashSet<Luchthaven> lh;
   private static HashSet<Land> alleLanden = new HashSet<Land>();

   /**
   @param naam
   @param code
	*/
   public Land(String nm, int cd)
   {
    naam = nm;
    code = cd;
    lh = new HashSet<Luchthaven>();
    alleLanden.add(this);
   }

   public String geefNaam()
   {
	return naam;
   }

   /**
   @return int
    */
   public int geefCode()
   {
    return 0;
   }

   /**
   @return java.util.TreeMap een TreeMap met naam als key en een referentie naar het land als value.
   */
   public static TreeMap<String, Land> geefAlleLanden()
   {
	TreeMap<String, Land> landMap = new TreeMap<String, Land>();
	for (Land l : alleLanden) {
		String nm = l.geefNaam();
		landMap.put(nm,l);
	}
	return landMap;
   }

   /** Voegt een Luchthaven toe aan lh. */
   public void addLuchthaven(Luchthaven lhv) {
   	lh.add(lhv);
   }

   /**
   @return java.util.TreeMap een TreeMap met naam als key en een referentie naar het land als value.
   */
   public TreeMap<String, Luchthaven> geefLuchthavens()
   {
	TreeMap<String, Luchthaven> luchthavenMap = new TreeMap<String, Luchthaven>();
	for (Luchthaven l : lh){
		String nm = l.geefNaam();
		luchthavenMap.put(nm,l);
	}
	return luchthavenMap;
   }
}

