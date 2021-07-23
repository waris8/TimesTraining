package Threading;

class MyThread8 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}
}
public class Main1 {
	public static void main(String[] args) {
		MyThread8 t = new MyThread8();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " in control");
			// Control passes to child thread
			Thread.yield();
			// After execution of child Thread main thread takes over
			// System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}