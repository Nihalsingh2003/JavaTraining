package com.aurionpro.Deque.model;

import java.util.ArrayDeque;
import java.util.Arrays;

public class DequeExample {
	public static void main(String[] args) {
		ArrayDeque<Integer> number = new ArrayDeque<>();
		number.add(1);
		number.addAll(Arrays.asList(2, 3, 4, 5));
		number.offer(2);
		number.remove();
		number.poll();
		System.out.println(number.element());
		System.out.println(number.peek());
		System.out.println(number);
	}
}
