
package domeinLaag;

import java.util.Vector;

public class Boeking
{
    private boolean roken;
    private int aantalPlaatsen;
    private Vector<Klant> klanten;
    private Vlucht vlucht;
    
    public Boeking ()
    {
        this.klanten = new Vector<Klant>();
    }
    
    // Setters
    public void setRoken (Boolean rkn)
    {
        this.roken = rkn;
    }
    
    public void setAantalPlaatsen (int ap)
    {
        this.aantalPlaatsen = ap;
    }
    
    public void setVlucht (Vlucht vl)
    {
        this.vlucht = vl;
    }
    
    // Getters
    public Boolean getRoken ()
    {
        return roken;
    }
    
    public int getAantalPlaatsen ()
    {
        return aantalPlaatsen;
    }
    
    public Vlucht getVlucht ()
    {
        return vlucht;
    }
    public Vector<Klant> alleKlanten ()
    {
        return klanten;
    }
    
    // Adders
    public void addKlant (Klant kl)
    {
        if (!klanten.contains(kl))
        {
            klanten.add(kl);
        }
    }
    
    // Removers
    public void removeKlant (Klant kl)
    {
        if (klanten.contains(kl))
        {
            klanten.remove(kl);
        }
    }
}
