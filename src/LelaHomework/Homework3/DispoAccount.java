package LelaHomework.Homework3;

public class DispoAccount extends Account {
    private double credit;


    public void setCredit(double credit) {
        this.credit = credit;
    }

    public DispoAccount(int accountBalance) {
        super(accountBalance);
    }

    @Override
    public double withdrawMoney(double money) {
        System.out.println("How much money do you want to withdraw?");
        System.out.println("Your account balance is" + " " + accountBalance);
        System.out.println();
        if (money >= accountBalance + credit) {
            System.out.println("Sorry, you can`t withdraw money");
        }
        if (money <= accountBalance) {
            accountBalance -= money;
            System.out.println("Operation was successful");
            System.out.println();
            System.out.println("Your account balance is now" + " " + accountBalance);
        }
        if(money >= accountBalance && money <= accountBalance + credit) {
            credit = money -= accountBalance;
            accountBalance -= money;
            System.out.println("Operation was successful");
            System.out.println();
            System.out.println("Your credit was activated, credit -" + " " + credit);
        }
        return accountBalance;
    }
}
