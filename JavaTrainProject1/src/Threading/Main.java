package Threading;

class MyThread3 implements Runnable { 
	String ss;
	public MyThread3(String S)	{  ss=S;	}
    public void run() {
		for(int i=0;i<10;i++)
			System.out.println(ss + " thread is running ... with Stage " + i);
    }		
}
public class Main { 		
        public static void main(String [] args  ) {
		     Thread t1 = new Thread(new MyThread3("t1"));
		     Thread t2 = new Thread(new MyThread3("t2"));
		     t1.run(); 
		     t2.run();
       }
}
