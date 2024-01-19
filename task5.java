import java.util.ArrayList;
import java.util.*;
class Student
{
  int ID;
  String name;
  String Course;
  Student(int ID,String name,String course)
  {
    this.ID=ID;
    this.name=name;
    this.Course=Course;
  }
}
class StudentRegistration 
{
  public static void main(String args[])
  { 
    String Course_Data[][]=new String[8][8];
    Course_Data[0][0]="CSE101";
    Course_Data[0][1]="Course Information:\nThis Course will provide a Knowledge on the Data Science\nThe Course Code is: CSE101\nThe Title is: Knowledge on Data Science.\nThe Schedule:January 2024\n";
    Course_Data[1][0]="IoT301";
    Course_Data[1][1]="Course Information:\nThis Course will provide a Knowledge on the Information and Technology Developments.\nThe Course Code is: IoT301\nThe Title is: Knowledge on Technology Development.\nThe Schedule:February 2024\n";
    Course_Data[2][0]="MEC103";
    Course_Data[2][1]="Course Information:\nThis Course will provide a Knowledge on Making a Innovative useful Items\nThe Course Code is: MEC103\nThe Title is: Knowledge on Making Items.\nThe Schedule:June 2024\n";
    Course_Data[3][0]="CIV102";
    Course_Data[3][1]="Course Information:\nThis Course will provide a Knowledge on Design and Construction Activities.\nThe Course Code is: CIV102\nThe Title is: Knowledge on Construction.\nThe Schedule:July 2024\n";
    Course_Data[4][0]="ENG105";
    Course_Data[4][1]="Course Information:\nThis Course will provide a Knowledge on the Communication Skills.\nThe Course Code is: ENG105\nThe Title is: Knowledge on Communication.\nThe Schedule:December 2024\n"; 
    System.out.println("WELCOME TO  STUDENT COURSE REGISTRATION SYSTEM");
    Scanner s=new Scanner(System.in);
    ArrayList<String> a=new ArrayList<String>();
    ArrayList<Student> b=new ArrayList<Student>();
    a.add(Course_Data[0][0]);
    a.add(Course_Data[1][0]);
    a.add(Course_Data[2][0]);
    a.add(Course_Data[3][0]);
    a.add(Course_Data[4][0]);
    int l=0;
    do
    {
      System.out.println("Enter a student Details");
      System.out.println("Enter a student ID");
      int ID_d=s.nextInt();
      System.out.println("Enter a student Name\n"); 
      String Name=s.nextLine();
      System.out.println("The Courses Available");
      System.out.println(a);
      System.out.println("Enter a student Course");
      String Cour=s.nextLine();
      Student s1=new Student(ID_d,Name,Cour);
      b.add(s1);
      a.remove(Cour);
      System.out.println("Enter 1 to continue  the Registration Process");
      l=s.nextInt();
    }while(l==1);
    for(Student r:b)
    {
        System.out.println("The student ID is"+r.ID);
        System.out.println("The student Name is"+r.name);
        System.out.println("The student ID is"+r.Course);
    }
  }
}