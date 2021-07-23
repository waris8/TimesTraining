package Threading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
	private static AtomicInteger at = new AtomicInteger(0);

	static class MyRunnable implements Runnable {
		private int myCounter;
		private int myPrevCounter;
		private int myCounterPlus5;
		private boolean isNine;

		public void run() {
			myCounter = at.incrementAndGet();
			System.out.println("Thread " + Thread.currentThread().getId() + "  / Counter : " + myCounter);
			myPrevCounter = at.getAndIncrement();
			System.out.println("Thread " + Thread.currentThread().getId() + " / Previous : " + myPrevCounter);
			myCounterPlus5 = at.addAndGet(5);
			System.out.println("Thread " + Thread.currentThread().getId() + " / plus 5 : " + myCounterPlus5);
			isNine = at.compareAndSet(9, 3);
			if (isNine) {
				System.out.println("Thread " + Thread.currentThread().getId()
						+ " / Value was equal to 9, so it was updated to " + at.intValue());
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
	}
}
