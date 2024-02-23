package Testing;

public class examplearraySearch {

	public static void main(String[] args) {

		int arr[] = {1, 5, 7, 8, 9, 10};

		int element = 1;

		int counter = 1;

		int i;

		
		for(i=0; i<=arr.length-1; i++)
		{
			if(arr[i]==element)
			{
				System.out.println(element+ " is present at index " +i);
				counter++;
				break;
			}

		}

		if(counter!=2)
		{
			System.out.println(element + " is not present");
		}


	}

}
