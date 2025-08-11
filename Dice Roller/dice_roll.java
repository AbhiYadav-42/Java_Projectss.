import java.util.Random;
import java.util.Scanner;

public class dice_roll {
  public static void main(String[] args) {
    // Dice Roller Program

    Scanner scan = new Scanner(System.in);



    // DECLARE VARIBALES
Random random = new Random();

int numOfDice;
int total = 0;


// GET # OF DICE > 0
System.out.print("enter the dice to roll: ");
numOfDice = scan.nextInt();


// CHECK IF # OF DICE > 0
if(numOfDice > 0){

  for(int i = 0 ; i<numOfDice; i++){
    //ROLL ALL THE DICE
    int roll = random.nextInt(1,7);
    PrintDie(roll);

    System.out.println("You rolled: "+ roll);

    // GET THE TOTAL
    total  = total + roll;
  }
  System.out.print("Total : " + total);


}
else{
  System.out.println("# of dice must be greater than 0 ");
}

    // DISPLAY ASCII OF DICE
    scan.close();
  }

  static void PrintDie(int roll){
    String dice1 = """  
                ---------
               |         |
                    o 
               |         |
                ---------
              """;

    String dice2 ="""  
                ---------
               |  o      |
                     
               |      o  |
                ---------
              """;

    String dice3 ="""  
                ---------
               | o       |
                    o
               |       o |
                ---------
              """;

     String dice4 ="""  
                ---------
               |  o   o  |
                    
               |  o   o  |
                ---------
              """;
  

       String dice5 ="""  
                ---------
               |  o   o  |
                    o
               |  o   o  |
                ---------
              """;

         String dice6 ="""  
                ---------
               |  o   o  |
                  o   o
               |  o   o  |
                ---------
              """;  
   
              switch(roll){
                case 1 -> System.out.print(dice1);
                case 2 -> System.out.print(dice2);
                case 3 -> System.out.print(dice3);
                case 4 -> System.out.print(dice4);
                case 5 -> System.out.print(dice5);
                case 6 -> System.out.print(dice6);
                default -> System.out.println("iNVALID ROLL!!!");
              }
  }
}
