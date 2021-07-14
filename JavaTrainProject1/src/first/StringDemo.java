package first;

/*public class StringDemo {
	
	public static boolean palindromeCheck(String s) {
//		boolean result;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	   public static void main(String args[]) {
	      String z = "lal";
	      System.out.println(palindromeCheck(z));
	   }
	}*/
	/*
	Output
	hello. 
	*/
public class StringDemo{
	public static void main(String args[]){
		char[] helloArray = {'H', 'e', 'l', 'l', 'o'};
		String s = new String(helloArray);
		System.out.println(s);//Hello
		System.out.println(s.toUpperCase());//HELLO  
		System.out.println(s.toLowerCase());//hello  
		System.out.println(s);//Hello(no change in original) 
		s="  Sachin  ";  
		System.out.println(s);//  Sachin    
		System.out.println(s.trim());//Sachin
		s="Sachin";  
		System.out.println(s.startsWith("Sa"));//true  
		System.out.println(s.endsWith("n"));//true  
		System.out.println(s.charAt(0));//S  
		System.out.println(s.length());//6  
		int a=10;  
		s=String.valueOf(a);  
		System.out.println(s+10); 
	}
}

