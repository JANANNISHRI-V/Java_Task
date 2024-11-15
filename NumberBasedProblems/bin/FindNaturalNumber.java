import java.util.Scanner;

public class FindNaturalNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Number to check if it is Natural number or not :");
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println("It is Natural Number.");
		}else {
			System.out.println("It is not a Natural Number.");
		}

	}

}
