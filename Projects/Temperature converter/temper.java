import java.util.Scanner;

public class temper {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
  
    double temp;
    double newTemp;
    String unit;

    System.out.print(("Enter the temprature: "));
    temp = scan.nextDouble();   // first time use this toUppecase

    System.out.print("Convert to celsius or Farhenit?(C or F): ");
    unit = scan.next().toUpperCase();

    //(Condition) ? true : false 
    newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9 ) - 32;
    System.out.printf( "%.2f °C", newTemp);
 scan.close(); 
  }
}
