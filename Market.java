import java.util.ArrayList;

public class Market {
    ArrayList<Stock> stocks = new ArrayList<>();

    public Market() {
        stocks.add(new Stock("TCS", "Tata Consultancy", 3500));
        stocks.add(new Stock("INFY", "Infosys", 1500));
        stocks.add(new Stock("RELI", "Reliance", 2400));
    }

    public void showMarket() {
        System.out.println("📈 Market Stocks:");
        for (Stock s : stocks) {
            s.displayStock();
        }
    }
}
