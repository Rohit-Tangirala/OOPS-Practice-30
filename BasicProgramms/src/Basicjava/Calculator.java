package Basicjava;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
float num1 = sc.nextFloat();
System.out.println("Enter the 2nd number:");
float num2 = sc.nextFloat();
System.out.println("Enter your operation:");
 int ch = sc.nextInt();
  switch(ch) {
  case 1: 			 System.out.println("Addition is " +(num1+num2)); break;
  case 2: System.out.println("Subraction is " +(num1-num2)); break;
  case 3:  System.out.println("Multiplication is " +(num1*num2)); break;
  case 4:  System.out.println("Divison is " +(num1/num2)); break;
  case 5:  System.out.println("Modulus is " +(num1%num2)); break;
  }
	}

}
