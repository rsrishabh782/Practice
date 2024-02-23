package Testing;

public class exampleFibbnaciSeries {

	public static void main(String[] args) {
		
		int i;
		int j = 0;
		int k = 0;
		
		for (i=0;i<=200;i++)
		{
			if(i==0)
			{
				j=i;
			}
			if(i==1)
			{
				k=i;
			}
			if(i>1)
			{
				i=j+k;
				j=k;
				k=i;
			}
			if(i<=200)
			{
				System.out.println(i);
			}
		}

	}

}
