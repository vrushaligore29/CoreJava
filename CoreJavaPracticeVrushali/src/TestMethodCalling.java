
public class TestMethodCalling {

	void m1() {
		m2();
		System.out.println("In m1 method");
	}

	void m2() {
		System.out.println("In m2 method");
	}

	public static void main(String[] args) {
		TestMethodCalling t = new TestMethodCalling();
		t.m1();
	}

}
