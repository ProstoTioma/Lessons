package lesson8.accounts;

public class CheckingAccount extends Account {
    int limitOFExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOFExpences) {
        super(bankName, ownerName, moneyAmount);
        this.limitOFExpenses = limitOFExpences;
    }

    void withdraw(int amount) {
        if(amount > limitOFExpenses) {
            return;
        }
        moneyAmount -= amount;
    }
}
