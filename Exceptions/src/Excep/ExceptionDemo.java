package Excep;
import java.util.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int a =30, b=1;
               
              try {
            	  int c = a/b;
            	  System.out.println(c);
              }
              catch(ArithmeticException e) {
            	  System.out.println("Denominator must not be zero");
            	  
              }
	}

}
