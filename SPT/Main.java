import javax.swing.JButton;

import jbotsim.Clock;
import jbotsim.Node;
import jbotsim.Topology;
import jbotsim.ui.JTopology;
import jbotsim.ui.JViewer;


public class Main {
    public static void main(String[] args)
    {
        JButton button = new JButton("Start");
        button.setBounds(0,0,100,50);                            // necessary because JTopology uses a null Layout.
        button.addActionListener(new SPTstart());
        
         Clock.pause();
         Topology t = new Topology();
         Node.setModel("default", new SPTNode());
         JTopology jtp = (new JViewer(t)).getJTopology();
         jtp.add(button);
    }
}
