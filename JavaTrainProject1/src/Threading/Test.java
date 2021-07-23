package Threading;

public class Test {
	  public static void main(String args[]) {
	    Runnable r = () -> System.out.println("Running");
	    Thread thread = new Thread(r);
	    thread.start();
	  }
	}
