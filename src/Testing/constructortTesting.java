package Testing;

public class constructortTesting {
	
	
	int id;
	String name;
	
	public constructortTesting(int i, String j) 
	
	{
		id =i;
		name = j;
			
	}
	
	public void display()
	{
		System.out.println(id+ " and " +name);
	}

	public static void main(String[] args) {
	
		constructortTesting obj = new constructortTesting(10, "Value");
		obj.display();

	}

}
