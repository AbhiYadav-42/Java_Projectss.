import java.util.Scanner;

public class quiz {
  public static void main(String[] args) {
    // QUIZ game

    //Question array[]

    String[] questions ={"1. In Game of Thrones, what is the name of Jon Snow's direwolf",
                         "2.  In Breaking Bad, what color is the meth that Walter White produces?",
                          "3. In Spider-Man Remastered (PC), which city is the game set in",
                          "4. In Red Dead Redemption 2, what is the name of Arthur Morgan’s horse by default? ",
                          "5. In Breaking Bad, what is the street name of Walter White?"};

    // option array[][]

    String[][] Options = {
                  {"1.Ghost","2.Nymeria","3.Summer","4.Shaggydog"},                 // Q1: Jon Snow's direwolf
                  {"1.Blue","2.Green", "3.Red","4.White"},                           // Q2: Color of meth
                  {"1.Newark","2.Los Angeles","3.Chicago","4.New York City"},     // Q3: City in Spider-Man  Remastered
                  {"1.Boadicea","2.Tennessee Walker","3.Bucephalus","4.Copper"},              // Q4: Arthur Morgan's horse
                  {"1.Heisenberg","2.Capone","3.Jesse","4.Badger"}                  // Q5: Walter White's street name
};

// DECLARE VARIABLES
  int[] answers = {1, 1, 4, 2, 1 };
  int score =0;
  int guess;

  Scanner scan = new Scanner ( System.in);


    // WELCOME MESSAGE 
  System.out.println("==========================================\r\n" + //
        "           WELCOME TO\r\n" + //
        "       THE ULTIMATE QUIZ GAME\r\n" + //
        "==========================================\r\n" + //
        "\r\n" + //
        "  Test your knowledge of Games & Web Series\r\n" + //
        "  -----------------------------------------\r\n" + //
        "  -> Total Questions: 5\r\n" + //
        "  -> Type the correct option number (1 to 4)\r\n" + //
        "  \r\n" + //
        "  Let's begin... Good luck!\r\n" + //
        "");


    // QUESTION (Loop)

    for(int i =0;i< questions.length;i++){
      System.out.println(" ");
      System.out.println(questions[i]);
      //  Options
      for(String option : Options[i]){
        System.out.println(option);
      }

      // Get Guess From USER
      System.out.print("Enter your guess: ");
      guess = scan.nextInt();
      
          // Check guess from the user 

          if(guess == answers[i]){
            System.out.println("Correct!!");
            score++;
          }
          else{
            System.out.println("Wrong!!");
          }
    }
    System.out.println("Your Score: "+ score+ "/" + questions.length);

   

    scan.close();
  }
}
