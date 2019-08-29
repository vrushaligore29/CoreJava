
public class AccessInstanceVariableOutsideConst {

	int a;
	int b;
	int c;
	int d;

	AccessInstanceVariableOutsideConst(int a, int b) {
		c = a;
		d = b;
	}

	void disp() {
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		AccessInstanceVariableOutsideConst t = new AccessInstanceVariableOutsideConst(10, 20);
		t.disp();
	}
}
