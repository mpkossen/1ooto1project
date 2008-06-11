package userInterfaceLaag;

import domeinLaag.Boeking;
import domeinLaag.Klant;
import domeinLaag.Vlucht;

public class OvBkPerVlContr
{
    private Vlucht vlucht;
    private Vector<Boeking> boekingen;
    private OvBkPerVlJFrame myFrame;
    
    public OvBkPerVlContr ()
    {
    }
    
    public OvBkPerVlContr (Vlucht vl)
    {
        this.vlucht = vl;
            
        myFrame = new OvBkPerVlJFrame(vlucht, boekingen, this);
   	myFrame.setVisible(true);
    }
    
    public void ok ()
    {
        myframe.dispose();
    }
}
