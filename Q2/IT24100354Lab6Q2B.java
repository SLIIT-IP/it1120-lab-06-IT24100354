import java.util.Scanner;

public class IT24100354Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];  
        int count = 1;
        
        System.out.println("Please enter 10 numbers:");

           while (count <= 10) 
           {
            System.out.print("Enter number " + count + ": ");
            numbers[count - 1] = input.nextInt();  
            count++;
           }
        
                System.out.print("The numbers you entered are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}