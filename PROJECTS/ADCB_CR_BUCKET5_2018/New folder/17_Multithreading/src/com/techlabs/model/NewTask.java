package com.techlabs.model;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NewTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return (int) Math.random()*123;
    }
}

//import java.util.concurrent.Callable;
//
//public class NewTask implements Callable<Integer>{
//
//	@Override
//	public Integer call() throws Exception {
//		
//		return (int)Math.random();
//	}
//
//}
