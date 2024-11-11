import java.util.Scanner;

public class PalindromeNumber {

    public static boolean palindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int rem = number % 10;
            reversedNumber = reversedNumber * 10 + rem;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number to find whether it is Palindrome or Not: ");
        int number = scan.nextInt();
        if (palindrome(number)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is not a Palindrome.");
        }
    }
}
