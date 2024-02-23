package Testing;

public class returntype {


	public int returnTest()
	{
		int a = 10;
		int b = 80;
		int c = a+b;

		return c;
	}
	public static void main(String[] args) {
		returntype obj = new returntype();
		int add = obj.returnTest();
		System.out.println(add);

	}

}
