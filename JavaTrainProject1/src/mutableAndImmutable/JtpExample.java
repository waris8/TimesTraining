package mutableAndImmutable;

public class JtpExample {  
    private String s;  
    JtpExample(String s) {  
    this.s = s;  
    }  
    public String getName() {  
    return s;  
    }  
    public void setName(String coursename) {  
    this.s = coursename;  
    }  
    public static void main(String[] args) {  
    JtpExample obj = new JtpExample("JavaTpoint");  
    System.out.println(obj.getName());  
// Here, we can update the name using the setName method.  
    obj.setName("Java Training");  
    System.out.println(obj.getName());  
    }  
    }  
