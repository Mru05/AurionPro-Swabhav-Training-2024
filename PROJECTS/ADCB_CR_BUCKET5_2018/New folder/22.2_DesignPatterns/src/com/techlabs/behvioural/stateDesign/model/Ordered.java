package com.techlabs.behvioural.stateDesign.model;

public class Ordered implements IPacketState{

	@Override
    public void next(Packet packet) {
        packet.setState(new Received());
    }

    @Override
    public void current(Packet packet) {
        System.out.println("Packet is in Ordered state.");
    }

    @Override
    public void previous(Packet packet) {
        System.out.println("The packet is already in the initial state (Ordered).");
    }
	

}
