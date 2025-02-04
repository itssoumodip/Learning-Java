import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// <applet code = RadioDemo height = 500 width = 700></applet>

public class RadioDemo extends Applet implements ItemListener
{
    Checkbox obC1, obC2, obC3, obC4;
    CheckboxGroup obGrp;
    String msg = "";
    Font obF1, obF2;

    public void init()
    {
        obGrp = new CheckboxGroup();
        obC1 = new Checkbox("Biriyani", obGrp, false);
        obC2 = new Checkbox("Fried Rice", obGrp, false);
        obC3 = new Checkbox("Rumali Ruti", obGrp, false);
        obC4 = new Checkbox("Chawomin", obGrp, false);
    
        add (obC1);
        add (obC2);
        add (obC3);
        add (obC4);

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
        msg = "Current Selection : ";
        obF1 = new Font ("Algerian", Font.BOLD, 30);
        g.setFont(obF1);
        g.drawString(msg, 5, 50);
        obF2 = new Font("Elephant", Font.BOLD, 15);
        g.setFont(obF2);
        msg = obGrp.getSelectedCheckbox().getLabel();
        if(msg.equals("Biriyani"))
           g.drawString("Whyyyy ????",5,100);
        else if(msg.equals("Fried Rice"))
           g.drawString("YAhh itss Gooddd",5,100);
        else if(msg.equals("Rumali Ruti"))
           g.drawString("NOOT Avilable",5,100);
        else if(msg.equals("Chawomin"))
           g.drawString("Good Choice",5,100);
        // g.drawString(msg,10,150);
    }

}
