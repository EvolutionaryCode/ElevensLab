package github.org.evolutionarycode.elevens;

public class CardTester {
        /**
         * The main method in this class checks the Card operations for consistency.
         *	@param args is not used.
         */
        public static void main(String[] args) {
            Card card1 = new Card("6", "Hearts", 6);
            Card card2 = new Card("6", "Hearts", 6);
            Card card3 = new Card("Jack", "Hearts", 11);

            System.out.println(); // #BlankLine

            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "-------[This the the practice cards values!]-------" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE_BOLD + card1.toString() + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE_BOLD + card2.toString() + ConsoleColors.RESET);
            System.out.println(ConsoleColors.BLUE_BOLD + card3.toString() + ConsoleColors.RESET);

            System.out.println(); // #BlankLine

            System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "-------[What Card Match?]-------" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BRIGHT + "Card 1 and Card 2 should match: " + ConsoleColors.RESET + ConsoleColors.BLUE_BOLD + card2.matches(card1) + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN_BRIGHT + "Card 2 and Card 3 should not match: " + ConsoleColors.RESET + ConsoleColors.BLUE_BOLD + !card2.matches(card3) + ConsoleColors.RESET);
        }

}
