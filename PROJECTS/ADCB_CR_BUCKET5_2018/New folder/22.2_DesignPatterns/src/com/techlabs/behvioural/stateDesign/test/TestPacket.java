package com.techlabs.behvioural.stateDesign.test;

import com.techlabs.behvioural.stateDesign.model.Ordered;
import com.techlabs.behvioural.stateDesign.model.Packet;

public class TestPacket {
    public static void main(String[] args) {
        Packet packet = new Packet();
        
        // Initially, packet is in Ordered state
        packet.printCurrentStatus();
        
        // Transition to Received state
        packet.goToNextState();
        packet.printCurrentStatus();
        
        // Transition to Delivered state
        packet.goToNextState();
        packet.printCurrentStatus();
        
        // Attempt to go to next state from Delivered (should not change state)
        packet.goToNextState();
        packet.printCurrentStatus();
        
        // Go back to Received state
        packet.goToPreviousState();
        packet.printCurrentStatus();
        
        // Go back to Ordered state
        packet.goToPreviousState();
        packet.printCurrentStatus();
    }
}

