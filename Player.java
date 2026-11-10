public class Player {
    private String name;
    private String choice;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public boolean choose(String typed) {
        if (typed.equals(null)) {
            return false;
        } else {
            return RPSRules.isValidChoice(typed);
        }
    }

    public String toString() {
        String words = name + " chose " + choice.toLowerCase() + ".";
        return words;
    }
}
