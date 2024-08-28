import java.util.Scanner;

public class IT24100354Lab6Q1
{
  public static void main(String[] args)
  {
         Scanner input= new Scanner(System.in);
         double no,square;

         System.out.print("Enter a number:");
          no=input.nextInt();
                 
          square=no*no;
          double square_root= Math.pow(no, 0.5);

           System.out.println("The square of"+no+"is :"+ square);
            System.out.println("The square root of"+no+" is :"+square_root);
   }
}