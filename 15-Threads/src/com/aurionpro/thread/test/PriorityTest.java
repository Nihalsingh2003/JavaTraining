package com.aurionpro.thread.test;

import com.aurionpro.thread.model.Priority;

public class PriorityTest {
public static void main(String[] args) {
	new Priority("first",8).start();
	new Priority("second",4).start();
}
}
