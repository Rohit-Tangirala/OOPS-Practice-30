package Basicjava;
public class Studentdetails {
 String name;
 int rollnumber;
 double marks;
 
  void displaydetails() {
	  System.out.print("Name :" + name);
	  System.out.println("Roll number:" + rollnumber);
	  System.out.println("Marks : " + marks);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Studentdetails aizen = new Studentdetails();
     aizen.name = "Meghamsh";
     aizen.rollnumber = 128;
     aizen.marks = 9.9;
	
	aizen.displaydetails();
	}
}
