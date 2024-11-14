import java.util.Scanner;

public class CaseConversion {
	
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to convert :");
		String conversion = scan.next();
		System.out.println("Conversion of given String to Lower Case :" + conversion.toLowerCase());
		System.out.println("Conversion of given String to Upper Case :" + conversion.toUpperCase());
	}

}
