package Basicjava;
import java.util.Scanner;

public class Datatypesreader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter byte value: ");
        byte b = sc.nextByte();
        System.out.print("Enter short value: ");
        short s = sc.nextShort();
        System.out.print("Enter int value: ");
        int i = sc.nextInt();
        System.out.print("Enter long value: ");
        long l = sc.nextLong();
        System.out.print("Enter float value: ");
        float f = sc.nextFloat();
        System.out.print("Enter double value: ");
        double d = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter char value: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter boolean value ");
        boolean bool = sc.nextBoolean();

        System.out.println("Values:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
