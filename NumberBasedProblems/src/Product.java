import java.util.Scanner;

public class Product {
    public static int Product(int number) {
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            product = product * digit; 
            number = number / 10;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int result = Product(number);
        System.out.println("The product of the digits is: " + result);

    }
}
