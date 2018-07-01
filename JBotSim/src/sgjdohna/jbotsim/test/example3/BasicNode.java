package sgjdohna.jbotsim.test.example3;


import jbotsim.Node;


public class BasicNode extends Node{
    
	
	@Override
	public void onStart(){        
		setDirection(Math.random()*2*Math.PI);
    }
	
    @Override
    public void onClock() {
    	move();
        wrapLocation();
    }

}