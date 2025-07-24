package com.aurionpro.PriorityQueue.model;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> number = new PriorityQueue<Integer>();
		number.add(1);
		number.addAll(Arrays.asList(2, 3, 4, 5));
//		number.offer(7);
	number.remove();
//		number.poll();
//		System.out.println(number.element());
//		System.out.println(number.peek());
		
		System.out.println(number);
	}
}
