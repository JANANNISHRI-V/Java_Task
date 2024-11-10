import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integers: ");
        int number = scan.nextInt();
        int sum = 0;
        while (number > 0) {

            int digit = number % 10;

            sum += digit;

            number = number / 10;
        }

        System.out.println("The sum of the digits is: " + sum);
//        scan.close();
    }
}

