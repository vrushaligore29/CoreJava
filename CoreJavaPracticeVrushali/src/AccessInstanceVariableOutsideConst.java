
public class AccessInstanceVariableOutsideConst {

	int a;
	int b;

	AccessInstanceVariableOutsideConst(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void disp() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		AccessInstanceVariableOutsideConst t = new AccessInstanceVariableOutsideConst(10, 20);
		t.disp();
	}
}
