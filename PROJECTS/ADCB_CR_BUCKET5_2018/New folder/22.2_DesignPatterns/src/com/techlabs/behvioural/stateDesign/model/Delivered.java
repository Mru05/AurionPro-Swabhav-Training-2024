package com.techlabs.behvioural.stateDesign.model;

public class Delivered implements IPacketState{

	@Override
    public void next(Packet packet) {
        packet.setState(new Delivered());
    }

    @Override
    public void current(Packet packet) {
        System.out.println("Packet is in Received state.");
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new Ordered());
    }

}
