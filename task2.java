import java.util.Scanner;
public class StudentGradeCalculator
{ 
  public static void main(String k[])
  { 
    int no_of_subjects;
    int sum_marks=0;
    int Avg_percentage=0;
    String Grade="";
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Number of subjects to caluclate the Grade.\n");
    no_of_subjects=s.nextInt();
    System.out.println("Enter a Marks of subjects in betweeen 1-100.\n");
    int i;
    int arr[]=new int[100];
    for(i=0;i<no_of_subjects;i++)
    {
       arr[i]=s.nextInt();
       try
       { 
         if(arr[i]>100 || arr[i]<0)
         {
            throw new Exception("Please enter a vaild Marks from 1-100");
         }
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
     }
     for(i=0;i<no_of_subjects;i++)
     {
       sum_marks+=arr[i];
     }
     try
     {
       Avg_percentage=sum_marks/no_of_subjects;
     }
     catch(ArithmeticException e1)
     {
       System.out.println(e1);
     }
     if(Avg_percentage >90 && Avg_percentage<=100)
     {
        Grade="S";
     }
     else if(Avg_percentage>80 && Avg_percentage<90)
     {
        Grade="A+";
     }
     else if(Avg_percentage>70 && Avg_percentage<=80)
     {
        Grade="A";
     }
     else if(Avg_percentage>60 && Avg_percentage<=70)
     {
        Grade="B";
     }
     else if(Avg_percentage>50 && Avg_percentage<=60)
     {
        Grade="C";
     }
     else if(Avg_percentage>=40 && Avg_percentage<=500)
     {
        Grade="D";
     }
     else if(Avg_percentage>0 && Avg_percentage<40)
     {
        Grade="Fail";
     }
     System.out.println("The Total Marks of Student is:"+sum_marks);
     System.out.println("The Average Percentage of Student is:"+Avg_percentage);
     System.out.println("The Grade of Student is:"+Grade);
   }
}