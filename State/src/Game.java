import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter character = new GameCharacter("Hero");

        boolean playing = true;

        while (playing) {
            character.displayStatus();
            System.out.println("Choose an action: 1) Train 2) Meditate 3) Fight 4) Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    character.train();
                    break;
                case 2:
                    character.meditate();
                    break;
                case 3:
                    character.fight();
                    break;
                case 4:
                    playing = false;
                    break;
                default:
                    System.out.println("Invalid action. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}