import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Price price = new Price();
        price.add("Хлеб", 56);
        price.add("Масло", 153);
        price.add("Колбаса", 211);
        price.add("Пирожок", 45);
        price.print();
        Basket basket = new Basket(price);
        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(product, count);
        }
        long sum = basket.sum(price);
        System.out.println("ИТОГО: " + sum);
    }
}