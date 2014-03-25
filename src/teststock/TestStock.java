/*
 * Exercise 8.2 from the Liang Java Textbook 8E
 * Comprehensive Version
 */


package teststock;

/**
 *
 * @author Clint Sharp
 */
public class TestStock {


    public static void main(String[] args) {
        Stock stock = new Stock("Java", "Sun Microsystems Inc.");
        stock.previousClosingPrice = 4.50;
        stock.currentPrice = 4.35;
        
        System.out.println("Previous closing price is: " + stock.previousClosingPrice);
        System.out.println("Current closing price is: " + stock.currentPrice);
        System.out.println("Percent change is: " + stock.getChangePercent());
        
        
    }
    
}
