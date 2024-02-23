package Polymorphism;

public class exampleOverriding1 extends exampleOverriding{

	public void method(int a, int b)
	{
		int c = a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		exampleOverriding obj = new exampleOverriding();
		obj.method(10, 5);
		exampleOverriding1 obj1 = new exampleOverriding1();
		obj1.method(10, 5);
	

	}

}
