import java.applet.*;
import java.awt.*;
import java.util.*;

//<applet code=myTime width=300 height=300 ></applet>

public class myTime extends Applet implements Runnable 
{
    Thread t;
    public void start () {
        if (t==null) {
            t = new Thread(this);
            t.start();
        }
    }   
    public void run() {
        while(true) {
            repaint();
            try {
                t.sleep(1000);
            }
            catch (Exception e) {}
        }
    }
    public void paint(Graphics g) {
        Date obT = new Date();
        g.drawString(obT.getHours()+":"+obT.getMinutes()+":"+obT.getSeconds(), 100, 100);
    }
    public void stop () {
        t.stop();
        t = null;
    }
} 
