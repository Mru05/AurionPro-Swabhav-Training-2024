package com.techlabs.thread;

public class MyThread extends Thread{
	
	public MyThread(String name) {//constructor
		super(name);  //naming a thread
		start();
	}
	
	public void run() {
		for (int i=5;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
