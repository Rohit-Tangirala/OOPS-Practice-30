package Excep;
import java.util.Scanner;
public class OnlineShoppingSystem {
  static class InvalidQuantityException extends Exception{
	  public  InvalidQuantityException(String message) {
		  super(message);
	  }
  }
    static void billing(long amount) throws InvalidQuantityException {
    	if (amount >50000) {
    		throw new InvalidQuantityException("Limit has Exceeded");
    	}
    	else {
    		System.out.println("Order Confirmed");
    		System.out.println("Total Amount of Order: " + amount);
    	}
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.print("Scanned Amount of the order :");
     try {
    	 long Amount = sc.nextLong();
    	 billing(Amount);
     }
     catch(InvalidQuantityException e) {
    	 System.out.println("Error : " + e.getMessage());
     }
     finally {
    	 System.out.println("Thank you for Shopping with us ");
     }
	}

}
