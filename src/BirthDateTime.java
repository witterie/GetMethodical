import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        String monthDate;

        System.out.println("What is your Birthday?");
        int year = SafeInputs.getRangedInt(in, "Year",  1950,  2010);
        int month = SafeInputs.getRangedInt(in, "Month",  1,  12);

        switch (month){
            case 1 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  31);
            }
            case 2 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  28);
            }
            case 3 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  31);
            }
            case 4 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  30);
            }
            case 5 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  31);
            }
            case 6 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  30);
            }
            case 7 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  31);
            }
            case 8 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  31);
            }
            case 9 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  30);
            }
            case 10 -> {
                day = SafeInputs.getRangedInt(in, "Day", 1,  31);
            }
            case 11 -> {
                day = SafeInputs.getRangedInt(in, "Day", 1,  30);
            }
            case 12 -> {
                day = SafeInputs.getRangedInt(in, "Day",  1,  31);
            }
            default -> monthDate = "Invalid Month";
        }

        int hours = SafeInputs.getRangedInt(in, "Hour", 1,  24);
        int minutes = SafeInputs.getRangedInt(in, "Minutes",  1,  59);

        System.out.println("Your Birthday is: " + month + "/" + day + "/" + year + "  " + hours + ":" + minutes);
    }
}
