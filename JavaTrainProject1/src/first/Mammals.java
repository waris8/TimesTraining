package first;

class Mammals{
	public void hand_bones() {
		System.out.println("Not sure who: Does something");
	}
}
class Humans extends Mammals {
	public void hand_bones() {
		System.out.println("Humans : Does a lot of work");
	}
}
class Bats extends Mammals {
	public void hand_bones() {
		System.out.println("Bats : Flying work");
	}
}

