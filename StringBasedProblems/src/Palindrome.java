import java.util.Scanner;

public class Palindrome {
	
	static void palindrome(String str) {
		String rev = "";
		for(int i=0;i<str.length();i++) {
//            rev = str.charAt(i) + rev;
			rev = str.substring(i,i+1)+rev;
		}
		
		if(rev.equals(str)) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check if it is a palindrome or not :");
		String str = sc.next();
		palindrome(str);
	}

}
