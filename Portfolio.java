import java.util.HashMap;

public class Portfolio {
    double balance = 100000;
    HashMap<String, Integer> holdings = new HashMap<>();

    public void buyStock(String symbol, int qty, double price) {
        double cost = qty * price;
        if (cost <= balance) {
            balance -= cost;
            holdings.put(symbol, holdings.getOrDefault(symbol, 0) + qty);
            System.out.println("Stock Bought Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void showPortfolio() {
        System.out.println("Portfolio:");
        for (String key : holdings.keySet()) {
            System.out.println(key + " : " + holdings.get(key));
        }
        System.out.println("Balance: Rs." + balance);
    }
}
