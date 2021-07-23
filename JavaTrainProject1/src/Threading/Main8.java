package Threading;

import java.util.*;
import java.util.concurrent.*;
//This worker thread implements call() of Callable to return a 
//Future Object which accepts only String type data
class WorkerThread1 implements Callable<String> {
	private String message;

	public WorkerThread1(String s) {
		this.message = s;
	}
	public String call() {
		processmessage(); // Thread sleeps for 2 seconds
		return Thread.currentThread().getName() + " message = " + message;
	}

	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Main8 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a pool of 5 threads
		List<Future<String>> list = new ArrayList<Future<String>>();
		Callable<String> callable = new WorkerThread1("callable obj");
		for (int i = 0; i < 10; i++) {
			Future<String> future = executor.submit(callable);
			// add Future to the list, we can get return value using Future
			list.add(future);
		}
for (Future<String> fut : list) {
			try {
				System.out.println(fut.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}
