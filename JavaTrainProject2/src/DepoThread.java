
class DepoThread implements Runnable {
	Account account;
	int amt;

	public DepoThread(Account s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.deposit(amt);
	}
}
