package palindrome;

class First
{
 public void display(String msg)
 {
  System.out.print ("["+msg);
  try
  {
   Thread.sleep(1000); 
  }
  catch(InterruptedException e)
  {
   e.printStackTrace();
  }
  System.out.println ("]");
 }
}

class Second extends Thread
{
 String msg;
 First fobj;
 Second (First fp,String str)
 {
  fobj = fp;
  msg = str;
  start();
 }
 public void run()
 {
  fobj.display(msg);
 }
}

public class Syncro
{
 public static void main (String[] args) 
 {
  First fnew = new First();
  First fnew1 = new First();
  First fnew2 = new First();
  Second ss = new Second(fnew, "welcome");
  Second ss1= new Second (fnew1,"new");
  Second ss2 = new Second(fnew2, "programmer");
 }
}