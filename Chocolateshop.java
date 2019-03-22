/* Buying chocolate
Implement function buyChocolate(int dollars), that returns the number of chocolate bars
you can afford with the given amount of dollars, provided that one bar can be bought with 
either one dollar, or three chocolate wraps (you get one wrap per chocolate).*/

public class Chocolateshop {
    public static void main(String[] args) {
    }

    public static int buyChocolate(int dollars) {
        int bars = dollars;
        int ChocoAction = ((dollars - (dollars % 3)) / 3);
        int result = bars + ChocoAction;
        if (ChocoAction < 3) {
            return result;
        } else {
            int additionalQantity = buyChocolate(ChocoAction);
            return ++result;
        }
    }
}


