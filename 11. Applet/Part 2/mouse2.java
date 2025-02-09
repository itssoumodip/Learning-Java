import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// <applet code = mouse2 height = 400 width = 400></applet>

public class mouse2 extends Applet implements MouseListener
{
    String str = "";
    Font obF;
    public void init() {
        addMouseListener(this);
    }
    public void mouseEntered (MouseEvent me){
        str = "Mouse Enetered";
        repaint();
    }
    public void mouseExited (MouseEvent me) {
        str = "Mouse Exited";
        repaint();
    }
    public void mouseClicked (MouseEvent me) {
        str = "Mouse Clicked";
        repaint();
    }
    public void mouseReleased (MouseEvent me) {
        str = "Mouse Released";
        repaint();
    }
    public void mousePressed (MouseEvent me) {
        str = "Mouse Pressed";
        repaint();
    }
    public void paint(Graphics g) {
        obF = new Font("Arial", Font.BOLD, 40);
        g.setFont(obF);
        g.drawString(str, 50, 50);
    }
}
