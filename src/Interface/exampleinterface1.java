package Interface;

public class exampleinterface1 implements exampleinterface {

	public static void main(String[] args) {
		
		exampleinterface1 obj = new exampleinterface1();
		obj.add(10, 20);
		obj.substract(20, 10);
		obj.multiply(10, 20);

	}

	@Override
	public void add(int a, int b) {
		
		int g = a+b;
		System.out.println(g);
		
	}

	@Override
	public void substract(int c, int d) {
		
		int h = c-d;
		System.out.println(h);
		
	}

	@Override
	public void multiply(int e, int f) {
		
		int i = e*f;
		System.out.println(i);
		
	}

}
