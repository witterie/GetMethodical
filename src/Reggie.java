import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String prompt = "Enter your SSN";
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String ssn = SafeInputs.getRegExString(in, prompt, ssnPattern);
        System.out.println("Your SSN is: " + ssn);

        prompt = "Enter UC Student M number";
        String mNumberPattern = "(M|m)\\d{5}";
        String mNumber = SafeInputs.getRegExString(in, prompt, mNumberPattern);
        System.out.println("Your UC M number is: " + mNumber);

    }
}
