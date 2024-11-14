import java.util.Scanner;

public class PrimeNumber {
	
	public static void prime(int prime) {
		if(prime % 2 == 0) {
			System.out.println("It is Prime !");
			return;
		}else {
			System.out.println("It is not Prime !");
			return;
		}
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check if the number is Prime or Not :");
		int prime = scan.nextInt();
		prime(prime);
	}

}
