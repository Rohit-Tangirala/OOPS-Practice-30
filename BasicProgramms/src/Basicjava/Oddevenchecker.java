package Basicjava;
import java.util.Scanner;
public class Oddevenchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to check even or odd");
 int num = sc.nextInt();
  if( num%2== 0) {
		 System.out.println("Number is even");

  }
  else
		 System.out.println("Number is odd");

	}

}
