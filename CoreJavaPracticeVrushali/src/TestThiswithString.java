
public class TestThiswithString {

	String s="Techsum";
	
	void m1(String s){
		System.out.println(s);	
	}
	
	void m2(String s){
		System.out.println(this.s);
	}
	public static void main(String[] args) {
		TestThiswithString t=new TestThiswithString();
		t.m1("Software");
		t.m2("Solutions");
	}
}
