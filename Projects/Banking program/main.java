import java.util.Scanner;

public class main{
  public static void main(String[] args)  {
    Scanner scan = new Scanner (System.in);
    //Java BANKING PROGRAM for BEGINNERS

    double Bal= 0.0;
    int choice = 0;
    double newBal;

  while (choice!=4) {
   System.out.println(" ");
   System.out.println(" ");
    System.out.println("****************");
    System.out.println("BANKING PROGRAM");
    System.out.println("****************");

    System.out.println("1. Show balance");
     System.out.println("2. Deposit");
     System.out.println("3. Withdraw");
     System.out.println("4. Exit");
     System.out.println("****************");
     System.out.print("Enter your choice: ");
     choice = scan.nextInt();


     if (choice == 1) {

      if (Bal>0) {       
        showBal(Bal);
      }
      else{
        System.out.println("You have " + Bal + " BALANCE!!");
      }
     }

     else if(choice==2){
      System.out.print("Enter the amount to be Deposit: ");
      double depoBal=scan.nextDouble();

      if (depoBal < 0) {
    System.out.println("Deposit must be a positive amount!");
      } else {
      Bal = deposit(Bal, depoBal);
     }

      Bal = Depo(Bal, depoBal);
     }


     else if(choice==3){
      System.out.print("Enter the amount to Withdraw: ");
      double withBal=scan.nextDouble();
      if (withBal>Bal) {
        System.out.println("can't withdraw!!");
      }
      else{
        Bal = Depo(Bal, withBal);
        System.out.println("Take the amount!!");
        System.out.println(withBal);
      }
    }
    }
  }
  
     public static void showBal (double balance){
        System.out.println("Your balance is: ₹" + balance); 
      }

      public static double Depo(double balance, double amount) {
      return balance + amount;
      }

      public static double With(double balance, double amount) {
      return balance - amount;
      }
}