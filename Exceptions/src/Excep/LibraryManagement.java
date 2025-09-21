package Excep;

public class LibraryManagement {
 
	static class BookNotAvailableException extends Exception{
		public BookNotAvailableException(String message) {
			super(message);
		}
    }
	static class LimitExceededExcpetion extends Exception{
		public LimitExceededExcpetion(String message) {
		super(message);
		}
	}
	static void Bookcheck(String name, int borrow, int copies) throws BookNotAvailableException, LimitExceededExcpetion{
		if(name != "Wings of Fire") {
			throw new BookNotAvailableException(" This Book is not Available");
		}
	
		if ( borrow > 3) {
				throw new LimitExceededExcpetion(" You cant borrow");
			}
		else {
				copies = copies-1;
				borrow = borrow+1;
				System.out.println(" Availabe Copies : "+ copies);
				System.out.println("Borrow Limit : " + borrow);
			}
		}
	
	public static void main(String[] args) {
	
   try {
	   Bookcheck("Geranimo Stiltun", 4,4);
   }
   catch(BookNotAvailableException e) {
	   System.out.println("No Book Found : " + e.getMessage());
   }
   catch(LimitExceededExcpetion e) {
	   System.out.println("Limit Exceeded : " + e.getMessage());
   }
	
	 try {
		   Bookcheck("Wings of Fire", 2,1);
	   }
	 catch(BookNotAvailableException e) {
		   System.out.println("No Book Found : " + e.getMessage());
	   }
	   catch(LimitExceededExcpetion e) {
		   System.out.println("Limit Exceeded : " + e.getMessage());
	   }
	   
     finally {
    	 System.out.println(" Transaction Completed");
     }
}
}
