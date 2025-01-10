import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissor");
        Scanner sc = new Scanner(System.in);
        int human = sc.nextInt();

        Random random = new Random();
        int computer = random.nextInt(3)+1;
        if (human < 1 || human > 3) {
            System.out.println("Invalid user input");
            return;
        }

        System.out.println("Game Starts");

        // Display choices
        System.out.println("Player chose: " + choiceToString(human));
        System.out.println("Computer chose: " + choiceToString(computer));

        if (human == computer) {
            System.out.println("Match Draw");
        } else if (human == 1 && computer == 3 || human == 2 && computer == 1 || human == 3 && computer == 2) {
            System.out.println("Congratulations!, Player has Won!!!");
        } else {
            System.out.println("Computer has Won!!!");
        }

    }

    private static String choiceToString(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissor";
            default -> "Invalid";
        };
    }
}