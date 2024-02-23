package Testing;

import java.util.Scanner;

public class exampleTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int j = (int) sc.nextDouble();
			
		int table;
		
		for(int i=1; i<=10; i++)
		{
			table = i*j;
			System.out.println(j + " * " + i + " = " +table);
		}
		
	
	
	}

}
