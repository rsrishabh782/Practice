package Inheritance;

public class exampleInheritance2 extends exampleInheritance1{

	public void B()
	{
		c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {

		exampleInheritance2 obj = new exampleInheritance2();
		obj.B();
		exampleInheritance1 obj1 = new exampleInheritance1();
		obj1.A();
	}

}
