import java.util.Vector;

import jbotsim.Clock;
import jbotsim.Link;
import jbotsim.Node;
import jbotsim.Topology;
import jbotsim.ui.JViewer;


public class RingMain {
	public static void main(String args[]){
		int nbNodes=30;
		if(args.length < 1) System.out.println("Usage: RingMain <size-of-the-ring>");
		else nbNodes = Integer.parseInt(args[0]);
		
		Topology t = new Topology();
		Vector<RingNode> vec= new Vector<RingNode>();
		for (int i=0; i<nbNodes; i++){
			RingNode node= new RingNode();
			node.disableWireless();
			node.RingSize = nbNodes;
			double angle=(2.0*Math.PI/nbNodes)*i;
			node.setLocation(300+Math.cos(angle)*200, 300+Math.sin(angle)*200);
			t.addNode(node);
			vec.add(node);			
		}
		for (int i=0; i<nbNodes-1; i++){
			t.addLink(new Link(vec.get(i), vec.get(i+1)));
			vec.get(i).right = vec.get(i+1);
			vec.get(i+1).left = vec.get(i);
		}
		t.addLink(new Link(vec.get(nbNodes-1),vec.get(0)));
		vec.get(nbNodes-1).right = vec.get(0);
		vec.get(0).left = vec.get(nbNodes-1);

		new JViewer(t);
	}
}
