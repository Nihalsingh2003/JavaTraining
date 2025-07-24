package com.aurionpro.thread.test;

import com.aurionpro.thread.model.Counter;

public class CounterTest {
public static void main(String[] args) throws InterruptedException {
	Counter count=new  Counter();
	Thread thread0=new Thread(count);
	Thread thread1=new Thread(count);
	thread0.start();
	thread1.start();
	thread0.join();
	thread1.join();
	
	System.out.println(count.count);
	
}
}
