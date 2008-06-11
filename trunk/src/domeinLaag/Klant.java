package domeinLaag;

import java.util.HashSet;

public class Klant
{
    private String naam;
    private String straat;
    private String plaats;
    private int huisNr;
    private static HashSet alleKlanten;

    public Klant()
    {

    }

    // Setters
    public void setNaam(String nm)
    {
        this.naam = nm;
    }

    public void setStraat(String st)
    {
        this.straat = st;
    }

    public void setPlaats(String pl)
    {
        this.plaats = pl;
    }

    public void setHuisNr(int hn)
    {
        this.huisNr = hn;
    }

    // Getters
    public String getNaam()
    {
        return naam;
    }
    
    public String getStraat ()
    {
        return straat;
    }
    
    public String getPlaats ()
    {
        return plaats;
    }
    
    public int getHuisNr ()
    {
        return huisNr;
    }
    
    public HashSet getAlleKlanten ()
    {
        return alleKlanten;
    }
}
