import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GuestRandomNumber game = new GuestRandomNumber();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Trouvez le nombre entre 1 et 100. Vous avez 10 essais !");


        while (!game.isGameOver()) {

            System.out.println("\nEssai " + (game.attempts + 1) + "/" + game.maxAttempts);
            System.out.print("Votre nombre : ");

            int userGuess = scanner.nextInt();

            // On envoie la tentative à la classe et on affiche le résultat
            String result = game.checkGuess(userGuess);
            System.out.println(result);
        }

        // Message de fin
        if (game.isWon) {
            System.out.println("\n Bravo ! Trouvé en " + game.attempts + " essai(s) !");
        } else {
            System.out.println("\nPerdu ! Le nombre était : " + game.secretNumber);
        }

    }
}