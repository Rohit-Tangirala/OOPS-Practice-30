package simp;
class nima {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

class doeg extends nima {
 void bark() {
     System.out.println("The dog barks.");
 }
}

class Puppy extends doeg {
 void weep() {
     System.out.println("The puppy weeps.");
 }
}

public class multilevelinheritance {
 public static void main(String[] args) {
     Puppy p = new Puppy();
     p.eat();   
     p.bark();  
     p.weep();  
 }
}
