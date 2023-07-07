import java.util.Scanner;
import java.util.Random;

public class michaeljosilgamerps {
    public static void main(String[] args) {
        String[] moves = { "rock", "paper", "scissors" };
        int numTurns = 3;
        int playerPoints = 0;
        int computerPoints = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");

        for (int i = 0; i < numTurns; i++) {
            System.out.println("Turn " + (i + 1));

            System.out.print("Enter your move (rock, paper, or scissors): ");
            String playerMove = scanner.nextLine().toLowerCase();

            int computerMoveIndex = random.nextInt(3);
            String computerMove = moves[computerMoveIndex];

            System.out.println("Computer chooses " + computerMove + ".");

            String result;
            if (playerMove.equals(computerMove)) {
                result = "It's a tie!";
            } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                    (playerMove.equals("paper") && computerMove.equals("rock")) ||
                    (playerMove.equals("scissors") && computerMove.equals("paper"))) {
                result = "Congratulations! You win this turn!";
                playerPoints++;
            } else {
                result = "Sorry, you lose this turn. Better luck next time!";
                computerPoints++;
            }

            System.out.println(result);
            System.out.println();
        }

        System.out.println("Game over!");
        System.out.println("Player Points: " + playerPoints);
        System.out.println("Computer Points: " + computerPoints);

        if (playerPoints > computerPoints) {
            System.out.println("Congratulations! You win the game!");
            System.out.println("      _____     ");
            System.out.println("    _|___|_    ");
            System.out.println("   |       |   ");
            System.out.println("   |       |   ");
            System.out.println("   |       |   ");
            System.out.println("   |       |   ");
            System.out.println("   |       |   ");
            System.out.println("   |_______|   ");

            System.out.println("       ||       ");
            System.out.println("       ||       ");

            System.out.println("   __________  ");
            System.out.println("  |__________| ");
        } else if (playerPoints < computerPoints) {
            System.out.println("Sorry, you lose the game. Better luck next time!");
        } else {
            System.out.println("It's a tie! The game ends in a draw.");
            System.out.println("  ___");
            System.out.println(" |_|_|");
            System.out.println("  | |");
            System.out.println("  | |");
            System.out.println("  | |");
            System.out.println("  | |");
            System.out.println(" _|_|_");
            System.out.println("|_____|");
        }
    }
}