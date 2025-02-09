import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code = scrollDemo height = 400 width = 400></applet>

public class scrollDemo extends Applet implements AdjustmentListener, MouseMotionListener {
    String msg1 = "";
    String msg2 = "";
    Scrollbar varticalSc, horizantalSc;
    public void init () {
        varticalSc = new Scrollbar(Scrollbar.VARTICAL,0,0,0,300);
        horizantalSc = new Scrollbar(Scrollbar.HORIZONTAL, 0,0,0,300);
        add(varticalSc);
        add(horizantalSc);
        varticalSc.addAdjustmentListener(this);
        horizantalSc.addAdjustmentListener(this);
        addMouseListener(this);
    }
    public void  
}