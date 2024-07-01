package PracticeQuestions.Observer;

//5. Observer Pattern
//Exercise We’re building an application for watching the price of various stocks. There are two places in our application where we need to display the stocks: - StatusBar: shows the popular stocks - StockListView: shows the complete list of stocks When the price of a stock changes, the corresponding views (StatusBar and/or StockListView) need to be refreshed to reflect the latest price. Our application currently does not have the ability to communicate the change in stock prices to the corresponding views. Use the observer pattern to solve this problem.


public class Main {
    public static void main(String[] args) {
        Stock appleStock = new Stock("AAPL", 150.00);

        StatusBar statusBar = new StatusBar(appleStock);
        StockListView stockListView = new StockListView(appleStock);

        appleStock.setPrice(151.00); // This should notify both StatusBar and StockListView
        appleStock.setPrice(152.00); // This should notify both StatusBar and StockListView
    }
}

