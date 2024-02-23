package Testing;

public class exampletwodimentionalArray {

	public static void main(String[] args) {
		 int arr [][] =new int [4][3];
		 int k=1;
		 int r;
		 int c;
		 
		 for(r=0; r<4; r++)
		 {
			 for(c=0; c<3; c++)
			 {
				 arr[r][c]=k;
				 k++;
			 }
			 
			
	}
		 
		 for(r=0; r<4; r++)
		 {
			 for(c=0; c<3; c++)
			 {
				//System.out.println("value of row " +arr[r][c]+ " value of column " +arr[r][c]);
				 System.out.println("value of row & column " +arr[r][c]);
			 }
	 }

}
}