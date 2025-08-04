import java.util.Random;
import java.util.Scanner;

public class R_P_S {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        String choice;
        String computer_choices;
        String play_again = "yes";

        String[] rock_paper_scissors = { "rock", "paper", "scissors" };

        System.out.println("=========================================");
        System.out.println("      WELCOME TO ROCK PAPER SCISSORS     ");
        System.out.println("=========================================\n");

        do {
            System.out.println("-----------------------------------------");
            System.out.print("Enter your choice (rock / paper / scissors): ");
            choice = scan.nextLine().toLowerCase();

            if (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
                System.out.println("❌ Invalid input! Please enter 'rock', 'paper', or 'scissors'.\n");
                continue; // Skip this round if input is invalid
            }

            int number = ran.nextInt(3);
            computer_choices = rock_paper_scissors[number];

            System.out.println("Computer chose: " + computer_choices);

            // Tie
            if (choice.equals(computer_choices)) {
                System.out.println("🤝 It's a TIE!!");
            }

            // You win
            else if (
                (choice.equals("rock") && computer_choices.equals("scissors")) ||
                (choice.equals("scissors") && computer_choices.equals("paper")) ||
                (choice.equals("paper") && computer_choices.equals("rock"))
            ) {
                System.out.println("🎉 YOU WIN!!");
            }

            // You lose
            else {
                System.out.println("💥 YOU LOSE!!");
            }

            System.out.print("\nDo you want to play again? (yes / no): ");
            play_again = scan.nextLine().toLowerCase();
            System.out.println();

        } while (play_again.equals("yes"));

        System.out.println("=========================================");
        System.out.println("     THANKS FOR PLAYING. GOODBYE! 👋     ");
        System.out.println("=========================================");

        scan.close();
    }
}
