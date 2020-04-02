import java.util.HashMap;

public class Trip {

    private String type;
    private String transport;
    private boolean food;
    private int numberDays;
    private double price;

    private HashMap<String, Double> types = new HashMap<>();
    private HashMap<String, Double> transports = new HashMap<>();

    public Trip(String type, String transport, boolean food, int numberDays) {

        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberDays = numberDays;

        types.put("Отдых", 30.0);
        types.put("Экскурсия", 40.0);
        types.put("Лечение", 25.0);
        types.put("Шоппинг", 100.0);
        types.put("Круиз", 120.0);

        transports.put("Автобус", 20.0);
        transports.put("Самолет", 150.0);
        transports.put("Поезд", 15.0);
        transports.put("Микроавтобус", 25.0);

        price = (types.get(type) * numberDays) + transports.get(transport);
        if (food)
            price += 15 * numberDays;

    }

    public HashMap<String, Double> getTypes() {
        return types;
    }

    public HashMap<String, Double> getTransports() {
        return transports;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Путевка - " + type + "; Транспорт - " + transport + "; Питание - " + food + "; Дней - " + numberDays + "; Цена - " + price + "$";
    }
}