import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// <applet code = Button1 width = 900 height = 500></applet>

public class Button1 extends Applet implements ActionListener
{
    Font obF; 
    String x;
    Button obB1, obB2, obB3;
    public void init()
    {
        obB1 = new Button("True");
        obB2 = new Button("False");
        obB3 = new Button("Undecided");

        add(obB1);
        add(obB2);
        add(obB3);

        obB1.addActionListener(this);
        obB2.addActionListener(this);
        obB3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        x = "";
        x = e.getActionCommand();
        if (x.equals("True"))
            x = "You Pressed YES Button";
        else if (x.equals("False"))
            x = "You Pressed FALSE Button";
        else if (x.equals("Undecided"))
            x = "You Pressed UNDECIDED Button";

        repaint();
    }

    public void paint(Graphics g)
    {
        obF = new Font("Verdana", Font.BOLD, 40);
        g.setFont(obF);
        g.drawString(x, 100, 100);
        System.out.println(x);
    }
}
