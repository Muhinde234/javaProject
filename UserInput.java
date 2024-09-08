
import java.util.Scanner;

public class UserInput {
   private static  int number;
   
   public int  getnumber()
   {
    return number;
   }
   public void setumber(int number)
   {
    this.number=number;
   }
   public static void displaynumber()
   {
  System.out.println(number);
   }
   public static void main(String[] args) {
    UserInput num= new UserInput();
   Scanner input= new Scanner(System.in);
   number=input.nextInt();
   num.displaynumber(); 
  

   }
}
