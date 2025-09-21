package Excep;

public class MultiplecatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 int a[] = new int[5];
    	 System.out.println(a[10]);
     }
     catch(ArithmeticException e) {
    	 System.out.println("Arithmetic Exception occurs");
     }
     catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("Array index is out of Bounds Exception");
     }
     catch(Exception e) {
    	 System.out.println("Parent Exception occurs");
     }
     System.out.println("Rest of the Code");
	}

}
