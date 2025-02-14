import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code=whiteBoard height=500 width=500></applet>
public class whiteBoard extends Applet implements MouseListener, MouseMotionListener 
{
    int x, y;

    public void init() {
        x = 0;
        y = 0;
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mousePressed(MouseEvent me) {
        x = me.getX();
        y = me.getY();
    }
    public void mouseClicked(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseMoved(MouseEvent me) {}
    public void mouseDragged(MouseEvent me) {
        Graphics g = getGraphics();
        g.drawLine(x, y, me.getX(), me.getY());
        x = me.getX();
        y = me.getY();
    }
}
