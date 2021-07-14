package first;

class Stude{
    int rollno;
    static String college = "ITS";
    static void change(){      college = "BBDIT";      }
    Stude(int r){  rollno = r; }
    void display (){System.out.println(rollno+" "+college);}
   public static void main(String args[]){
      Stude s1 = new Stude (111);
      Stude s2 = new Stude (222);
      s1.display(); //111 ITS
      Stude.change();
       s1.display(); // 111 BBDIT
       s2.display(); // 222 BBDIT
   }
}
