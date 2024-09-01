import java.util.Scanner;

public class IT24100354Lab6Q3 
{
    public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        int sumOfSquares = 0;
        int count = 0;

        while (true)
       {
            System.out.print("Enter a positive number (or -99 to end): ");
            int number = input.nextInt();

            if (number == -99) 
           {
                break;
            }

            if (number < 0)
           {
                System.out.println("Please enter only positive numbers.");
                continue;
            }

            sumOfSquares += Math.pow(number, 2);
            count++;
        }

        if (count > 0) 
       {
            double rms = Math.sqrt(sumOfSquares / (double) count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else 
        {
            System.out.println("No numbers were entered.");
        }
    }
}