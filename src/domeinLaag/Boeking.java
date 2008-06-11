
package domeinLaag;

import java.util.Vector;

/**
 * Hierin worden boekingen geregeld. 
 */

public class Boeking
{
    private boolean roken;
    private int aantalPlaatsen;
    private Vector<Klant> klanten;
    private Vlucht vlucht;
    
    /**
     * Maakt een klanten vector aan.
     */
    public Boeking ()
    {
        this.klanten = new Vector<Klant>();
    }
    
	public Boeking (Vlucht vl, int ap, boolean rkn, Klant kl)
	{
		this.vlucht = vl;
		this.aantalPlaatsen = ap;
		this.roken = rkn;
		this.klanten = new Vector<Klant>();
		klanten.add(kl);
	}
	
	public Boeking (Vlucht vl, int ap, boolean rkn, Vector<Klant> kln)
	{
		this.vlucht = vl;
		this.aantalPlaatsen = ap;
		this.roken = rkn;
		this.klanten = kln;
	}
	
    /**
     * 
     * @param rkn is roken als het true is en niet roken als het false is.
     */
    // Setters
    public void setRoken (Boolean rkn)
    {
        this.roken = rkn;
    }
    
    /**
     * Deze methode controleert het aantal plaatsen en Roken/Niet roken en geeft vervolgens aan of het kan ja of nee.
     */
    //T.L. Deze Methode moet nog een Roken Check krijgen en een Aantal plaatsen Check
    public void setPlaatsen (int ap)
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
    public Vector<Klant> getAlleKlanten ()
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
    
    public void bewaar()
    {
    }
    
}

