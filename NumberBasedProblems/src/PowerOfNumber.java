import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number to be Powered : ");
		int num = scan.nextInt();
		System.out.println("Enter the Power value : ");
		int pow = scan.nextInt();
		
		 int result = (int) Math.pow(num,pow); 
		 System.out.println("The power of " + num + " by the number " + pow + " is : " + result);
		 scan.close();
}
		
}
