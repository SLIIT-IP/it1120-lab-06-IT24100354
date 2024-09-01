import java.util.Scanner;

public class IT24100354Lab2Q2C 
{
    public static void main(String[] args) 
   {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        System.out.print("The numbers you entered are: ");
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.println(numbers[i] + " ");
        }

        double average = sum / (double) numbers.length;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }
}