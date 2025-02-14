import java.applet.*;
import java.awt.*;

//<applet code = dataSheet height = 400 width = 400></applet>

public class dataSheet extends Applet {

    Label l1, l2, l3, l4, l5, l6, l7;
    TextField t1, t2, t3, t4, t5, t6, t7;

    public void init() {

        l1 = new Label("Name");
        t1 = new TextField(20);

        add(l1);
        add(t1);

        l2 = new Label("Address");
        t2 = new TextField(20);

        add(l2);
        add(t2);

        l3 = new Label("Basic");
        t3 = new TextField(20);

        add(l3);
        add(t3);

        l4 = new Label("HRA");
        t4 = new TextField(20);

        add(l4);
        add(t4);

        l5 = new Label("TA");
        t5 = new TextField(20);

        add(l5);
        add(t5);

        l6 = new Label("DA");
        t6 = new TextField(20);

        add(l6);
        add(t6);

        l7 = new Label("Total");
        t7 = new TextField(20);

        add(l7);
        add(t7);

        t1.setText("");
        t2.setText("");
        t3.setText("0");
        t4.setText("0");
        t5.setText("0");
        t6.setText("0");
        t7.setText("0");

    }

    public void paint(Graphics g) {
        double hra, ta, da, total;
        double bs = Double.valueOf(t3.getText());
        hra = (bs * 0.15);
        t4.setText(String.valueOf(hra));
        ta = (bs * 10) / 100;
        t5.setText(String.valueOf(ta));
        da = (bs * 12) / 100;
        t6.setText(String.valueOf(da));
        total = bs + hra + ta + da;
        t7.setText(String.valueOf(total));
    }

    public boolean action(Event e, Object o) {
        repaint();
        return true;
    }
}