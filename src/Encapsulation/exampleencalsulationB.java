package Encapsulation;

public class exampleencalsulationB {

	public static void main(String[] args) {

		exampleencalsulationA obj = new exampleencalsulationA();
		
		int num2 = obj.getA();
		System.out.println(num2);

		obj.setA(60);
		int num3 = obj.getA();
		System.out.println(num3);
		
		int num4 = obj.getB();
		System.out.println(num4);

		obj.setB(80);
		int num5 = obj.getB();
		System.out.println(num5);
		
	}

}
