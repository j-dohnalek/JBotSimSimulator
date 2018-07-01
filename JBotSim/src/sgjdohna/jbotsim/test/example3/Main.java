package sgjdohna.jbotsim.test.example3;

import jbotsim.Link;
import jbotsim.Topology;
import jbotsim.event.ConnectivityListener;
import jbotsim.ui.JViewer;


public class Main {
	
	public static void main(String[] args){
        
		Topology tp = new Topology();
        tp.setDefaultNodeModel(BasicNode.class);
        new JViewer(tp);
        new Listener(tp);
        tp.addNode(new BasicNode());
        
    }

}

class Listener implements ConnectivityListener{
	
	
	public Listener(Topology tp) {
		tp.addConnectivityListener(this);
	}

	@Override
	public void onLinkAdded(Link arg0) {
		
		System.out.println("Link Added");
		
	}

	@Override
	public void onLinkRemoved(Link arg0) {
		
		System.out.println("Link Removed");
		
	}
	
}
