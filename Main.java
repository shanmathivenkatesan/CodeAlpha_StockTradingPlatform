import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Market market = new Market();
        Portfolio portfolio = new Portfolio();

        while (true) {
            System.out.println("\n1.View Market 2.Buy Stock 3.View Portfolio 4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    market.showMarket();
                    break;

                case 2:
                    System.out.print("Enter Stock Symbol: ");
                    String sym = sc.next();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    portfolio.buyStock(sym, qty, 1500); // sample price
                    break;

                case 3:
                    portfolio.showPortfolio();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);
            }
        }
    }
}
