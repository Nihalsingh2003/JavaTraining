package com.aurionpro.thread.model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterService {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();

		executor.submit(() -> {
			try {
				Thread.sleep(2000);
				System.out.println("Task 1 completed" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("Task 1 interrupted");

			}
		});

		executor.submit(() -> {
			try {
				Thread.sleep(4000);
				System.out.println("Task 2 completed" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("Task 2 interrupted");

			}

		});
		executor.submit(() -> {
			try {
				Thread.sleep(2000);
				System.out.println("Task 3 completed" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("Task 3 interrupted");

			}
		});
		executor.shutdown();

	}
}
