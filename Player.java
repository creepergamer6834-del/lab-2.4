public class Player {
    private String name;
    private String choice;

    public Player(String name) {
        this.name = name;
        this.choice = RPSRules.randomChoice();
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public boolean choose(String typed) {
        if (typed == null) {
            return false;
        }
        if (RPSRules.isValidChoice(typed.toLowerCase())) {
            this.choice = typed.toLowerCase();
            return true;
        }
        return false;
    }

    public String toString() {
        if (choice == null || choice.isEmpty()) {
            return name + " has not chosen yet.";
        }
        return name + " chose " + choice.toLowerCase() + ".";
    }
}