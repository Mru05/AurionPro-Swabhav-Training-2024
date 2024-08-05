package com.techlabs.test;

import com.techlabs.thread.CallMe;
import com.techlabs.thread.CallerThread;

public class CallerThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMe target = new CallMe();
		CallerThread thread1 = new CallerThread("Hello",target);
		CallerThread thread2 = new CallerThread("Swabhav",target);
		CallerThread thread3 = new CallerThread("MRU",target);
		
		try {
			thread1.getThread().join();
			thread2.getThread().join();
			thread3.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
