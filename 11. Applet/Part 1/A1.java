import java.applet.*;
import java.awt.*;

public class A1 extends Applet
{
    Font ob, ob1, ob2;

    public void init()
    {
        setBackground(Color.black);
        setForeground(Color.white);
        ob = new Font("Algerian", Font.BOLD, 30);
    }
    public void paint(Graphics g)
    {
        g.setFont(ob);
        g.drawString("Soumodip Das", 100, 200);
    }
}
