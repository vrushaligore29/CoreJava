
public class ConstructorChaining1 {
	ConstructorChaining1() {
		this("sayali");
		System.out.println("0 arg constructor");
	}

	ConstructorChaining1(int a, int b) {
		System.out.println("2 arg constructor");
	}

	ConstructorChaining1(String s) {
		this(10, 20);
		System.out.println("1 arg constructor");
	}

	public static void main(String[] args) {
		ConstructorChaining1 t = new ConstructorChaining1();
	}
}
