import jbotsim.Clock;
import jbotsim.Message;
import jbotsim.Node;
import jbotsim.event.ClockListener;
import jbotsim.event.MessageListener;


public class SPTNode extends Node implements ClockListener, MessageListener{
	public SPTNode parent;
	public int id;
	public Boolean done;		// To signal end of execution.
    public static int count = 0;
	
	public SPTNode(){		// Constructor, assigns distinct ID's to nodes;
		this.id = count++;
		this.parent = null;
		this.done = Boolean.FALSE;
		Clock.addClockListener(this, 10);
		addMessageListener(this);
	}

       public void onClock(){	
       	
	 if(id==10 && !done) {		// Code for Leader node (whose ID=10)
	   this.parent = this;										// Root node has no parent.
	   for (Node nbr : getNeighbors()) { 						// Send message to all neighbours
	         send(nbr, id); 
	         }
	   this.setColor("green");   					// Root node is colored green
	 }
	 this.done = Boolean.TRUE;
       }

       public void onMessage(Message msg) {
	if(this.parent==null) {						// Code for non-leaders
	   this.parent = (SPTNode)msg.source;
	   this.getCommonLinkWith(parent).setColor("red");		// Color the tree edges red;
	   this.getCommonLinkWith(parent).setWidth(2);
	   for (Node nbr : getNeighbors()) { 					// Send a message to all neighbours except parent.
	         if(nbr != parent) send(nbr, id); 
	         }
	}	
      }
}
