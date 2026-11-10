import java.util.Scanner;

public class RPSGame {
    private Player player;
    private Player computer;
    Scanner keyboard = new Scanner(System.in);

    public RPSGame(Player player, Player computer) {
        this.player = player;
        this.computer = computer;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getComputer() {
        return computer;
    }

    public String winner() {
        String human = player.getChoice();
        String clanker = RPSRules.randomChoice();
        if (RPSRules.beats(human, clanker)) {
            return player.getName();
        } else {
            if (human.equals(clanker)) {
                return "tie";
            } else {
                return "Computer";
            }
        }
    }

    public static int readRounds(Scanner input) {
        Scanner type = new Scanner(System.in);
        System.out.println("How many rounds?");
        int rounds = type.nextInt();
        type.nextLine();

        type.close();
    }
}
