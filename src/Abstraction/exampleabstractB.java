package Abstraction;

public class exampleabstractB extends exampleabstractA{

	public static void main(String[] args) {
		
		exampleabstractB obj = new exampleabstractB();
		obj.sum(50, 50);
		obj.substract(150, 50);

	}

	@Override
	public void sum(int a, int b) {
		
		int c= a+b;
		System.out.println(c);
	}

	@Override
	public void substract(int c, int d) {
		 int f = c-d;
		 System.out.println(f);
	}

}
