// ExceptionTypesDemo.java
import java.io.*;

public class ExceptionTypes {
    public static void main(String[] args) {

        // Unchecked exception
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught");
        }

        // Checked exception
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception caught");
        }
    }
}
