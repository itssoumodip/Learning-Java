import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// <applet code = Colour1 height = 500 width = 700></applet>

public class Colour1 extends Applet implements ActionListener
{
    TextField obT1, obT2, obT3;
    Button obB;
    public void init()
    {
        obT1 = new TextField(10);
        obT2 = new TextField(10);
        obT3 = new TextField(10);
        obB = new Button("Genarate Colour");
        obT1.setText("0");
        obT2.setText("0");
        obT3.setText("0");
        add(obT1);
        add(obT2);
        add(obT3);
        add(obB);
        obB.addActionListener(this);
    }
    public void actionPerformed (ActionEvent e)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        int x = Integer.parseInt(obT1.getText());
        int y = Integer.parseInt(obT2.getText());
        int z = Integer.parseInt(obT3.getText());
        if (x>255 || y>255 || z>255 || x<0 || y<0 || z<0)
        { 
            g.drawString("Invalid Colour Code !!", 50, 200);
            System.out.println("Invalid Colour Code !!");
        }
        else 
        {
            Color obC = new Color(x, y, z);
            setBackground(obC);   
        }
    }
}
