package first;

class Student {
	
	int stud_id;
	String stud_name;
	
	public String DisplayName() {
		return this.stud_name;
	}
	public void readName(String name) {
		this.stud_name = name;
	}
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student john = new Student();
		john.readName("gulam");
		System.out.println(john.DisplayName() + " " + john.stud_id);
	}

}
