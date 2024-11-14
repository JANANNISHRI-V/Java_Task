import java.util.Scanner;

public class StringReverse {
	
	public static String strrev(String str) {
		String rev = "";
		for(int i=0;i<str.length();i++) {
			rev = str.substring(i,i+1)+rev;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.next();
		System.out.println(strrev(str));
	}

}
