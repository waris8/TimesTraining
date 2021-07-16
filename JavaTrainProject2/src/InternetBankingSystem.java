
public class InternetBankingSystem {
	public static void main(String[] args) {
		Account accountObject1 = new Account(1000, "Abc");
		Thread t11 = new Thread(new DepoThread(accountObject1, 10000));
		Thread t12 = new Thread(new DrawThread(accountObject1, 2000));
		Thread t13 = new Thread(new BalThread(accountObject1));
		Account accountObject2 = new Account(5000, "Xyz");
		Thread t21 = new Thread(new DepoThread(accountObject2, 10000));
		Thread t22 = new Thread(new DrawThread(accountObject2, 2000));
		Thread t23 = new Thread(new BalThread(accountObject2));
		t11.start();
		t12.start();
		t13.start();
		t21.start();
		t22.start();
		t23.start();
	}
}

