import java.util.ArrayList;

public class Client implements Management {
    public static int id = 0;
    private int ClientId = 0;
    private String firstName;
    private String secondName;
    private BankAccount bankAccount;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public Client(String firstName, String secondName, BankAccount bankAccount) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.bankAccount = bankAccount;
        this.ClientId = id++;
        bankAccounts.add(bankAccount);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}