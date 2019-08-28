
public class TestParameterizedConstructor1 {

	int empid;
	String empname;

	TestParameterizedConstructor1(int empid, String empname) {
		System.out.println(empid);
		System.out.println(empname);
	}

	public static void main(String[] args) {
		TestParameterizedConstructor1 t1 = new TestParameterizedConstructor1(123, "sayali");
		TestParameterizedConstructor1 t2 = new TestParameterizedConstructor1(456, "vrushali");
	}

}
