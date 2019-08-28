
public class ConstructorChaining {

	ConstructorChaining() {
		this(10);
		System.out.println("0 arg constructor");
	}

	ConstructorChaining(int i) {
		System.out.println("1 arg constructor");
	}

	public static void main(String[] args) {
		ConstructorChaining t = new ConstructorChaining();
	}
}
