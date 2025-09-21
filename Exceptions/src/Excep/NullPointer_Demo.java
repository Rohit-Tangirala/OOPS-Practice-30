package Excep;
import java.util.*;
public class NullPointer_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    try {
    	 String s1 = null;
    	System.out.println(s1.charAt(0));
    }
    catch(NullPointerException e) {
    	System.out.println("Null Pointer Exception");
    }
    
	}

}
