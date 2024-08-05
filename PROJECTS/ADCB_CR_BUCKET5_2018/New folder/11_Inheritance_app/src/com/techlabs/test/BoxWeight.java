package com.techlabs.test;

import com.techlabs.model.Box;

public class BoxWeight extends Box{
	private int weight;
	public BoxWeight(int width, int depth, int height) {
		super(width, depth, height);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + ", Width()=" + getWidth() + ", Depth()=" + getDepth()
				+ ", Height()=" + getHeight() + "]";
	}
	
	

	
	
	
	

}
