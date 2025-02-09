import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// <applet code = mouse4 height = 400 width = 400></applet>

public class mouse4 extends Applet implements  MouseMotionListener
{
    String msg = "Soumodip Das";
    int x = 30;
    int y = 30;
    public void init () {
        addMouseMotionListener(this);
    }
    public void mouseMoved (MouseEvent me) {
        x = me.getX();
        y = me.getY();
        repaint();
    }
    public void mouseDragged (MouseEvent me) {
    }
    public void paint(Graphics g) {
        Font obF = new Font("Elephant", Font.BOLD, 40);
        g.setFont(obF);
        Color obC = new Color(x, y, 0);
        g.setColor(obC);
        g.drawString(msg, x, y);
        g.drawString("X = " + x, x, y + 50);
        g.drawString("Y = " + y, x+210, y+50);
    } 
}
