package sgjdohna.jbotsim.test.example1;

import jbotsim.Message;
import jbotsim.Node;

public class BasicNode extends Node{
 
	@Override
    public void onStart() {
        // Initialise the node variables
    }

    @Override
    public void onClock() {
        // code to be executed by this node in each round
    }

    @Override
    public void onMessage(Message message) {
        // processing of a received message
    }

    @Override
    public void onSelection() {
        // what to do when this node is selected by the user
    }
}