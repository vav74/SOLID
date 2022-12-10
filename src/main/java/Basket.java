public class Basket {
    private final Purchase[] purchases;

    public Basket(Price price) {
        this.purchases = new Purchase[price.getSize()];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Price price) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Purchase purchase : purchases) {
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * price.getPriceByTitle(purchase.title)) + " руб.");
            sum += (long) purchase.count * price.getPriceByTitle(purchase.title);
        }
        return sum;
    }
}