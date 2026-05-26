public class GuestRandomNumber {
    int attempts;
    int maxAttempts;     // limite de tentatives (10)
    int secretNumber;    // le nombre à deviner
    boolean isWon; // le joueur a-t-il gagné ?

    GuestRandomNumber() {
        this.attempts = 0;
        this.maxAttempts = 10;
        this.isWon = false;
        generateNumber(); // on génère le nombre dès le départ
    }
    private void generateNumber() {
        this.secretNumber = 1 + (int)(Math.random() * 100);
    }

    public boolean isGameOver() {
        return isWon || attempts >= maxAttempts;
    }


    public String checkGuess(int userGuess) {
        this.attempts++;
        if (userGuess == secretNumber) {
            this.isWon = true;
            return "Gagné !";
        } else if (userGuess < secretNumber) {
            return "Trop petit !";
        } else {
            return "Trop grand !";
        }
    }





}
