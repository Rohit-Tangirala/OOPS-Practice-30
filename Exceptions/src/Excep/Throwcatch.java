package Excep;

public class Throwcatch {

static void checkAge(int Age) {
	if(Age < 18) {
		throw new ArithmeticException("Access denied, you must atleast 18 years old");
	}
	else
		System.out.println("Access granted, your old enough");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  checkAge(15);
  }
  catch(ArithmeticException e) {
	  System.out.println("Exception caught : " + e.getMessage());
  }
	}

}
