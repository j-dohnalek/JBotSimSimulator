package sgjdohna.jbotsim.test.example2;

import jbotsim.Topology;
import jbotsim.ui.JViewer;

public class Main {

	public static void main(String[] args) {
	 
		Topology tp = new Topology();
	    tp.setDefaultNodeModel(MovingNode.class);
	    tp.setClockSpeed(100);
	    new JViewer(tp);
	    
	}
	
}
