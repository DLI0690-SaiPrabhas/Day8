import java.util.Scanner;

class NegativeNumberException extends RuntimeException {
    NegativeNumberException(String s) {
        super(s);
    }
}
public class NegativeNumber {
    static void checkNumber(int num) {
        if (num < 0) {
            throw new NegativeNumberException("Number is negative");
        } else {
            System.out.println("Number is valid");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        try {
            checkNumber(num);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}