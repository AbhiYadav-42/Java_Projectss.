import java.util.Scanner;
import java.util.Random;

public class guess {

// ANSI Colors
public static final String RED = "\u001B[31m";
public static final String GREEN = "\u001B[32m";
public static final String YELLOW = "\u001B[33m";
public static final String BLUE = "\u001B[34m";
public static final String MAGENTA = "\u001B[35m";
public static final String CYAN = "\u001B[36m";
public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempt = 0;
        int ran = random.nextInt(25) + 1; // Random between 1 to 100
        System.out.println(ran);
        System.out.println("⣶");

          printAsciiTitle();
        System.out.println("Guess a number between 1 - 100 ");

        do {
            System.out.print("Enter a guess: ");
            guess = scan.nextInt();
            attempt++;

            if (guess > ran) {
                System.out.println(" Too HIGH! Try again");
            } else if (guess < ran) {
                System.out.println(" Too LOW! Try again");
            }

        } while (guess != ran);

      if (attempt == 1) {
      System.out.println(GREEN + "*Correct!* You hit the bullseye on your very first try!" + RESET);
      printTrophy();
      } else if (attempt == 2) {
      System.out.println(CYAN + "*Correct!* Sharp thinking! You cracked it in just two tries." + RESET);
      printDart();
      } else if (attempt == 3) {
      System.out.println(YELLOW + "*Correct!* Solid work! You figured it out on attempt number three." + RESET);
      printCowboy();
      } else {
      System.out.println(MAGENTA + "*Correct!* You got it in " + attempt + " attempts. Persistence pays off!" + RESET);
      }

      System.out.println(BLUE + "\nThanks for playing the Perfect Guess Game. Come back for another round!\n" + RESET);
      scan.close();
    }
 public static void printAsciiTitle() {
        System.out.println(CYAN +
                "╔════════════════════════════╗\n" +
                "║       PERFECT GUESS        ║\n" +
                "╚════════════════════════════╝" + RESET);
    }

    public static void printTrophy() {
    System.out.println(YELLOW +
        "      ___________\n" +
        "     '._==_==_=_.'\n" +
        "     .-\\:      /-.\n" +
        "    | (|:.     |) |\n" +
        "     '-|:.     |-'\n" +
        "       \\::.    /\n" +
        "        '::. .'\n" +
        "          ) (\n" +
        "        _.' '._\n" +
        "       `\"\"\"\"\"\"\"`" + RESET);
}

public static void printDart() {
 System.out.println("\uD83C\uDFF9"); // 🏹
}

public static void printCowboy() {
   System.out.println("                                                                                ");
    System.out.println("                                          88                                    ");
    System.out.println("                                          88                                    ");
    System.out.println("                                          88                                    ");
    System.out.println(" ,adPPYba,  ,adPPYba,  8b      db      d8 88,dPPYba,   ,adPPYba,  8b       d8  ");
    System.out.println("a8\"     \"\" a8\"     \"8a `8b    d88b    d8' 88P'    \"8a a8\"     \"8a `8b     d8'  ");
    System.out.println("8b         8b       d8  `8b  d8'`8b  d8'  88       d8 8b       d8  `8b   d8'   ");
    System.out.println("\"8a,   ,aa \"8a,   ,a8\"   `8bd8'  `8bd8'   88b,   ,a8\" \"8a,   ,a8\"   `8b,d8'    ");
    System.out.println(" `\"Ybbd8\"'  `\"YbbdP\"'      YP      YP     8Y\"Ybbd8\"'   `\"YbbdP\"'      Y88'     ");
    System.out.println("                                                                      d8'      ");
    System.out.println("                                                                     d8'       ");
}



}
