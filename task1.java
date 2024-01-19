import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class RandomNumber
{
  public static void main(String args[])
  {
     Scanner s=new Scanner(System.in);
     int min=1;
     int max=100;
     int l=0;
    do
    {
     int Random_Number=(int)(Math.random()*(max-min+1)+min);
     int i;
     int k=10,r=0;
     for(i=0;i<10;i++)
     {
      System.out.println("Enter a Guess Number in between 1-100");
      int Guess_number=s.nextInt();
      if(Random_Number==Guess_number)
       { 
         r=1;
         System.out.println("You Guess Number is correct\n");
         break;
       }
      else
       {
          if(Math.abs(Random_Number-Guess_number)<20)
          {
            System.out.println("You Guess is too low.. try again");
          }
          else
          {
            System.out.println("You Guess is too High.. try again");
          }
       }
       k=k-1;
    } 
    if(r==1)
    {
       System.out.println("SCORE IS "+(k*10));
    }
    System.out.println("\nAre you want to play again Enter 1\n");
    l=s.nextInt();
   }while(l==1);
  }
}