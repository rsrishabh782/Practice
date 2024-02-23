package Testing;

public class reverseArray {

	public static void main(String[] args) {
		
		int[] ch = {1, 2, 3, 4};
		char[] ch1 = {'a', 'b', 'c', 'd'};
		
		System.out.println("Original Array");
		
		for(int i=0; i<=ch1.length-1;i++)
		{	
			System.out.print(ch1[i]);
		}

		System.out.println();
		
		System.out.println("Reverse Array");
		
		for(int i=ch1.length-1;i>=0;i--)
		{ 
			System.out.print(ch1[i]);
		}
		
		System.out.println();
		
	}

}
