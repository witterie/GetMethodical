import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        int integerNumber;
        double doubleNumber;

        Scanner in = new Scanner(System.in);

        integerNumber = SafeInputs.getInt(in, "What is your favorite integer?");
        doubleNumber = SafeInputs.getDouble(in, "What is your favorite non-integer?");

        System.out.println("");
        System.out.println("\nYour favorite integer is: " + integerNumber);
        System.out.println("\nYour favorite non-integer is: " + doubleNumber);
    }
}
