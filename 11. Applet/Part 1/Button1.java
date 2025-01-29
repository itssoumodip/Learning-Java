import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code=Button1 width=500 height=500></applet>
public class Button1 extends Applet implements ActionListener
{
  Button ob1,ob2,ob3;
  String x;
  Font ob;
  public void init()
   {
      x="";
      ob1=new Button("True");
      add(ob1);
      ob1.addActionListener(this);
      ob2=new Button("False");
      add(ob2);
      ob2.addActionListener(this);
      ob3=new Button("Undecided");
      add(ob3);
      ob3.addActionListener(this);
   }
  public void actionPerformed(ActionEvent ae)
   {
      x=ae.getActionCommand();
      if(x.equals("True"))
         x="You pressed Yes option";
      else if(x.equals("False"))
         x="You pressed False option";
      else if(x.equals("Undecided"))
         x="You pressed undecided option";
      repaint();
   }
  public void paint(Graphics obj)
  {
      ob =new Font("Verdana",Font.BOLD,40);
      obj.setFont(ob);
      obj.drawString(x,50,100);
      System.out.print(x);
  }
}





