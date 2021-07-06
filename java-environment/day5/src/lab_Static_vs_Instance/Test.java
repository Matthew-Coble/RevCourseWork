package lab_Static_vs_Instance;

public class Test {

	public static void main(String[] args) {
		A.staticCount = 2494;
		System.out.println("class A staticCount: " + A.staticCount);
		
		A a = new A();
		
		System.out.println(a.instanceCount);
		System.out.println(A.staticCount);
		
		A a2 = new A();
		
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		
		a.instanceCount = 15;
		
		System.out.println("object a instaceCount: " + a.instanceCount);
		System.out.println("object a2 instaceCount: " + A.staticCount);
	}
}
