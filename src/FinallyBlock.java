import java.util.Scanner;

public class FinallyBlock{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer:");
            int num = scanner.nextInt();

            int result = 100 / num;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        } finally {
            System.out.println("The division operation is complete.");
            scanner.close();
        }
    }
}