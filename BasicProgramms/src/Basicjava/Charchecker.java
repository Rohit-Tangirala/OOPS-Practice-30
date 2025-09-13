package Basicjava;
import java.util.Scanner;
public class Charchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the character :");
		 Scanner sc = new Scanner(System.in);
		 char check = sc.next().charAt(0);
		 if(check == 'a' || check == 'e' || check == 'i' || check =='o' || check == 'u') {
			 System.out.println("This character is a vowel");
		 }
		 else
			 System.out.println("This character is a consonant");

			 
	}

}
