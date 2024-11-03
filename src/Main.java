import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        int sum = 0;
        int count = 0;
        int position = -1;
        int min = dataPoints[0];
        int max = dataPoints[0];
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = random.nextInt(100) + 1; // +1 to include 100
        }

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (i > 0)
            {
                System.out.print(" | ");
            }
                System.out.print(dataPoints[i]);
            }
            System.out.println();

            for (int i = 0; i < dataPoints.length; i++)
            {
                sum += dataPoints[i];
            }
            double average = sum / (double) dataPoints.length;

            System.out.println("The sum of the values in dataPoints is: " + sum);
            System.out.println("The average of the values in dataPoints is: " + getAverage(dataPoints));


            int userValue = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100: ", 1, 100);
            System.out.println("You entered: " + userValue);

            for (int i = 0; i < dataPoints.length; i++)
            {
                if (dataPoints[i] == userValue)
                {
                    count++;
                }
            }

            System.out.println("The value " + userValue + " was found " + count + " times in the dataPoints array.");

            int secondUserValue = SafeInput.getRangedInt(in, "Enter another integer value between 1 and 100: ", 1, 100);
            System.out.println("You entered: " + secondUserValue);

            for (int i = 0; i < dataPoints.length; i++)
            {
                if (dataPoints[i] == secondUserValue)
                {
                    position = i;
                    break;
                }
            }

            if (position != -1)
            {
                System.out.println("The value " + secondUserValue + " was found at array index " + position + ".");
            }
            else
            {
                System.out.println("The value " + secondUserValue + " was not found in the dataPoints array.");
            }

            for (int i = 1; i < dataPoints.length; i++)
            {
                if (dataPoints[i] < min)
                {
                    min = dataPoints[i];
                }
                if (dataPoints[i] > max)
                {
                    max = dataPoints[i];
                }
            }
            System.out.println("The minimum value in the dataPoints array is: " + min);
            System.out.println("The maximum value in the dataPoints array is: " + max);
        }

        public static double getAverage( int values[])
        {
            int sum = 0;
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return sum / (double) values.length;

        }
    }