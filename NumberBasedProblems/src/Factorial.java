import java.util.Scanner;

public class Factorial {
	
	static int factorialofNumber(int fact) {
		if (fact == 1 || fact == 0) {
			return 1 ;
		}else {
			return(fact*factorialofNumber(fact-1));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for Factorial : ");
		int fact = scan.nextInt();
		
		System.out.println("Factorial of " + fact + " is :" + factorialofNumber(fact));

	}

}
