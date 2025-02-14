import java.awt.*;

public class multiMedia extends Frame {
    String menuSelection = "Select a menu Item";

    public static void main(String soumo[]) {
        multiMedia obM = new multiMedia();
    }

    public multiMedia() {
        super("MultiMedia"); // sets window title
        pack(); // adjust window size based on the components
        // deprecated keyword -> resize(600, 600); //set the window size
        resize(600, 600);
        menus();
        show(); // display the Frame
    }

    void menus() {
        MenuBar mb = new MenuBar(); // creates the menu bar
        Menu s = new Menu("Shape");
        s.add("Line");
        s.add("Oval");
        s.add("Rectangle");
        s.add("Square");
        mb.add(s);
        Menu q = new Menu("Quatation");
        q.add("Be sure u are not going to do this");
        q.add("This is the time to update yourself");
        q.add("Don not waste your time");
        q.add("This is the time for crisis");
        q.add("Work hard");
        mb.add(q);
        Menu e = new Menu("Exit");
        mb.add(e);

        setMenuBar(mb); // sets the created menu bar to the Frame
    }

    public void paint(Graphics g) {
        g.drawString(menuSelection, 100, 100);
    }

    public boolean handleEvent (Event ea) {
        if (ea.id == Event.WINDOW_DESTROY) {
            System.out.println("Window Destroy !!");
            System.exit(0);
            return true;
        }
        // ea.id == Event.ACTION_EVENT → Checks if the event is an action event (e.g., a button click or menu item selection).
        // ea.target instanceof MenuItem → Ensures that the event was triggered by a menu item (not other UI elements like buttons or text fields).
        else if (ea.id == Event.ACTION_EVENT && ea.target instanceof MenuItem) {
            if ("Exit".equals(ea.arg)) {
                System.out.println("Exit Clicked");
                System.exit(0);
                return true;
            }
            else {
                menuSelection = "you selected " + ea.arg.toString()+".";
                repaint();
                return true;
            }
        }
        else
            return false; 
    }
}
