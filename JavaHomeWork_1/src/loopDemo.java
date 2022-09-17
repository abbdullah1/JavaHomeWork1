
public class loopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println(" For Loop Is Over");
		
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Loop Is Over");
		
		int j = 100;
		do {
			System.out.println(j);
			j+=2;
		}
			while(j<10);
		System.out.println("Do-While Loop Is Over");
		}
	}


