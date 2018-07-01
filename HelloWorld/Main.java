
import jbotsim.Topology;
import jbotsim.ui.JViewer;
import java.swing.*;

public class Main {

    public static void main(String[] args){

        JButton button = new JButton("Start");
        button.setBounds(0,0,100,50);
        button.addActionListener(new SPTstart());

        Clock.pause();

        Topology t = new Topology();
        Node.setModel("default", new SPTNode());
        JTopology jtp = (new JViewer(t)).getJTopology();
        jtp.add(button);

    }

}

class SPTstart implements ActionListener{

    public void actionPerformed(ActionEvent arg0) {
        Clock.resume();
        //System.out.println("test");
    }

}
