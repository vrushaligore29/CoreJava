
public class TestVariables {

	int i = 10;
	static String s = "Techsum";

	void m1() {
		System.out.println("In Method");

	}

	void m2(int a) {
		System.out.println(a);
	}

	void m3(String s) {
		System.out.println(s);
	}

	void m4(char c) {
		System.out.println(c);
	}

	void m5(float f) {
		System.out.println(f);
	}

	void m6(double d) {
		System.out.println(d);
	}

	void m7(boolean b) {
		System.out.println(b);
	}

	void m8(short s) {
		System.out.println(s);
	}

	void m9(long l) {
		System.out.println(l);
	}

	void m10(byte e) {
		System.out.println(e);
	}

	public static void main(String[] args) {

		TestVariables t = new TestVariables();
		System.out.println(t.i);
		System.out.println(t.s);
		System.out.println(TestVariables.s);
		t.m1();

		// Integer
		t.m2(20);

		// String
		t.m3("Techsum");

		// Character
		t.m4('A');

		// Float
		t.m5(5.6f);

		// Double
		t.m6(6.6);

		// Boolean
		t.m7(true);

		// Short
		t.m8((short) 50);

		// Long
		t.m9(5L);

		// Byte
		t.m10((byte) 60);

	}

}
