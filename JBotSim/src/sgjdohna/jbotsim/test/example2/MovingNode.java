package sgjdohna.jbotsim.test.example2;

import jbotsim.Node;

public class MovingNode extends Node{
	
	double angle = 0;
	double amplitude = 10;
	
	@Override
    public void onStart(){
		
		amplitude = ((int)(Math.random() * 10)+ 1);
		this.setDirection(0); // Move straight to right
		
	}
    
	@Override
    public void onClock() {
		
		move();
        
        double x = this.getX() + 1;
        double y = this.getY();
        
        y = y + Math.sin(Math.toRadians(2 * Math.PI * angle++)) * amplitude;
        
        if(angle > 360)
        	angle = 0;
        
        moveNode(x, y);
        
        this.wrapLocation();
        
    }
	
	
	public void moveNode(double x, double y) {
		
		this.setLocation(x, y);
		
	}
}
