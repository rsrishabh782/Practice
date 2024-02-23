package Testing;

public class reverseString {

	public static void main(String[] args) {
		
		String str = "Rishabh Srivastava";
		
		String str1 = "";
		
		for (int i=0;i<str.length();i++)
		{
			str1=str.charAt(i)+str1;
			
		}
		
		System.out.println("reverse string is " + str1);
	}

}
