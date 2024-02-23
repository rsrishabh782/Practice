package Testing;

public class thisExample {

	int i;
	String j;
	
	public thisExample(int i, String j) 
	
	{
		this.i = i;
		this.j = j;
			
	}
	
	public void display()
	{
		System.out.println(i+ " and " +j);
	}

	public static void main(String[] args) {
	
		thisExample obj = new thisExample(10, "Value");
		obj.display();

	}

	
}
