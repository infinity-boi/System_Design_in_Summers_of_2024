package GS09_DesignPatterns.BehavioralDP.ObserverDP.Observer;

public class StatusBar implements Observer {
    private Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
        stock.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("StatusBar: Stock " + stock.getSymbol() + " price updated to " + stock.getPrice());
    }
}
