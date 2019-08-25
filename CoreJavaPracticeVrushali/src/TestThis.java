
public class TestThis {

	int a = 10;
	int b = 20;

	void m1(int a, int b) {
		System.out.println("a="+ this.a);
		System.out.println("b="+ this.b);
		System.out.println(this.a+this.b);
	}

	void m2(int a, int b) {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		TestThis t = new TestThis();
		t.m1(50, 60);
		t.m2(30,40);
	}
}
