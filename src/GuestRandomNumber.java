public class GuestRandomNumber {

    /** Nombre de tentatives effectuées par le joueur. */
    int attempts;

    /** Nombre maximum de tentatives autorisées. */
    int maxAttempts;

    /** Le nombre secret à deviner. */
    int secretNumber;

    /** Indique si le joueur a gagné la partie. */
    boolean isWon;

    /**
     * Constructeur par défaut.
     * Initialise une nouvelle partie avec 0 tentative,
     * une limite de 10 essais et génère un nombre secret.
     */
    GuestRandomNumber() {
        this.attempts = 0;
        this.maxAttempts = 10;
        this.isWon = false;
        generateNumber();
    }

    /**
     * Génère un nombre aléatoire entre 1 et 100.
     * Appelée automatiquement à la création de l'objet.
     */
    private void generateNumber() {
        this.secretNumber = 1 + (int)(Math.random() * 100);
    }

    /**
     * Vérifie si la partie est terminée.
     *
     * @return true si le joueur a gagné ou a épuisé ses essais, false sinon
     */
    public boolean isGameOver() {
        return isWon || attempts >= maxAttempts;
    }

    /**
     * Vérifie la tentative du joueur et retourne un message d'indice.
     *
     * @param userGuess Le nombre proposé par le joueur
     * @return "Gagné !" si correct, "Trop petit !" ou "Trop grand !" sinon
     */
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