import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors extends Game {

    private int[] scores;
    private int roundsToWin = 3;

    @Override
    public void initializeGame(int numberOfPlayers) {
        scores = new int[numberOfPlayers];
        System.out.println("Kivi-paperi-sakset peli alkaa! Ensimmäinen, joka voittaa 3 kierrosta, voittaa pelin.");
    }

    @Override
    public boolean endOfGame() {
        for (int score : scores) {
            if (score >= roundsToWin) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Kivi", "Paperi", "Sakset"};
        System.out.println("Pelaaja " + (player + 1) + ", valitse (1: Kivi, 2: Paperi, 3: Sakset): ");
        int playerChoice = scanner.nextInt() - 1;

        int computerChoice = random.nextInt(3);
        System.out.println("Tietokone valitsi: " + choices[computerChoice]);

        if (playerChoice == computerChoice) {
            System.out.println("Tasapeli!");
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 1 && computerChoice == 0) ||
                (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("Pelaaja " + (player + 1) + " voittaa kierroksen!");
            scores[player]++;
        } else {
            System.out.println("Tietokone voittaa kierroksen!");
        }

        System.out.println("Pelaajan " + (player + 1) + " pistetilanne: " + scores[player]);
    }

    @Override
    public void displayWinner() {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= roundsToWin) {
                System.out.println("Pelaaja " + (i + 1) + " on voittaja!");
            }
        }
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.play(1); // Yksi pelaaja tietokonetta vastaan
    }
}
