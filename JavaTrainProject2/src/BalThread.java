
class BalThread implements Runnable {
	Account account;

	public BalThread(Account s) {
		account = s;
	}

	public void run() {
		account.enquire();
	}
}
