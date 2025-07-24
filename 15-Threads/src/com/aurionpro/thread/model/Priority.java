package com.aurionpro.thread.model;

public class Priority extends Thread {
	public Priority(String name, int priority) {
		setName(name);
		setPriority(priority);
	}

	@Override
	public void run() {
		System.out.println(getName() + " is running " + getPriority());

	}
}
