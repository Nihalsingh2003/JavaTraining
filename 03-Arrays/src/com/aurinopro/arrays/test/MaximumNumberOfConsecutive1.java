package com.aurinopro.arrays.test;

public class MaximumNumberOfConsecutive1 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 0, 1, 1, 1 };
		int maxCount = 0;
		int currentCount = 0;

		for (int result : array) {
			if (result == 1) {
				currentCount++;
				if (currentCount > maxCount) {
					maxCount = currentCount;
				}
			} else {
				currentCount = 0;
			}

		}
		System.out.println("The Maximum Number Of Consecutive 1s is: " + maxCount);
	}
}
