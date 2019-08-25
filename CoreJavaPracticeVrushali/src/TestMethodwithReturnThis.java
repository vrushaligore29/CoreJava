
public class TestMethodwithReturnThis {

	int a = 10;
	int b = 40;

	int m1(int a) {
		return a;
	}

	int m2(int b) {
		return this.b;

	}

	public static void main(String[] args) {
		TestMethodwithReturnThis t = new TestMethodwithReturnThis();
		System.out.println(t.m1(20));
		System.out.println(t.m2(20));
	}
}
