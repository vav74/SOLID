import java.util.HashMap;
import java.util.Map;

public class Price {
    protected HashMap<String, Integer> products = new HashMap<>();

    public void add(String title, int price) {
        products.put(title, price);
    }

    public int getSize() {
        return products.size();
    }

    public void print() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }

    public int getPriceByTitle(String title) {
        return products.get(title);
    }
}