package com.aurionpro.thread.test;

import com.aurionpro.thread.model.DaemonThread;

public class DaemonThreadTest {
	public static void main(String[] args) {
		Thread thread0 = new Thread(new DaemonThread());
		thread0.setDaemon(true);
		thread0.start();
		try {
			Thread.sleep(100); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
