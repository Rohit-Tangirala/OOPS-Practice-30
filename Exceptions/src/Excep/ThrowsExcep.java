package Excep;

public class ThrowsExcep {
	static void fun() throws IllegalAccessException{
		System.out.println("Inside fun() ");
		throw new IllegalAccessException("Demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  fun();
  }
  catch(IllegalAccessException e) {
	  System.out.println("Caught in main : /" + e.getMessage());
  }
	}

}
