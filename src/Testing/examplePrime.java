package Testing;

import java.util.Scanner;

public class examplePrime {

	public static void main(String[] args) 

	{
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		
		int j;

		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(i + " is a prime number.");
		}
		else
		{
			System.out.println(i + " is not a prime number.");
		}
	}
}



