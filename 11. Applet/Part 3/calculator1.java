import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// <applet code = calculator1 height = 500 width = 500></applet>

public class calculator1 extends Applet implements ActionListener {
    TextField tx;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, sum, o1, o2, o3, o4, o5, c1;
    String text = "";
    int op = 0;
    double val1 = 0.0;
    double val2 = 0.0;
    double result = 0.0;

    public void init() {
        tx = new TextField(20);
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        o1 = new Button("+");
        o2 = new Button("-");
        o3 = new Button("x");
        o4 = new Button("/");
        o5 = new Button("%");
        sum = new Button("=");
        c1 = new Button("clear");

        add(tx);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(sum);
        add(o1);
        add(o2);
        add(o3);
        add(o4);
        add(o5);
        add(c1);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        sum.addActionListener(this);
        o1.addActionListener(this);
        o2.addActionListener(this);
        o3.addActionListener(this);
        o4.addActionListener(this);
        o5.addActionListener(this);
        c1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("+")) {
            op = 1;
            val1 = Double.valueOf(tx.getText());
            tx.setText("");
            text = "";
            return;
        } 
        if (str.equals("-")) {
            op = 2;
            val1 = Double.valueOf(tx.getText());
            tx.setText("");
            text = "";
            return;
        } 
        if (str.equals("x")) {
            op = 3;
            val1 = Double.valueOf(tx.getText());
            tx.setText("");
            text = "";
            return;
        } 
        if (str.equals("/")) {
            op = 4;
            val1 = Double.valueOf(tx.getText());
            tx.setText("");
            text = "";
            return;
        }
        if (str.equals("%")) {
            op = 5;
            val1 = Double.valueOf(tx.getText());
            tx.setText("");
            text = "";
            return;
        }
        if (str.equals("=")) {
            val2 = Double.valueOf(tx.getText());
            tx.setText("");
            result = doit(val1, val2, op);
            tx.setText(String.valueOf(result));
            return;
        }
        if (str.equals("clear")) {
            tx.setText("");
            text = "";
            return;
        }
        text = text + str;
        tx.setText(text);
    }

    public double doit(double d1, double d2, int op) {
        switch (op) {
            case 1:
                return (d1 + d2);
            case 2:
                return (d1 - d2);
            case 3:
                return (d1 * d2);
            case 4:
                return (d1 / d2);
            default:
                return (d1 % d2);
        }
    }
}
