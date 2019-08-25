
public class TestMethodObjectAsReturnType1 {

	Employee m1(Employee e) {
		System.out.println("In m1 method");
		return e;
	}

	Student m2(Student s) {
		System.out.println("In m2 method");
		return s;

	}

	public static void main(String[] args) {
		TestMethodObjectAsReturnType1 t = new TestMethodObjectAsReturnType1();

		Employee e = new Employee();
		t.m1(e);

		Student s = new Student();
		t.m2(s);

	}
}
