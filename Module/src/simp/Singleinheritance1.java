package simp;
//Parent 
class Anima {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Child class
class dog extends Anima {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Main class
public class Singleinheritance1 {
 public static void main(String[] args) {
     dog d = new dog();

     
     d.eat();  
     d.bark();  
 }
}
