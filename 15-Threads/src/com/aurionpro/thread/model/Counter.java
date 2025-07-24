package com.aurionpro.thread.model;

public class Counter implements Runnable {
	public int count = 0;

	public synchronized void increment() {
		count++;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			increment();
		}

	}

}
