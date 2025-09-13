package Basicjava;
import java.util.Scanner;
public class Bankcustomerdetails {

	 String name;
	 int id;
	 String type;
	 long withdrawl;
	 long amount;
	 void details() {
		 System.out.println("Account name : " +name);
		 System.out.println("Account Id : " +id);
		 System.out.println("Bank Balance :" +amount);
		 System.out.println("Account type :" +type);
      
	 }
	 void withdrawld() {
		 if(amount > withdrawl) {
			 long b = amount - withdrawl;
		 System.out.println("Total balance is:" +b);
	 }
		 else {
			 System.out.println("Amount excedded");
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bankcustomerdetails rohit = new Bankcustomerdetails();
		rohit.name = "Rohit Tangirala";
		rohit.id = 185;
		rohit.type = "Savings";
		rohit.amount = 10000;
		System.out.println("Enter withdrawl amount:");
		rohit.withdrawl = sc.nextLong();
		
		   rohit.details();
		   rohit.withdrawld();
		   }

}
