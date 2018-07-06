package LelaHomework.Homework3;

public class Demo {
    public static void main(String[] args) {
        DipsoAccount dipsoAccount = new DipsoAccount(0);
        dipsoAccount.setCredit(100);
        System.out.println(dipsoAccount.payMoney(300));
        System.out.println(dipsoAccount.withdrawMoney(400));


    }
}
