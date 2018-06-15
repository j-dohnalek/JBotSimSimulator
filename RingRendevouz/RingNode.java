import jbotsim.Clock;
import jbotsim.Message;
import jbotsim.Node;
import jbotsim.event.ClockListener;
import jbotsim.event.MessageListener;



public class RingNode extends Node implements ClockListener, MessageListener{
	public Node left;
	public Node right;
	public int RingSize;
	
	public RingNode(){
		//Add code here		
		
		Clock.addClockListener(this, 1);
		addMessageListener(this);

	}

	public void onClock() {

		//Add code here

	}
	
	public void onMessage(Message msg) {
		
		//Add code here
	
	}
	
	public Node neighbor(Direction d){
		if(d== Direction.LEFT)
			return left;
		else return right;
	}
	
}