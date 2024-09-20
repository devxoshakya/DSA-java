package Lab;
import  java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for(int i=0; i<=num; i++) {
        	System.out.print(fibonacci(i)+" ");
        }

        int result = fibonacci(num);
        System.out.println("Fibonacci number is: " + result);

        System.out.println("Enter First Variable:");
        int first = scanner.nextInt();
        System.out.println("Enter Second Variable:");
        int second = scanner.nextInt();


        Variables multiply = new Variables(first, second);
        System.out.println("Multiplication is: " + Variables.multiply());

    }



    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}