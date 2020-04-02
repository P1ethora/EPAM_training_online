/**
 * Создать класс Payment c внутренним классом, с помощью объектов кторого можно сформировать покупку
 * из нескольких товаров.
 */

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Item item1 = payment.new Item("Computer", 500.0);
        Payment.Item item2 = payment.new Item("Phone", 400.0);
        Payment.Item item3 = payment.new Item("Laptop", 450.0);

        System.out.println("Full price = " + payment.bay(item1, item2, item3) + "$");
    }
}