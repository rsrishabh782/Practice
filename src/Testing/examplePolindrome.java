package Testing;

public class examplePolindrome {

	public static void main(String[] args) {
		
		int r;
		int num=121;
		int  c=0;
		int temp;
		
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			c= (c*10)+r;
			num=num/10;
		}
		
		if(c==temp)
		{
			System.out.println("Number is polidrome");
		}
		
		else
		{
			System.out.println("Number is not polidrome");
		}
	}

}
