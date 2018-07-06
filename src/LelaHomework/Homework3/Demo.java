package LelaHomework.Homework3;

public class Demo {
    public static void main(String[] args) {
        DispoAccount dispoAccount = new DispoAccount(0);
        dispoAccount.setCredit(100);
        System.out.println(dispoAccount.payMoney(50));
        System.out.println(dispoAccount.withdrawMoney(100));

    }
}
