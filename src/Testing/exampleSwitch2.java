package Testing;

public class exampleSwitch2 {

	public static void main(String[] args) {
		 int month = 2;
		 
		 String monthString="";
		 
		 switch (month) {
		case 1:
			monthString="January";
			break;

		case 2:
			monthString="February";
			break;
		default:
			break;
		}
		 
		 System.out.println("month is "+ monthString);

	}

}
