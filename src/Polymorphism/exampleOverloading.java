package Polymorphism;

public class exampleOverloading {

	public void method()
	{
		System.out.println("My Name is Rishabh Srivastava");
	}

	public static int method(int a)
	{
		int c = a*a;
		System.out.println(c);
		return c;

	}
	public static void main(String[] args) {

		exampleOverloading obj = new exampleOverloading();
		obj.method();
		exampleOverloading.method(5);

	}

}
