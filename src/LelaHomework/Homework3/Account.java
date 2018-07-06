package LelaHomework.Homework3;


public class Account {

    int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }


    public int payMoney(int money) {
        System.out.println("How much money do you want to pay?");
        System.out.println("Your account balance is" + " " + accountBalance);

        accountBalance += money;
        System.out.println("Your account balance is now" + " " + accountBalance);


        return accountBalance;
    }

    public int withdrawMoney(int money) {
        System.out.println("How much money do you want to withdraw?");
        System.out.println("Your account balance is" + " " + accountBalance);
        if (accountBalance - money <= 0) {
            System.out.println("Sorry, you can`t withdraw money");
            System.out.println("Your account balance is" + " " + accountBalance);
        } else {
            accountBalance -= money;
            System.out.println("Your account balance is now" + " " + accountBalance);

        }
        return accountBalance;
    }
}
