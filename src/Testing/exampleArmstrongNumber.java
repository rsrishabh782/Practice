package Testing;

public class exampleArmstrongNumber {

	public static void main(String[] args) {
		
		int a;
		int c=0;
		int num = 153;
		int temp;
		
		temp=num;
		
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+a*a*a;
			
		}
		
		if(temp==c)
		{
			System.out.println("Number is Armstrong");
		}

		else
		{
			System.out.println("Number is not Armstrong");
		}
	}

}
