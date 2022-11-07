import java.util.Random;
import java.util.Scanner;


public class GetArrayed {
    public static void main(String[] args) {
        final int countAmount = 100;
        int[] dataPoints = new int[countAmount];
        Random r = new Random();

        for (int i = 0; i < countAmount; i++) {
            dataPoints[i] = 1 + r.nextInt(100);
        }
        for (int i = 0; i < countAmount; i++) {
            int currentCountData = dataPoints[i];
            System.out.print(currentCountData);
            if (i < countAmount - 1)
                System.out.print("|");
        }

        int sum = 0;
        for (int i = 0; i < countAmount; i++){
            sum = sum + dataPoints[i];
        }
        double avg = (float) sum / countAmount;
        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + avg);
        Scanner sc = new Scanner(System.in);
        int input = -1;

        do{
            System.out.println("Input an int value from 1 to 100:");
            input =  sc.nextInt();
            if(input >= 1 || input <=100){
                break;
            }
            System.out.println("The input is not valid. Try again!");
        }while(true);

        int matchCount = 0;
        for(int i : dataPoints){
            if(i==input)
                matchCount++;
        }
        System.out.println("Input " + input + " is found " + matchCount + " times in the dataPoints array.");
        input = -1;

        do{
            System.out.println("Input another int value from 1 to 100:");
            input =  sc.nextInt();
            if(input >= 1 || input <=100){
                break;
            }
            System.out.println("The input is not valid. Try again!");

        }while(true);

        int firstEqualIndex = -1;
        for(int i = 0; i < countAmount; i++){
            if(dataPoints[i]==input){
                firstEqualIndex = i;
                break;
            }
        }
        if(firstEqualIndex == -1){
            System.out.println("The value " + input + " was not found at dataPoints array.");
        }else{
            System.out.println("The value " + input + " was found at array index " + firstEqualIndex);
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int i = 1; i < countAmount; i++){
            int currentData = dataPoints[i];
            if(currentData > max)
                max = currentData;
            if(currentData < min)
                min = currentData;
        }

        System.out.println("Minimum Value in the dataPoints = " + min);
        System.out.println("Maximum Value in the dataPoints = " + max);

        double[] dataPointsDouble = {5.75,25.55,57.65,112.04,225.08,7.68};
        System.out.println("Average of dataPoints (double) is: " +getAverage(dataPointsDouble));

    }

    public static double getAverage(double[] values){
        double sum = 0;
        double avg = 0;
        if(values!=null && values.length!=0){
            for(double d: values){
                sum = sum + d;
            }
            avg = sum/values.length;
        }
        return avg;
    }
}

