package Threading;

class A extends Thread {
	String s;
	public A(String str) {s=str;}
	public void run() {
		System.out.println("Thread: " + s + " started");
		for (int i = 1; i <= 4; i++) {
			System.out.println("\t From "+ s+" : i= " + i); 		}
		System.out.println("Exit from " + s);	}
}
public class ThreadPriority {
	public static void main(String args[]) {
		A threadA = new A("ThreadA");
		A threadB = new A("ThreadB");
		A threadC = new A("ThreadC");
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority() + 1);
		threadA.setPriority(Thread.MIN_PRIORITY);
	System.out.println("Started Thread A");
		threadA.start();
		System.out.println("Started Thread B");
		threadB.start();
		System.out.println("Started Thread C");
		threadC.start();
		System.out.println("End of main thread");
	}
}
