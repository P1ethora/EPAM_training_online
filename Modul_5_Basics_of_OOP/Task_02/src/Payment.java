public class Payment {

    public double bay(Payment.Item... items) {
        double price = 0;

        for (Payment.Item item : items) {
            price += item.getPrice();
        }

        return price;
    }


    class Item {
        private String name;
        private double price;

        public Item(String itemName, double price) {
            this.name = itemName;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String itemName) {
            this.name = itemName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}