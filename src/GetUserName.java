import java.util.Scanner;


public class GetUserName {
    public static void main(String[] args) {
        String firstName = "";
        String lastName = "";

        Scanner in = new Scanner(System.in);

        firstName = SafeInputs.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInputs.getNonZeroLenString(in, "Enter your last name");

        System.out.println("\nYour full name is: " + firstName + " " + lastName);

    }
}
