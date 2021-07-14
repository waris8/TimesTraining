package first;

public class Stud1 {
	public static void main(String[] args) {
		ShortTermStudent john = new ShortTermStudent();
		john.setStud_id(0);
		john.setStud_name("john");
		john.setDuration(3);
		System.out.println(john.getDuration() + " " + john.getStud_name());
		LongTermStudent alice = new LongTermStudent();
		alice.setStud_name("alice");
		alice.setCourse("cs");
		System.out.println(alice.getStud_name() + "  " + alice.getCourse()) ;
	}
}
