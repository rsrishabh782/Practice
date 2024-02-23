package Constructor;

public class exampleConstructor2 {


	public exampleConstructor2() {

		System.out.println("Rishabh");
	}

	public exampleConstructor2(int a, int b) {

		System.out.println(a+b);
				
		
	}

	public static void main(String[] args) {

		exampleConstructor2 obj = new exampleConstructor2();
		exampleConstructor2 obj2 = new exampleConstructor2(5, 4);
	}

}
