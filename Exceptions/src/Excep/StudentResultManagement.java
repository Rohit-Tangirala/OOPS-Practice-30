package Excep;
import java.util.Scanner;
public class StudentResultManagement {
	
	static class InvalidMarksException extends Exception {
		public InvalidMarksException(String message) {
			super(message);
		}
	}
	static void result(int marks) throws InvalidMarksException{
		if (marks < 0 || marks >100) {
			throw new  InvalidMarksException(" Check Entered Marks Again");
		}
		else {
			if (marks >= 90)
				System.out.println("Grade A : " + marks);
			else if (marks <90 && marks>= 75)
				System.out.println("Grade B : " + marks);
			else if (marks<75 && marks >=50)
				System.out.println("Grade C : " + marks);
			else
				System.out.println("Failed : ");
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks ");
        try {
        	
        	int marks = sc.nextInt();
        	result(marks);
        	
        }
        catch(InvalidMarksException e) {
        	System.out.println("Invalid : " + e.getMessage());
        }
        finally {
        	System.out.println("Result Processed ");
        }
	}

}
