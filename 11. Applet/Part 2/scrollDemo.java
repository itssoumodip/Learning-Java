import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// <applet code = scrollDemo height = 400 width = 400></applet>

public class scrollDemo extends Applet implements AdjustmentListener, MouseMotionListener {
    String msg1 = "";
    String msg2 = "";
    Scrollbar verticalSc, horizantalSc;
    public void init () {
        verticalSc = new Scrollbar(Scrollbar.VERTICAL, 0, 0, 0, 300);
        horizantalSc = new Scrollbar(Scrollbar.HORIZONTAL, 0,0,0,400);
        add(verticalSc);
        add(horizantalSc);
        verticalSc.addAdjustmentListener(this);
        horizantalSc.addAdjustmentListener(this);
        addMouseMotionListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        repaint();
    }
    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        horizantalSc.setValue(x);
        verticalSc.setValue(y);
        repaint();
    }
    public void mouseMoved(MouseEvent me) {
    }
    public void paint(Graphics g) {
        msg1 = "Vartical : "+ verticalSc.getValue();
        msg2 = "Horizontal : "+ horizantalSc.getValue();
        g.drawString(msg1, 6, 100);
        g.drawString(msg2, 6, 150);
        Font obF = new Font("Arial", Font.BOLD, 50);
        g.setFont(obF);
        g.drawString("Soumodip Das", horizantalSc.getValue(), verticalSc.getValue());
    }
}