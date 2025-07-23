import java.util.Scanner;
public class cal {
  public static void main(String[] args) {
    Scanner scan =  new Scanner (System.in);
    System.out.println("CALCULATOR....");

    System.out.print("Enter the first number: ");
    Double One = scan.nextDouble();

    System.out.print("Enter an operator (+ , - , * , /, ^): ");
    char calc = scan.next().charAt(0);

    System.out.print("Enter the second number: ");
    Double Two =  scan.nextDouble();

    double add=One + Two ;
    double sub = One - Two;
    double mul = One * Two;
    double div = One/Two;
    double exponent  = Math.pow(One,Two);
    
    switch (calc) {
      case '+'  -> System.out.print("After addition : "+add); 
      case '-'  -> System.out.print("After subractiobn : "+sub); 
      case '*'  -> System.out.print("After mulitplication : "+mul); 
      case '/'  -> System.out.print("After divide : "+div);
      case '^'  -> System.out.print("After divide : "+exponent);

      
     default -> System.out.print( "This is Invalid input ");
    }
    }

  }

