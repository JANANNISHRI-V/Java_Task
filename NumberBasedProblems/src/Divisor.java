import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find it's Divisor : ");
		int div = scan.nextInt();
		for (int i=1;i<div;i++) {
			if (div % i == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
