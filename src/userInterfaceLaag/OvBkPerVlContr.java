package userInterfaceLaag;

import domeinLaag.Boeking;
import domeinLaag.Klant;
import domeinLaag.Vlucht;
import domeinLaag.Luchthaven;
import domeinLaag.LuchtvaartMaatschappij;

import java.util.Calendar;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Vector;

public class OvBkPerVlContr
{
    private LuchtvaartMaatschappij luchtvaartMaatschappij;
    private OvBkPerVlJFrame myFrame;
    
    private Luchthaven vertrekpunt;
    private Luchthaven aankomstpunt;
    private Calendar vertrektijd;
    private Vlucht vlucht;
    
    public OvBkPerVlContr ()
    {
    }
    
    public OvBkPerVlContr (LuchtvaartMaatschappij lvm)
    {
        this.luchtvaartMaatschappij = lvm;
        TreeMap<String, Luchthaven> luchthavens = Luchthaven.geefAlle();
        
        myFrame = new OvBkPerVlJFrame(luchthavens, this);
   	myFrame.setVisible(true);
    }    
    
    /*  Dit wordt aangeroepen door de ActionHandler van het vertrek veld.
     *  Als dit vertrek punt gezet wordt, moet de inhoud van de mogelijke
     *  Vertrek momenten veranderen gebaseerd op de Vertrek- en Aankomstpunten.
     *  Deze Vertrek momenten worden dan terug gegeven zodat de GUI die weer
     *  kan geven.
     */ 
    public TreeMap<Calendar, Vlucht> vertrek (String lhvnm)
    {
        TreeMap<String, Luchthaven> luchthavens = Luchthaven.geefAlle();
        this.vertrekpunt = luchthavens.get(lhvnm);
        
        HashSet<Vlucht> alleVluchten = Vlucht.vertrekpEnbestemm(vertrekpunt, aankomstpunt);
        
        TreeMap<Calendar, Vlucht> vluchten = new TreeMap<Calendar, Vlucht>();
        
        for (Vlucht vl: alleVluchten)
        {
            Calendar datumtijd = vl.geefVertrekTijd();
            vluchten.put(datumtijd , vl);
        }
        
        return vluchten;
    }
    
    public TreeMap<Calendar, Vlucht> bestemming (String lhvnnm)
    {
        TreeMap<String, Luchthaven> luchthavens = Luchthaven.geefAlle();
        this.aankomstpunt = luchthavens.get(lhvnnm);
        
        HashSet<Vlucht> alleVluchten = Vlucht.vertrekpEnbestemm(vertrekpunt, aankomstpunt);
        
        TreeMap<Calendar, Vlucht> vluchten = new TreeMap<Calendar, Vlucht>();
        
        for (Vlucht vl: alleVluchten)
        {
            Calendar datumtijd = vl.geefVertrekTijd();
            vluchten.put(datumtijd, vl);
        }
        
        return vluchten;           
    }

    public Object[][] vlucht (Vlucht vl)
    {
        this.vlucht = vl;
        Vector<Boeking> alleBoekingen = vlucht.getAlleBoekingen();
        int size = alleBoekingen.size();
        Object[][] boekingen = new Object[size][4];

        int i = 0;
        for (Boeking boeking : alleBoekingen)
        {
            boekingen[i][0] = boeking.getAlleKlanten().firstElement().getNaam();
            boekingen[i][1] = boeking.getAlleKlanten().firstElement().getPlaats();
            boekingen[i][2] = Integer.toString(boeking.getAantalPlaatsen());
            boekingen[i][3] = Boolean.toString(boeking.getRoken());
            i++;
        }
        
        return boekingen;
    }
    
    public void cancel ()
    {
        myFrame.dispose();
    }
    
    public void ok ()
    {
        myFrame.dispose();
    }
}
