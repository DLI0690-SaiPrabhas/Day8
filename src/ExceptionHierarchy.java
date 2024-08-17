public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            System.out.println("Trying to divide by zero...");
            int result = 10 / 0;
            System.out.println("Trying to access null object...");
            String str = null;
            str.length();
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic exception: " + e.getMessage());
        }
    }
}