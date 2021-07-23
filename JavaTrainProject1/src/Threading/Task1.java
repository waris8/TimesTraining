package Threading;

public class Task1 {
public static void main(String[] args) {
  final long timeInterval = 1000; // run in a second
  Runnable runnable = new Runnable() {
  public void run() {
    while (true) {// ------- code for task to run
        System.out.println("Hello !!");
      // ------- ends here
      try {
       Thread.sleep(timeInterval);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }      }    }    };
  Thread thread = new Thread(runnable);
  thread.start();
  }
}