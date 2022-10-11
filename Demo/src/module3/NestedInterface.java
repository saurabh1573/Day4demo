package module3;

public interface NestedInterface {
	default void run() {
		System.out.println("in interface 1");
	}
	interface NestedInterface2{
		public default void call() {
			System.out.println("in interface 2");
		}
	}
}
