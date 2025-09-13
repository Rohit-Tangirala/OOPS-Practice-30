package simp;

//Student.java
 class Student {
 // private data members (encapsulation)
 private String name;
 private int age;

 // public getter method for name
 public String getName() {
     return name;
 }

 // public setter method for name
 public void setName(String newName) {
     name = newName;
 }

 // public getter method for age
 public int getAge() {
     return age;
 }

 // public setter method for age
 public void setAge(int newAge) {
     age = newAge;
 }
}
//Main.java
public class Encapsulation1 {
 public static void main(String[] args) {
     // create object of Student class
     Student s1 = new Student();

     // set values using setter methods
     s1.setName("John");
     s1.setAge(20);

     // get values using getter methods
     System.out.println("Name: " + s1.getName());
     System.out.println("Age: " + s1.getAge());
 }
}
