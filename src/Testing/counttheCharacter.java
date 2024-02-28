package Testing;

public class counttheCharacter {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		int count = 0;
		
		for(int i=0; i<=str.length()-1;i++)
		{
			if(str.charAt(i) !=0)
			{
				count++;
			}
					
		}
		System.out.println("number of count is : "+count);
	}

}
