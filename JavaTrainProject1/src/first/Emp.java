package first;

class Emp {  //Encapsulated: Data Collected in single unit
	private String name;
	private int sal;
	protected int conveyance;
	public void getData(String nm, int s) {
		name = nm;
		sal = s;
	}	public void print() {
		System.out.println("Name : \"" +name+ "\" Salary : " + sal +"\n");
	}

}


