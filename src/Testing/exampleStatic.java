package Testing;

public class exampleStatic {

	String name;
	int rollno;
	static String college = "RRIMT";
	
	public exampleStatic(int r, String n)
	{
		name = n;
		rollno = r;
		
	}
	
	public void display()
	{
		System.out.println(name + " , " + rollno + " , " + college);
	}
	
	
	public static void main(String[] args) {
		
		exampleStatic s1 = new exampleStatic(1, "Rishabh");
		exampleStatic s2 = new exampleStatic(2, "Shilpi");
		
		s1.display();
		s2.display();

	}

}
