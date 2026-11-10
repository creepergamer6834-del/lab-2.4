/*
 * REQ 01: answer both questions before you write any other code.
 *
 * 1. The user types 3, presses Enter, types rock, and presses Enter.
 *    After int rounds = input.nextInt(); runs, what does
 *    input.nextLine() return? Explain why.
 *    Answer: rock since he typed rock then pressed enter
 * which is until the nextLine checks for.
 *
 * 2. In this lab, main makes one Scanner for the keyboard and passes
 *    it to each method that reads. Why not have each method make its
 *    own new Scanner(System.in)?
 *    Answer:
 */
public class RPSGameTester {
    public static void main(String[] args) {
        System.out.println("isValidChoice(\"rock\") (expect true): "
                + RPSRules.isValidChoice("rock"));
        System.out.println("isValidChoice(\"Rock\") (expect false): "
                + RPSRules.isValidChoice("Rock"));
    }
}
