package Threading;

class MyThread1 implements Runnable { 
	String ss;
	public MyThread1(String S)	{  ss=S;	}
    public void run() {
		for(int i=0;i<10;i++)
			System.out.println(ss + " thread is running ... with Stage " + i);
    }		
}
public class ThreadEx2 { 		
        public static void main(String [] args  ) {
		     Thread t1 = new Thread(new MyThread1("t1"));
		     Thread t2 = new Thread(new MyThread1("t2"));
		     t1.start();
		     t2.start();
       }
}

