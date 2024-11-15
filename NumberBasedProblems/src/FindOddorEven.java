import java.util.Scanner;

public class FindOddorEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find whether it is odd or even : ");
		int find = sc.nextInt();
		if(find % 2==0) {
			System.out.println("It is Even Number.");
		}else {
			System.out.println("It is Odd Number.");
		}

	}

}
