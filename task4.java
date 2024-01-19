import java.util.Timer;  
import java.util.*;  
import java.util.TimerTask;  
class Task extends TimerTask   
{  
 int Score,i=0;
 String k[]=new String[7];
 public Task()   
 { 
  Score = 0; 
  i=0;
  k[0]="Enter a correct option ..\n Which of the  following is a superclass of every class in Java?\n 1. ArrayList\n 2. Abstract class\n 3. Object class\n 4. String\n";
  k[1]="Enter a correct option ..\n The Feild of Interface are implicitly specified as?\n 1. Static only \n 2. protected \n 3. Private\n 4. Both Final and Static\n";
  k[2]="Enter a correct option ..\n Which is not a Feature of Java?\n 1. Dynamic\n 2. Use of Pointers\n 3. Architecture Neutral\n 4. Object-Oriented\n";
  k[3]="Enter a correct option ..\n Which Package Contains Random Class?\n 1. java.util package\n 2. java.lang package\n 3. java.awt package\n 4. java..io package\n";
  k[4]="Enter a correct option ..\n Which of the following is an immediate subclass of the Panel class?\n 1. Window class\n 2. Abstract class\n 3. Frame class\n 4. Applet class\n";
 }  
 public void run()   
 {
  int Choose;  
  Scanner s=new Scanner(System.in);  
  System.out.println(k[i]);
  Choose=s.nextInt();
  if(Choose>4 || Choose==0)
  {
    System.out.println("Enter a valid option");
  }
  if(i==0 && Choose==3)
  { 
    Score=Score+1;
  }
  else if(i==1 && Choose==4)
  { 
     Score=Score+1;
  }
  else if(i==2 && Choose==2)
  { 
     Score=Score+1;
  }
  else if(i==3 && Choose==1)
  { 
     Score=Score+1;
  }
  else if(i==4 && Choose==4)
  { 
     Score=Score+1;
  }  
  i=i+1;
  
 }  
 public int getScore()   
 {  
  return Score;  
 }  
}  
class StartStopTimer  
{  
 private boolean running;  
 private Task task;  
 private Timer timer;  
 public StartStopTimer()   
 {  
  timer = new Timer(true);  
 }  
 public boolean isRinging()   
 {  
   return running;  
 }  
 public void startRinging() 
 {  
   running = true;  
   task = new Task();  
   timer.scheduleAtFixedRate(task, 0, 3000);  
 }  
 public void doIt()   
 {  
   running = false;  
   System.out.println("Your Score is"+task.getScore()); 
   System.out.println("\nYour Correct answers are: "+task.getScore());
   System.out.println("\nYour InCorrect answers are: "+(5-task.getScore()));  
   task.cancel();  
  }  
  public static void main(String args[])   
  {  
    StartStopTimer a = new StartStopTimer();  
    a.startRinging();  
    try   
    {  
      Thread.sleep(20000);  
    }   
    catch(InterruptedException e){} 
    a.doIt();  
   }  
}