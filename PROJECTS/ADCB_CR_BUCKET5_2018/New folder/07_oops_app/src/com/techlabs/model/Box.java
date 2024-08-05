package com.techlabs.model;

public class Box {
	public int width;
	public int height;
	public int depth;
	
	public Box(int w,int h,int d) {
		width =w;
		height =h;
		depth =d;
		
		
	}
	public int getwidth() {
		return width;
	}
	public int getheight()
	{
		return height;
	}
	public int getdepth() {
		return depth;
	}
	public void initialize(int h,int d, int w) {
		
		height = h;
        depth=d;
        width=w;
	}
	public void  display(){
		
		System.out.println("HEIGHT = "+height);
		System.out.println("depth = "+depth);
		System.out.println("width = "+width);
		
	}

}
