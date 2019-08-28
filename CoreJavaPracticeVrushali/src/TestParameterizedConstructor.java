
public class TestParameterizedConstructor {

	int empid = 123;
	String empname = "sayali";

	TestParameterizedConstructor() {
		System.out.println(empid);
		System.out.println(empname);
	}

	public static void main(String[] args) {
		TestParameterizedConstructor t1 = new TestParameterizedConstructor();
		TestParameterizedConstructor t2 = new TestParameterizedConstructor();
	}
}
