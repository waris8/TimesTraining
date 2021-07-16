
class DrawThread implements Runnable {
	Account account;
	int amt;

	public DrawThread(Account s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.withdraw(amt);
	}
}

