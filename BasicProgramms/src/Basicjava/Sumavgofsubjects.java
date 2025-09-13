package Basicjava;
import java.util.Scanner;
public class Sumavgofsubjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter english marks:");
         int eng = sc.nextInt();
         System.out.println("Enter science marks:");
         int sien = sc.nextInt();
         System.out.println("Enter history marks:");
         int his = sc.nextInt();
         int sum = eng + sien + his;
         int avg = sum/3;
         System.out.println("Total marks are : " +sum);
         System.out.println("Average of 3 subjects are : " +avg);
	}

}
