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
        computer.choose(RPSRules.randomChoice());
        String clanker = computer.getChoice();

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

    public String describeOutcome() {
        String human = player.getChoice();
        computer.choose(RPSRules.randomChoice());
        String clanker = computer.getChoice();

        if (RPSRules.beats(human, clanker)) {
            return human + " beats " + clanker + ", you win!";
        } else if (RPSRules.beats(clanker, human)) {
            return clanker + " beats " + human + ", you lose!";
        } else {
            return "both chose " + human + ", tied!";
        }
    }

    public static int readRounds(Scanner input) {
        System.out.println("How many rounds?");
        int rounds = input.nextInt();
        input.nextLine();
        return rounds;
    }

    public static int readRoundsChecked(Scanner input) {
        while (!input.hasNextInt()) {
            input.next();
        }
        int rounds = input.nextInt();
        input.nextLine();
        return rounds;
    }
}