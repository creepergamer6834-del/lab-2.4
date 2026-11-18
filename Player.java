public class Player {
    private String name;
    private String choice;

    public Player(String name) {
        this.name = name;
        this.choice = "";
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
        if (RPSRules.isValidChoice(typed)) {
            this.choice = typed;
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