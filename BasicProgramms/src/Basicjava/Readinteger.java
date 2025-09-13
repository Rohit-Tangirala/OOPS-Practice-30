package Basicjava;
import java.util.Scanner;
public class Readinteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int num = sc.nextInt();
		if(num>0)
		System.out.print("your number is positive ");
		else if(num<0)
			System.out.print("your number is negative ");
		else
			System.out.print("your number is Zero");
	}

}
