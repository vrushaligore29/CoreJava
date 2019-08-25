
public class TestMethodWithReturnType {

	public int m1() {

		return 10;
	}

	public char m2() {

		return 'A';
	}

	public float m3() {

		return 5.6f;
	}

	public short m4() {

		return 4;
	}

	public byte m5() {

		return 6;
	}

	public boolean m6() {

		return true;
	}

	public long m7() {

		return 6;
	}

	public double m8() {

		return 6.6;
	}

	public String m9() {

		return "Techsum";
	}
	
	public void m10(){
		
		System.out.println("In method 10");
		
	}

	public static void main(String[] args) {

		TestMethodWithReturnType t = new TestMethodWithReturnType();

		System.out.println("Value of int=" + t.m1());
		System.out.println("Value of char=" + t.m2());
		System.out.println("Value of float=" + t.m3());
		System.out.println("Value of short=" + t.m4());
		System.out.println("Value of byte=" + t.m5());
		System.out.println("Value of boolean=" + t.m6());
		System.out.println("Value of long=" + t.m7());
		System.out.println("Value of double=" + t.m8());
		System.out.println("Value of string=" + t.m9());
        
        t.m10();
        
	}
}
