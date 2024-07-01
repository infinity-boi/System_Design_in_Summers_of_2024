package PracticeQuestions.Observer;

public class StockListView implements Observer {
    private Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
        stock.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("StockListView: Stock " + stock.getSymbol() + " price updated to " + stock.getPrice());
    }
}

