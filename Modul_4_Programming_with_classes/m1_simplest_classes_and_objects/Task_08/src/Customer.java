public class Customer {

    private static int count = 1;
    private int id = 0;

    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private long creditCard;
    private long bankAccount;

    public Customer(String lastName, String firstName, String middleName, String address, long creditCard, long bankAccount) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;

        id = count++;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName + "; адрес - " + address +
                "; Кредитная карта - " + creditCard + "; Банковсчий счет - " + bankAccount;
    }
}