
package Function;

public class Func {
	
	public static void main(String[] args ) {
		hello();
		hello();
		hello();
		int x = four();
		System.out.println(four());
		printNumber(x);
		x = 1;
	}

	public static void hello() {
		System.out.println("Hello");
		return;
	}

	public static int four() {
		return 4;
	}

	public static void printNumber(int myNumber) {
		int y = 5;
		System.out.println(myNumber);
	}

}

