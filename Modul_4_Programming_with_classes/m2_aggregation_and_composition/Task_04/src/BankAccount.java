public class BankAccount {

    private final String numberAccount;
    private double money;
    private boolean lock = false;

    public BankAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }


    public double getMoney() {
        if (!lock)
            return money;
        else
            return 0;
    }

    public void plusMoney(double money) {
        if (!lock)
            this.money += money;
        else {
            System.out.println("Операция невозможна, счет заблокирован");
        }
    }

    public void dissMoney(double money) {
        if (!lock) {
            if (this.money - money < -1000) {
                System.out.println("Превышен размер кредита!");
            } else {

                this.money -= money;
                System.out.println(money + " снято со счета");
                System.out.println("Балланс = " + this.money);
            }
        } else System.out.println("Операция невозможна, счет заблокирован");
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public boolean getLock() {
        return lock;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public String toString() {
        if (!lock)
            return "Счет " + numberAccount + "; Балланс = " + money;
        else
            return "Счет " + numberAccount + " заблокирован";
    }
}