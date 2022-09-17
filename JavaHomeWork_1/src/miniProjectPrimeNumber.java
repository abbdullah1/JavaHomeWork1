
public class miniProjectPrimeNumber {

	public static void main(String[] args) {
		int number = 25;
		boolean isPrime = true;
		for(int i=2 ; i<number;i++) {
			if(number%i==0) {
				isPrime = false;
			}
		}
		if(number==1) {
			System.out.println("number is prime");
			return;
		}
		if(number<1)
		{
			System.out.println("invalid number");
		}
		if(isPrime) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}

	}

}
