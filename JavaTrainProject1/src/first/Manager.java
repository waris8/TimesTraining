package first;


class Manager extends Emp{
	private int bonus;
	public void getMngrData(String nm, int s, int conv, int bns) {
		//name = nm; //parent's private attributes are not accessible in child class
		getData(nm,s); //parent's public attributes are accessible in child class
		conveyance=conv;//parent's protected attributes are accessible in child class
		bonus=bns; //own private attributes accessible throughout the class 
	}	
public void printMngr() {
		print();
		System.out.println("Conveyance : " +conveyance+ " bonus : " + bonus +"\n");
	}	}