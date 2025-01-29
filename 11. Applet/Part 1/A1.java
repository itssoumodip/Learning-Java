import java.applet.*;
import java.awt.*;

// <applet code = A1 width = 500 height = 500></applet>
public class A1 extends Applet
{
    Font ob, ob1, ob2;

    public void init()
    {
        setBackground(Color.black);
        setForeground(Color.white);
    }
    public void paint(Graphics g)
    {
        ob = new Font("Algerian", Font.BOLD, 30);
        g.setFont(ob);
        g.drawString("Santonu1",100,  50);
        g.drawString("Soumodip Das",100,  100);
        ob1 = new Font("Elephant", Font.ITALIC, 40);
        g.setFont(ob1);
        g.drawString("Soumodip", 100, 150);
        g.drawString("Santonu2", 100, 200);
        ob2 = new Font("Arial", 100, 40);
        g.setFont(ob2);
        g.drawString("Prodip", 100, 250);
    }
}
