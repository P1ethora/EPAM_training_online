import java.util.Arrays;
import java.util.Comparator;

public class AggregationСustomer {

    Customer[] customers;

    public AggregationСustomer() {
        customers = new Customer[]{new Customer("Сергеев", "Валерий", "Николаевич", "Жукова", 2020456438, 122356778),
                new Customer("Ульдинович", "Виталий", "Витольдович", "Пеньязькова", 343532234, 99554332),
                new Customer("Клименко", "Владимир", "Валерьевич", "Маршала", 235345225, 99994430),
                new Customer("Никаноров", "Ярослав", "Евгеньевич", "Фрунзе", 393223423, 10003211),
                new Customer("Бородин", "Вячеслав", "Аркадьевич", "Амурская", 884389922, 49302432)};
    }

    public void sortLastName() {
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName));
        for (Customer a : customers) System.out.println(a);
    }

    public void findCreditCardBetweenNumbers(long start, long end) {

        for (Customer customer : customers) {
            if (customer.getCreditCard() >= start && customer.getCreditCard() <= end)
                System.out.println(customer);
        }
    }
}