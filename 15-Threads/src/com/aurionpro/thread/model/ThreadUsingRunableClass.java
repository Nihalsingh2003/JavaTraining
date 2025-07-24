package com.aurionpro.thread.model;

public class ThreadUsingRunableClass implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
		
	}

}
