import java.util.Scanner;

public class ArrayProject {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        int days, sum = 0;

        System.out.print("How many days' temperature: ");
        days = stdin.nextInt();

        int[] temps = new int[days];

        // record temperatures and find average
        for (int index = 0; index < days; index++) {

            System.out.print("Day " + (index + 1)+ "'s high temp: ");
            temps[index] = stdin.nextInt();
            sum += temps[index];

        }

        double average = sum / days;

        // count days above average

        int above = 0;

        for (int index = 0; index < temps.length; index++) {

            if (temps[index] > average) {

                above++;

            }
        }
        System.err.println();

        System.out.println("Average Temp: " + average);

        System.out.println(above + " days above average");

        stdin.close();

    }

}
