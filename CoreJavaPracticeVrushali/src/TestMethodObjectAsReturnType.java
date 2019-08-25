
public class TestMethodObjectAsReturnType {

	Employee m1(){
		System.out.println("In m1 method");
		Employee e=new Employee();
		return e;
	}
	
	Student m2(){
		System.out.println("In m2 method");
		Student s=new Student();
		return s;
	}
	public static void main(String[] args) {
		TestMethodObjectAsReturnType t=new TestMethodObjectAsReturnType();
		t.m1();
		t.m2();
	}
}
