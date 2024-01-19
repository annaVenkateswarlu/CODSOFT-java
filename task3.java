import java.util.*;
interface ATM1
{ 
  int amount=0;
  void withdraw(int amount);
  void deposite(int amount);
  void check_balence();
}
class AtmMachine implements ATM1
{ 
  int balence=0;
  public void withdraw(int amount)
  {
    if(balence-amount>=0)
    {  
      balence=balence-amount;
      System.out.println("Withdrawing the Amount is succesfully Done.");
    }
    else
    { try
      {
       throw new Exception("The Insufficent Balence");
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
  }
  public void deposite(int amount)
  {
    balence=balence+amount;
    System.out.println("Depositing the Amount is succesfully Done.");
  }
  public void check_balence()
  {
    System.out.println("The Balence amount: "+balence);
  }
}
class ATM
{
  public static void main(String k[])
  {
    ATM1 a=new AtmMachine();
    Scanner s=new Scanner(System.in);
    int choice=0;
    int r=0;
    do
    { 
      System.out.println("Enter a Choice\n 1.Withdraw\n 2.Deposite\n 3.Check Balence");
      choice=s.nextInt();
      if(choice==1)
      { 
        int withdrawing;
        System.out.println("Enter Withdraw Amount");
        withdrawing=s.nextInt();
        try
        {
          a.withdraw(withdrawing);
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
      }
      else if(choice==2)
      {
        int deposite1;
        System.out.println("Enter Deposite Amount");
        deposite1=s.nextInt();
        a.deposite(deposite1);
      }
      else if(choice==3)
      {
        a.check_balence();
      }
      else
      {
        System.out.println("Enter a vaild Number.");
      }
      r=0;
      System.out.println("Enter 1 for Continue the process");
      r=s.nextInt();
    }while(r==1);
  }
}