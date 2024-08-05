package com.techlabs.behvioural.stateDesign.model;

public class Packet {
  private IPacketState state;
  
  public Packet()
  {
	  state = new Ordered();
  }
  public void setState(IPacketState state) {
	  
	  this.state = state;
	  
  }
  public void goToNextState() {
      state.next(this);
  }

  public void goToPreviousState() {
      state.previous(this);
  }

  public void printCurrentStatus() {
      state.current(this);
  }
  
  
}
