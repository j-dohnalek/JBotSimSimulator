import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jbotsim.Clock;

public class SPTstart implements ActionListener{

    public void actionPerformed(ActionEvent arg0) {
        Clock.resume();
        //System.out.println("test");
    }

} 