package com.techlabs.test;

import com.techlabs.thread.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread Thread1 = new MyThread("Thread1");
		MyThread Thread2 = new MyThread("Thread2");
		MyThread Thread3 = new MyThread("Thread3");
		
		Thread1.setPriority(Thread.MAX_PRIORITY);
		Thread2.setPriority(Thread.MIN_PRIORITY);
		Thread3.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println(Thread1.isAlive());
		System.out.println(Thread2.isAlive());
		System.out.println(Thread2.isAlive());
		System.out.println(Thread1);
		for(int i=5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         try {
			Thread1.join();
			Thread3.join();
			Thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println(Thread1.isAlive());
 		System.out.println(Thread2.isAlive());
 		System.out.println(Thread2.isAlive());
         
         
	}
	}

}
