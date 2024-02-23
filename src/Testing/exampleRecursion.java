package Testing;

public class exampleRecursion {
	
	int i=1; 
	
	public void hello()
	{
		System.out.println("Hello");
		i++;
		{
			if(i<=10)
			{
				hello();
			}
		}
	}

	public static void main(String[] args) {
		
		exampleRecursion obj = new exampleRecursion();
		obj.hello();

	}

}
