
public class TestMethodWithReturnTypeAsPrimitive {

	public int m1(int i) {

		return i;

	}

	public char m2(char c) {

		return c;

	}

	public boolean m3(boolean b) {
		return b;
	}

	public float m4(float f) {
		return f;
	}

	public String m5(String s) {
		return s;
	}

	public static void main(String[] args) {
		TestMethodWithReturnTypeAsPrimitive t = new TestMethodWithReturnTypeAsPrimitive();
		int i = t.m1(10);
		char c = t.m2('A');
		boolean b = t.m3(true);
		float f = t.m4(5.6f);
		String s = t.m5("Techsum");

		System.out.println("int=" + i);
		System.out.println("char=" + c);
		System.out.println("boolean=" + b);
		System.out.println("String=" + s);

	}
}
