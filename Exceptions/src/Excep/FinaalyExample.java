package Excep;

public class FinaalyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		int num = 10/0;
		System.out.println("Result : " +num);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception caught : "+ e.getMessage());
	}
	finally {
		System.out.println("This block always executes");
	}

}
}
