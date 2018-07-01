package sgjdohna.jbotsim.test.example1;

import jbotsim.Topology;
import jbotsim.ui.JViewer;

public class Main {
	
	public static void main(String[] args){
    
		Topology tp = new Topology(800, 600);
        tp.setDefaultNodeModel(BasicNode.class);
        new JViewer(tp);
        
        
        tp.addNode(-1, -1, new BasicNode());
        tp.addNode(-1, -1, new BasicNode());
        
	}

}
