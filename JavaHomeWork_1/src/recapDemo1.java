
public class recapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 20;
		int number2 = 25;
		int number3 = 2;
	
		int greatestNumber = number1;
		if(greatestNumber<number2) {
			greatestNumber=number2;
		}
		if(greatestNumber<number3) {
			greatestNumber=number3;
		}
		System.out.println("Greatest number is : "+greatestNumber);
	}

}
