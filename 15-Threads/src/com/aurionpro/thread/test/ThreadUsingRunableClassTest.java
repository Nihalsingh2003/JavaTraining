package com.aurionpro.thread.test;

import com.aurionpro.thread.model.ThreadUsingRunableClass;

public class ThreadUsingRunableClassTest {
public static void main(String[] args) {
	Thread thread0=new Thread(new ThreadUsingRunableClass());
	thread0.start();
}
}
