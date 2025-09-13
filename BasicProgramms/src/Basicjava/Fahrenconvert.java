package Basicjava;
import java.util.Scanner;
public class Fahrenconvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Celcius the degree");
 float c= sc.nextFloat();
    float f = ( c * 9/5) + 32;
	 System.out.println("The converted degree to farenheit is " +f);

	}

}
