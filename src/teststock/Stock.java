/*
 * Exercise 8.2 from the Liang Java Textbook 8E
 * Comprehensive Version
 */


package teststock;

/**
 *
 * @author Clint Sharp
 */
public class Stock {
    
    String symbol;
    String name;
    double previousClosingPrice = 0;
    double currentPrice = 0;
    
    public Stock() {
    }
    public Stock(String stockSymbol, String stockName) {
        symbol = stockSymbol;
        name = stockName;
    }
    
    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
    
}
