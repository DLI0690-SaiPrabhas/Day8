import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionChaining {
    static void readFile(String fileName) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            throw new Exception("An error occurred while reading the file", e);
        }
    }

    public static void main(String[] args) {
        try {
            readFile("C:\\Users\\sai.sri\\IdeaProjects\\Day-8 Assignement\\ExceptionChaining\\src\\hi");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }
}