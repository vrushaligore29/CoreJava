
public class TestConstructors {

	TestConstructors() {
		System.out.println("In default constructor");
	}

	TestConstructors(int i) {
		System.out.println("In parameterized constructor");
		System.out.println(i);
	}

	public static void main(String[] args) {
		TestConstructors t1 = new TestConstructors();
		TestConstructors t2 = new TestConstructors(10);
	}
}
