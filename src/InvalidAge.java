import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}
public class InvalidAge {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18");
        } else {
            System.out.println("Age is valid");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}