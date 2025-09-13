package simp;
abstract class Shape {
	abstract void draw();
	void display() {
		System.out.println("This is a shape");
	}
}
class circle extends Shape{
   void draw() {
	   System.out.println("Drawing a circle");
   }
}
public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   circle c = new circle();
   Shape d = new circle(); // upcasting
  c.draw();
  c.display();
	}

}
