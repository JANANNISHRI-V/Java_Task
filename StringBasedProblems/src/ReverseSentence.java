import java.util.Scanner;

public class ReverseSentence {
	static String reverseSen(String sen) {
		String reverse = "";
		String[] sarr = sen.split(" ");
		for(String x : sarr) {
			reverse = reverse + " " + reverseSen(x);
		}
		return reverse.trim();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Sentence : ");
		String sen = scan.next();
		reverseSen(sen);
	}

}
