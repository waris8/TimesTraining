package Threading;

public class ThreadPrg2 extends Thread {
	public void run() {
		System.out.println("Start.. ");
		try {
			Thread.sleep(300);
		} catch (InterruptedException ie) {
		}
		System.out.println("End.. ");
	}
public static void main(String[] args) {
		ThreadPrg2 c1 = new ThreadPrg2();
		ThreadPrg2 c2 = new ThreadPrg2();
		System.out.println("Main Start.. ");
		c1.start();
		try {
			c1.join(); // Waiting for c1 to finish
		} catch (InterruptedException ie) {
		}
		c2.start();
		System.out.println("Main Ends.. ");
	}
}
