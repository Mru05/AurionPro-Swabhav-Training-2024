package com.techlabs.test;

public class RunableThread implements Runnable{
	
	private Thread thread;
	
	public  RunableThread(String name) {
		thread = new Thread(this);
		thread.start();
		thread.setName(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
		
	}
	

}
