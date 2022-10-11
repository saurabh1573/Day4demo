package abstractionassignment;

public abstract  class Vehicle {
	public Vehicle() {
		System.out.println("In vehicle constructor");
	}
	abstract void drive();
	void drive(int x) {
		System.out.println(x);
	}
}
