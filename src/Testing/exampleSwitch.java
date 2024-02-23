package Testing;

import java.util.Scanner;

public class exampleSwitch {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=(int) sc.nextDouble();*/
		int i =20;
		
		switch (i) {
		case 1:
			System.out.println("long string");
			break;

		case 2:
			System.out.println("medium string");

		case 3:
			System.out.println("small string");
			
		default:
			System.out.println("Not Found");
			break;
		}
	}

}
