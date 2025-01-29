import java.applet.*;
import java.awt.*;

//<applet code=FirstApplet width =500 height=500></applet>

public class A1 extends Applet {

    Font ob, ob1, ob2;

    public void init() {
        setBackground(Color.black);
        setForeground(Color.white);
        ob = new Font("algerian", Font.BOLD, 30);
    }

    public void paint(Graphics g) {
        g.setFont(ob);
        g.drawString("Soumodip Das", 100, 200);
        ob1 = new Font("bookman old style", Font.ITALIC, 50);
        g.setFont(ob1);
        g.setColor(Color.red);
        g.drawString("Soumodip Das Chagol", 100, 300);
        g.setColor(Color.yellow);
        ob2 = new Font("monotype corsiva", Font.BOLD, 80);
        g.setFont(ob2);
        g.drawString("Soumodip jali Programmer", 50, 600);
    }
}
