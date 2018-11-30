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

            System.out.println("-------[This the the practice cards values!]-------");
            System.out.println(card1.toString());
            System.out.println(card2.toString());
            System.out.println(card3.toString());

            System.out.println(); // #BlankLine

            System.out.println("-------[What Card Match?]-------");
            System.out.println("Card 1 and Card 2 should match: " + card2.matches(card1));
            System.out.println("Card 2 and Card 3 should not match: " + !card2.matches(card3));
        }

}
