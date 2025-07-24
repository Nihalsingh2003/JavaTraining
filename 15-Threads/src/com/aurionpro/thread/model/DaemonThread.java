package com.aurionpro.thread.model;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Daemon Thread  is Running");
		
	}

}
