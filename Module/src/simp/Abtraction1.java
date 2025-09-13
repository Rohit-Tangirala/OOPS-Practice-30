package simp;
abstract class vehicle{
	abstract void start();
	void stop() {
		System.out.println("Vehicle is stopped");
	}
}
class Car extends vehicle{
	void start() {
		System.out.println("Car started");
	}
}
class Bus {
	void start() {
		System.out.println("Bus started");
	}
}
public class Abtraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car c = new Car();
 Bus b = new Bus();
  c.start();
  c.stop();
  b.start();
	}
}
