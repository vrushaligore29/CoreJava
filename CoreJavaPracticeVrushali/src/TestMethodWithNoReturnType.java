class Employee {

}

class Student {

}

public class TestMethodWithNoReturnType {

	public void m1(int i) {
		System.out.println("int=" + i);
	}

	public void m2(char c) {
		System.out.println("char=" + c);
	}

	public void m3(boolean b) {
		System.out.println("boolean=" + b);
	}

	public void m4(byte e) {
		System.out.println("byte=" + e);
	}

	public void m5(short g) {
		System.out.println("short=" + g);
	}

	public static void m6(float f) {
		System.out.println("float=" + f);
	}

	public void m7(long l) {
		System.out.println("long=" + l);
	}

	public void m8(double d) {
		System.out.println("double=" + d);
	}

	public void m9(String s) {
		System.out.println("String=" + s);
	}

	public void m10(Employee e) {
       System.out.println("In m10 method");
	}

	public void m11(Student s) {
		System.out.println("In m11 method");
	}

	public static void main(String[] args) {
		TestMethodWithNoReturnType t = new TestMethodWithNoReturnType();
		t.m1(10);
		t.m2('A');
		t.m3(true);
		t.m4((byte) 6);
		t.m5((short) 12);
		/*t.m6(10.2f);*/
		TestMethodWithNoReturnType.m6(10.2f);  //static methods accessed using class name
		t.m7(20);
		t.m8(60);
		t.m9("Techsum");

		Employee e = new Employee();
		Student s = new Student();
		t.m10(e);
		t.m11(s);
	}
}
