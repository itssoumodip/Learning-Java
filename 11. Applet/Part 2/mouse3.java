import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// <applet code = mouse3 height=400 width=400></applet>

public class mouse3 extends Applet implements MouseListener
{
    Image obIm;
    public void init() {
        obIm = getImage(getCodeBase(), "images/0.png");
        addMouseListener(this);
    }
    public void mouseEntered (MouseEvent me){
        obIm = getImage(getCodeBase(), "images/1.png");
        repaint();
    }
    public void mouseExited (MouseEvent me) {
        obIm = getImage(getCodeBase(), "images/2.png");
        repaint();
    }
    public void mouseClicked (MouseEvent me) {
        obIm = getImage(getCodeBase(), "images/3.png");
        repaint();
    }
    public void mouseReleased (MouseEvent me) {
        obIm = getImage(getCodeBase(), "images/4.png");
        repaint();
    }
    public void mousePressed (MouseEvent me) {
        obIm = getImage(getCodeBase(), "images/5.png");
        repaint();
    }
    public void paint(Graphics g) {
        g.drawImage(obIm, 50, 50, this);
    }
}
