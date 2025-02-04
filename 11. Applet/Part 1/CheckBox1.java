import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// <applet code = CheckBox1 width = 900 height = 500></applet>

public class CheckBox1 extends Applet implements ItemListener
{
    Checkbox obC1, obC2, obC3, obC4;
    String msg;
    Font obF;

    public void init()
    {
        obC1 = new Checkbox("Windows XP", true);
        obC2 = new Checkbox("Windows 7");
        obC3 = new Checkbox("Windows 8");
        obC4 = new Checkbox("Windows 10");

        add(obC1);
        add(obC2);
        add(obC3);
        add(obC4);

        obC1.addItemListener(this);
        obC2.addItemListener(this);
        obC3.addItemListener(this);
        obC4.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) 
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        obF = new Font("Elphant", Font.BOLD, 40);
        g.setFont(obF);
        msg = "";
        g.drawString("Current State : ", 10, 100);
        msg = "Windows XP's State = "+obC1.getState();
        g.drawString(msg, 10, 150);
        msg = "Windows 7 State = "+obC2.getState();
        g.drawString(msg, 10, 200);
        msg = "Windows 8 State = "+obC3.getState();
        g.drawString(msg, 10, 250);
        msg = "Windows 10 State = "+obC4.getState();
        g.drawString(msg, 10, 300);
    }
}
