
//class Account { // the 'monitor'
//	int balance;
//
//	// if 'synchronized' is removed, the outcome is unpredictable
//	public synchronized void deposit(int deposit_amount) {
//		System.out.println("\nDeposit amount" + deposit_amount);
//		balance += deposit_amount;
//	}
//public synchronized void withdraw(int deposit_amount) {
//		System.out.println("\nWithdrawn amount" + deposit_amount);
//		balance -= deposit_amount;
//	}
//
//	public synchronized void enquire() {
//		System.out.println("\nBalance=" + balance);
//	}
//}
class Account { // the 'monitor'
	int balance;
	String name;
	public Account(int b, String n) {
		name=n; balance = b;
	}
	public Account() {}
	// if 'synchronized' is removed, the outcome is unpredictable
		public synchronized void deposit(int deposit_amount) {
			System.out.println("\nDeposit amount " + deposit_amount + "in account: "+ name);
			balance += deposit_amount;
		}

		public synchronized void withdraw(int deposit_amount) {
			System.out.println("\nWithdrawn amount" + deposit_amount+ "from account: "+ name);
			balance -= deposit_amount;
		}
	public synchronized void enquire() {
			System.out.println("\nBalance for Account: " + name + " = " + balance);
		}
	}









