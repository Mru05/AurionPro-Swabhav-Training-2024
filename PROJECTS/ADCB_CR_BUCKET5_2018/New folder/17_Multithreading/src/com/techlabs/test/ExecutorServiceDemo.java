package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.model.Task;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		int coreCount=Runtime.getRuntime().availableProcessors();
		System.out.println("Available Processors = "+coreCount);
		
		ExecutorService service = Executors.newFixedThreadPool(1000);
		for(int i=0;i<100;i++)
		{
			service.execute(new Task());
		}
	}

}
