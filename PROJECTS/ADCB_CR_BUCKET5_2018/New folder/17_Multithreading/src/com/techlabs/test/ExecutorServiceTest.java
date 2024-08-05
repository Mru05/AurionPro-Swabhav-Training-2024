package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.techlabs.model.NewTask;
public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<Integer> future = service.submit(new NewTask());
        
        List<NewTask> task = new ArrayList<NewTask>();
        
        task.add(new NewTask());
        task.add(new NewTask());
        task.add(new NewTask());
        task.add(new NewTask());
        task.add(new NewTask());
        task.add(new NewTask());
        
        
        
        try {
//            Integer result = future.get();
//            System.out.println("Result: " + result);
        	int number = service.invokeAny(task);
        	System.out.println(number);
        	
        	List<Future<Integer>>future1=service.invokeAll(task);
        	
        	for(Future<Integer> newFuture : future1)
        	{
        		System.out.println(newFuture.get());
        	}
        	
        	
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
}

//public class ExecutorServiceTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ExecutorService service = Executors.newFixedThreadPool(10);
//		
//		Future<Integer> future = service.submit(new NewTask());
//		try {
//			System.out.println(future.get());
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//
//	}
//
//}
